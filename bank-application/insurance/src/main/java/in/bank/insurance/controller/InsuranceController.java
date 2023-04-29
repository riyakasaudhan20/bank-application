package in.bank.insurance.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import in.bank.insurance.config.InsuranceConfigService;
import in.bank.insurance.model.ConfigProps;

import in.bank.insurance.model.Insurance;
import in.bank.insurance.model.Customers;
import in.bank.insurance.repository.InsuranceRepository;

@RestController
public class InsuranceController {

	@Autowired
	InsuranceRepository insuranceRepository;
	
	@Autowired
	InsuranceConfigService configService;
	
	@PostMapping("/insurance")
	public List<Insurance> getByInsuranceId(@RequestBody Customers customers)
	{
		List<Insurance> insurance=insuranceRepository.findByCustomerId(customers.getCustomerId());
		return insurance;
	}
	

	@GetMapping("/insurance/ConfigProps")
	public String getPropertyDetails() throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

		ConfigProps properties = new ConfigProps(configService.getMsg(), configService.getBuildVersion(),
				configService.getMailDetails(), configService.getActiveBranches());

		String jsonStr = ow.writeValueAsString(properties);
		return jsonStr;

	}
	
	
	
}

