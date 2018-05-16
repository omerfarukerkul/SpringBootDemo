package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository repository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        repository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return repository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        repository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        repository.save(topic);
    }

    public void deleteTopic(Topic topic,String id) {
        repository.delete(topic);
    }
}