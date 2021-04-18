package guru.springframework.mongo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * Created by jt on 4/18/21.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class QuoteHistory {

    @Id
    private String id;
    private String ticker;
    private BigDecimal price;
    private Instant instant;
}
