package lanedu.domain;

import lanedu.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
<<<<<<< HEAD
@RepositoryRestResource(collectionResourceRel="genImages", path="genImages")
public interface GenImageRepository extends PagingAndSortingRepository<GenImage, Long>{
}
=======
@RepositoryRestResource(collectionResourceRel = "genImages", path = "genImages")
public interface GenImageRepository
    extends PagingAndSortingRepository<GenImage, Long> {}
>>>>>>> refs/remotes/origin/main
