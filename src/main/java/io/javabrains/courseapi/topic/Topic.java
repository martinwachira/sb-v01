package io.javabrains.courseapi.topic;

import java.time.LocalDate;
import java.util.Date;

public class Topic {

    private String id;
    private String name;
    private String description;
    private LocalDate createdAt;

    public Topic() {
    }

    public Topic(String id, String name, String description, LocalDate createdAt) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDate createdAt){
        this.createdAt = createdAt;
    }


}
