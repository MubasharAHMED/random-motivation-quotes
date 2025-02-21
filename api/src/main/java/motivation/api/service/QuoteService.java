package motivation.api.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import motivation.api.model.Quote;
import motivation.api.repository.QuoteRepository;

@Service
public class QuoteService {
	QuoteRepository quoteRepository;
	
	public QuoteService(QuoteRepository quoteRepository) {
		this.quoteRepository =quoteRepository;
	}
	
	public Quote getQuote() {
		List<Quote> quotes =  quoteRepository.findAll();
		
		if (quotes.isEmpty())  {
			return null;
		}
		
		Random random = new Random();
		
		return quotes.get(random.nextInt(quotes.size()));
		
	}
}
