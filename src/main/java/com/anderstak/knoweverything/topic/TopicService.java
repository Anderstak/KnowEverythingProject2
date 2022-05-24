package com.anderstak.knoweverything.topic;

import com.anderstak.knoweverything.topic.entities.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getTopics() {
        return this.topicRepository.findAll();
    }

    public void addTopic(Topic topic) {
        this.topicRepository.save(topic);
    }
}



