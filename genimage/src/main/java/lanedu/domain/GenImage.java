package lanedu.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lanedu.GenimageApplication;
import lombok.Data;

@Entity
@Table(name = "GenImage_table")
@Data
//<<< DDD / Aggregate Root
public class GenImage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String imageUrl;

    public static GenImageRepository repository() {
        GenImageRepository genImageRepository = GenimageApplication.applicationContext.getBean(
            GenImageRepository.class
        );
        return genImageRepository;
    }

    //<<< Clean Arch / Port Method
    public static void generateImage(StoryGenerated storyGenerated) {
        //implement business logic here:

        /** Example 1:  new item 
        GenImage genImage = new GenImage();
        repository().save(genImage);

        */

        /** Example 2:  finding and process
        
        repository().findById(storyGenerated.get???()).ifPresent(genImage->{
            
            genImage // do something
            repository().save(genImage);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
