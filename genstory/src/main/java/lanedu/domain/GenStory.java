package lanedu.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lanedu.GenstoryApplication;
import lombok.Data;

@Entity
@Table(name = "GenStory_table")
@Data
//<<< DDD / Aggregate Root
public class GenStory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String story;

    public static GenStoryRepository repository() {
        GenStoryRepository genStoryRepository = GenstoryApplication.applicationContext.getBean(
            GenStoryRepository.class
        );
        return genStoryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void generateStory(AiUsed aiUsed) {
        //implement business logic here:

        /** Example 1:  new item 
        GenStory genStory = new GenStory();
        repository().save(genStory);

        */

        /** Example 2:  finding and process
        
        repository().findById(aiUsed.get???()).ifPresent(genStory->{
            
            genStory // do something
            repository().save(genStory);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
