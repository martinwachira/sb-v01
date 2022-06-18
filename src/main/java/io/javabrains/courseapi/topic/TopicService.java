package io.javabrains.courseapi.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("1", "Spring Boot", "SB Desc"),
            new Topic("2", "Crypto Currency", "Crypto Desc"),
            new Topic("3", "Artificial Intelligence", "AI Desc"),
            new Topic("4", "Money Marketing", "MM Desc"),
            new Topic("5", "Space", "Space Desc")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

}
