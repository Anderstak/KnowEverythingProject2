package com.anderstak.knoweverything.topic;

import java.util.List;

import com.anderstak.knoweverything.topic.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    //List<Definition> findByWord(String word);

}
