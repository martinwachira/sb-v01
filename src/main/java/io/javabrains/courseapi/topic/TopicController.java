package io.javabrains.courseapi.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("1", "Spring Boot", "SB Desc"),
                new Topic("2", "Crypto Currency", "Crypto Desc"),
                new Topic("3", "Artificial Intelligence", "AI Desc"),
                new Topic("4", "Money Marketing", "MM Desc")
        );

    }
}
