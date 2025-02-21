package motivation.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import motivation.api.model.Quote;
import motivation.api.service.QuoteService;

@RestController
public class QuoteController {
	QuoteService quoteService;
	
	public QuoteController(QuoteService quoteService) {
		this.quoteService = quoteService;
	}
	
	@GetMapping("/getQuote")
	public Quote quote() {
		return quoteService.getQuote();
	}
}
