package guru.springframework.mongo.service;

import guru.springframework.mongo.domain.QuoteHistory;
import guru.springframework.mongo.model.Quote;
import reactor.core.publisher.Mono;

/**
 * Created by jt on 4/18/21.
 */
public interface QuoteHistoryService {

    Mono<QuoteHistory> saveQuoteToMongo(Quote quote);
}
