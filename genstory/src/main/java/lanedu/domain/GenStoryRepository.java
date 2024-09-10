package lanedu.domain;

import lanedu.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
<<<<<<< HEAD
@RepositoryRestResource(collectionResourceRel="genStories", path="genStories")
public interface GenStoryRepository extends PagingAndSortingRepository<GenStory, Long>{
}
=======
@RepositoryRestResource(
    collectionResourceRel = "genStories",
    path = "genStories"
)
public interface GenStoryRepository
    extends PagingAndSortingRepository<GenStory, Long> {}
>>>>>>> refs/remotes/origin/main
