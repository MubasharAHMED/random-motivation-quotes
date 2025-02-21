package motivation.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import motivation.api.model.Quote;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Integer>{
}
