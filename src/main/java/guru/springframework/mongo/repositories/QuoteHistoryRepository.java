package guru.springframework.mongo.repositories;

import guru.springframework.mongo.domain.QuoteHistory;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by jt on 4/18/21.
 */
public interface QuoteHistoryRepository extends ReactiveMongoRepository<QuoteHistory, String> {
}
