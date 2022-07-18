package io.javabrains.courseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    private List<Topic> topics = new ArrayList<> (Arrays.asList(
            new Topic("1", "Spring Boot", "SB Desc", LocalDate.now()),
            new Topic("2", "Crypto Currency", "Crypto Desc", LocalDate.now()),
            new Topic("3", "Artificial Intelligence", "AI Desc", LocalDate.now()),
            new Topic("4", "Money Marketing", "MM Desc", LocalDate.now()),
            new Topic("5", "Space", "Space Desc", LocalDate.now())
    ));

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id){
        return topicRepository.findById(id);
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
       topicRepository.save(topic);
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
        topicRepository.deleteById(id);
//        topics.removeIf(t -> t.getId().equals(id));
    }
}
