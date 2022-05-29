package com.anderstak.knoweverything.topic;

import com.anderstak.knoweverything.Application;
import com.anderstak.knoweverything.topic.entities.Card;
import com.anderstak.knoweverything.topic.entities.Topic;

import java.io.File;
import java.io.IOException;

public class TestInitializer {

    // TODO: написать здесь заполнение одной темой с несколькими (не менее 3) карточек

    public static void initWithSampleData() throws IOException {

        Application.topicService.clearAllTopics();
        Topic t = new Topic();
        Card c = new Card("Hello.");
        c.setText("Everyone needs a tortured friend.");
        c.setImage(new File(Application.class.getResource("gui/pics/GV.jpg").getFile()));
        t.addCard(c);
        Application.topicService.addTopic(t);

    }

}
