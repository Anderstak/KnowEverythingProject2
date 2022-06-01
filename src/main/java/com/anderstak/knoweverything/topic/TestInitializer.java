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
        Card b = new Card("Hello.");
        b.setText("Крепостное право");
        b.setImage(new File(Application.class.getResource("gui/pics/Serfage.jpg").getFile()));
        t.addCard(b);
        Application.topicService.addTopic(t);

        Application.topicService.clearAllTopics();
        Topic emperors = new Topic();
        Card first  = new Card("Императоры");
        first.setText("1801г Дворцовый переворот. Убийство Павла 1");
        first.setImage(new File(Application.class.getResource("gui/pics/emperors/Павел 1.jpg").getFile()));
        emperors.addCard(first);
        Card second = new Card("Императоры");
        second.setText("Александр 1 1801-1825. Создание священного союза 1815(Российская империя, Австрия, Пруссия");
        second.setImage(new File(Application.class.getResource("gui/pics/emperors/Александр 1.jpg").getFile()));
        Card third = new Card("Императоры");
        third.setText("Николай 1 Павлович 1825-1855гг. Восстание декабристов 1825");
        third.setImage(new File(Application.class.getResource("gui/pics/emperors/Николай 1.jpg").getFile()));
        Card fourth = new Card("Императоры");
        fourth.setText("Александр 2 1855-1881г. Он отменил крепостное право в 1861г. В Российской империи считалось позорно, что мы имели до сих пор крепостное право, по сравнению с Европой ");
        fourth.setImage(new File(Application.class.getResource("gui/pics/emperors/Александр 2.jpg").getFile()));
        Card fifth = new Card("Императоры");
        fifth.setText("Александр 3 1881-1894. Начало строительство Транссибирской магистрали 1891г. ");
        fifth.setImage(new File(Application.class.getResource("gui/pics/emperors/Александр 3.jpg").getFile()));
        Application.topicService.addTopic(emperors);




    }

}
