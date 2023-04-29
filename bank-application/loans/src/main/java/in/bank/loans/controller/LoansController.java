package in.bank.loans.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import in.bank.loans.model.Loans;
import in.bank.loans.config.LoansConfigService;
import in.bank.loans.model.ConfigProps;
import in.bank.loans.model.Customers;
import in.bank.loans.repository.LoansRepository;

@RestController
public class LoansController {

	@Autowired
	LoansRepository loansRepository;
	
	@Autowired
	LoansConfigService configService;
	
	@PostMapping("/loans")
	public List<Loans> getByLoanId(@RequestBody Customers customers)
	{
		List<Loans> loans=loansRepository.findByCustomerId(customers.getCustomerId());
		return loans;
	}
	
	@GetMapping("/loans/ConfigProps")
	public String getPropertyDetails() throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

		ConfigProps properties = new ConfigProps(configService.getMsg(), configService.getBuildVersion(),
				configService.getMailDetails(), configService.getActiveBranches());

		String jsonStr = ow.writeValueAsString(properties);
		return jsonStr;

	}
	
	
	
	
	
	
}
