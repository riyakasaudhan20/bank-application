package in.bank.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import in.bank.cards.config.CardsConfigService;
import in.bank.cards.model.ConfigProps;

import in.bank.cards.model.Cards;
import in.bank.cards.model.Customers;
import in.bank.cards.repository.CardsRepository;

@RestController
public class CardsController {

	@Autowired
	CardsRepository cardsRepository;
	
	@Autowired
	CardsConfigService configService;
	
	@PostMapping("/cards")
	public List<Cards> getByCardId(@RequestBody Customers customers)
	{
		List<Cards> cards=cardsRepository.findByCustomerId(customers.getCustomerId());
		return cards;
	}
	

	@GetMapping("/cards/ConfigProps")
	public String getPropertyDetails() throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

		ConfigProps properties = new ConfigProps(configService.getMsg(), configService.getBuildVersion(),
				configService.getMailDetails(), configService.getActiveBranches());

		String jsonStr = ow.writeValueAsString(properties);
		return jsonStr;

	}
	
	
	
}
