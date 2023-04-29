package in.bank.accounts.controller;
//this is going to be the controller of the whole application

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import in.bank.accounts.config.AccountsConfigService;
import in.bank.accounts.model.Accounts;
import in.bank.accounts.model.Customer;
import in.bank.accounts.model.ConfigProps;
import in.bank.accounts.repository.AccountsRepository;

@RestController
public class AccountsController {
	@Autowired
	private AccountsRepository accountsRepository;

	@Autowired
	AccountsConfigService configService;

//here we are going to create the APIs
	@PostMapping("/accounts")
	public Accounts getAccountDetails(@RequestBody Customer customer) {
		Accounts accounts = accountsRepository.getByCustomerId(customer.getCustomerId());
		return accounts;
	}

	@GetMapping("/accounts/ConfigProps")
	public String getPropertyDetails() throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

		ConfigProps properties = new ConfigProps(configService.getMsg(), configService.getBuildVersion(),
				configService.getMailDetails(), configService.getActiveBranches());

		String jsonStr = ow.writeValueAsString(properties);
		return jsonStr;

	}
}
