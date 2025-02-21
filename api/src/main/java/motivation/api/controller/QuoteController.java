package motivation.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import motivation.api.service.QuoteService;

@Controller
public class QuoteController {
	QuoteService quoteService;
	
	public QuoteController(QuoteService quoteService) {
		this.quoteService = quoteService;
	}
	
	@GetMapping("/getQuote")
	public String quote() {
		return "quotetemplate";
	}
	
	
}
