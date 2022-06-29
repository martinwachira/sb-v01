package io.javabrains.courseapi.topic;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<> (Arrays.asList(
            new Topic("1", "Spring Boot", "SB Desc", LocalDate.now()),
            new Topic("2", "Crypto Currency", "Crypto Desc", LocalDate.now()),
            new Topic("3", "Artificial Intelligence", "AI Desc", LocalDate.now()),
            new Topic("4", "Money Marketing", "MM Desc", LocalDate.now()),
            new Topic("5", "Space", "Space Desc", LocalDate.now())
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
       topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for(int i=0; i<topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
