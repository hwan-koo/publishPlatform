package lanedu.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lanedu.BookpurchaseApplication;
import lombok.Data;

@Entity
@Table(name = "BookPurchase_table")
@Data
//<<< DDD / Aggregate Root
public class BookPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer price;

    private String status;

    private Long bookId;

    private String memberId;

    public static BookPurchaseRepository repository() {
        BookPurchaseRepository bookPurchaseRepository = BookpurchaseApplication.applicationContext.getBean(
            BookPurchaseRepository.class
        );
        return bookPurchaseRepository;
    }
}
//>>> DDD / Aggregate Root
