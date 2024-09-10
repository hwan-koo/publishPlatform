package lanedu.domain;

import lanedu.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
<<<<<<< HEAD
@RepositoryRestResource(collectionResourceRel="bookPurchases", path="bookPurchases")
public interface BookPurchaseRepository extends PagingAndSortingRepository<BookPurchase, Long>{
}
=======
@RepositoryRestResource(
    collectionResourceRel = "bookPurchases",
    path = "bookPurchases"
)
public interface BookPurchaseRepository
    extends PagingAndSortingRepository<BookPurchase, Long> {}
>>>>>>> refs/remotes/origin/main
