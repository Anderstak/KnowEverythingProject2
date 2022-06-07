package com.anderstak.knoweverything.topic;

import com.anderstak.knoweverything.Application;
import com.anderstak.knoweverything.topic.entities.Card;
import com.anderstak.knoweverything.topic.entities.Question;
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


        Topic emperors = new Topic("Императоры", "Все императоры вкратце и очень доступно и понятно без регистраций и смс ");
        Card first  = new Card("Павел 1");
        first.setText("1801г Дворцовый переворот. Убийство Павла 1");
        first.setImage(new File(Application.class.getResource("gui/pics/emperors/Pavel1.jpg").getFile()));
        emperors.addCard(first);
        Card second = new Card("Александр 1");
        second.setText("Александр 1 1801-1825. Создание священного союза 1815(Российская империя, Австрия, Пруссия");
        second.setImage(new File(Application.class.getResource("gui/pics/emperors/Alexandr1.jpg").getFile()));
        emperors.addCard(second);
        Card third = new Card("Николай 1");
        third.setText("Николай 1 Павлович 1825-1855гг. Восстание декабристов 1825");
        third.setImage(new File(Application.class.getResource("gui/pics/emperors/Nikolay1.jpg").getFile()));
        emperors.addCard(third);
        Card fourth = new Card("Александр 2");
        fourth.setText("Александр 2 1855-1881г. Он отменил крепостное право в 1861г. В Российской империи считалось позорно, что мы имели до сих пор крепостное право, по сравнению с Европой ");
        fourth.setImage(new File(Application.class.getResource("gui/pics/emperors/Alexandr2.jpg").getFile()));
        emperors.addCard(fourth);
        Card fifth = new Card("Александр 3");
        fifth.setText("Александр 3 1881-1894. Начало строительство Транссибирской магистрали 1891г. ");
        fifth.setImage(new File(Application.class.getResource("gui/pics/emperors/Alexandr3.jpg").getFile()));
        emperors.addCard(fifth);
        Question firstt = new Question();
        firstt.setText("В каком году было убийство Павла 1");
        firstt.setImage(new File(Application.class.getResource("gui/pics/emperors/Pavel1.jpg").getFile()));
        firstt.setAnswer("1861г");
        emperors.addQuestion(firstt);
        Application.topicService.addTopic(emperors);

        Topic PeopleAreGiants = new Topic("ЛЮДИ ГИГАНТЫ", "Люди гиганты вкратце и очень доступно и понятно без регистраций и смс ");
        Card P1  = new Card("Гай Юлий Вер Максимин Фракиец (Бюст императора в музее Рима)");
        P1.setText("Известный, как император Максимин Первый. Он поднялся с самых низов армейского сословия. Фракиец правил Римской Империей на протяжении трёх лет — с 235 по 238 год нашей эры. Его рост составлял 249 см.");
        P1.setImage(new File(Application.class.getResource("gui/pics/Giants/GaiusJuliusVerusMaximinustheThracian.png.jpg").getFile()));
        PeopleAreGiants.addCard(P1);
        Card P2 = new Card("Финский солдат Вейно Мюллиринне");
        P2.setText("Рост финского великана, который родился в 1909г. составлял 256 см. Вейно прошёл службу в армии и до сих пор считается самым высоким солдатом в истории человечества");
        P2.setImage(new File(Application.class.getResource("gui/pics/Giants/VeinoMullirinne.png.jpg").getFile()));
        PeopleAreGiants.addCard(P2);
        Card P3 = new Card("Американец Роберт Вадлоу");
        P3.setText("Роберт Вадлоу родившийся в 1918 году и имевшего рост 2 метра 72 сантиметра. Рекорд был зафиксирован  в возрасте 22 года за 15 дней до смерти. На похоронной процессии гроб Роберта Вадлоу несли 12 человек, а могила по желанию его родителей была забетонирована, чтоб тело не выкрали.");
        P3.setImage(new File(Application.class.getResource("gui/pics/Giants/RobertWadlow.png.jpg").getFile()));
        PeopleAreGiants.addCard(P3);
        Card P4 = new Card("Ангус Макаскилл");
        P4.setText("К 20 летнему возрасту его рост достигал более 2 метров и вес около 200 килограмм. Его фигура была идеально сложена, у него огромная сила, он поднимал якоря в 1000кг.");
        P4.setImage(new File(Application.class.getResource("gui/Giants/Giants/AngusMacAskill.jpg").getFile()));
        PeopleAreGiants.addCard(P4);
        Card P5 = new Card("Федор Махнов, жил в Российской империи");
        P5.setText("При весе 182 килограмма его рост был 285 сантиметров!\n" +
                "К 14-летнему возрасту 2-метровый юноша перестал вмещаться в доме. Отцу пришлось из-за этого нарастить на несколько венцов стены. Местному кузнецу заказали изготовление индивидуальной кровати, однако тот, перегруженный работой, делал ее целое лето. В конце-концов выяснилось, что Федя перерос и эту кровать.\n");
        P5.setImage(new File(Application.class.getResource("gui/Giants/FyodorMakhnov.png.jpg").getFile()));
        PeopleAreGiants.addCard(P5);

        Question p1 = new Question();
        p1.setText("Он поднялся с самых низов армейского сословия. Фракиец правил Римской Империей на протяжении трёх лет. Кто это?");
        p1.setImage(new File(Application.class.getResource("gui/pics/Giants/GaiusJuliusVerusMaximinustheThracian.jpg").getFile()));
        p1.setAnswer("Гай Юлий Вер Максимин Фракиец ");
        emperors.addQuestion(p1);
        Question p2 = new Question();
        p2.setText("Какой национальности был солдат Вейно");
        p2.setImage(new File(Application.class.getResource("gui/pics/Giants/VeinoMullirinne.jpg").getFile()));
        p2.setAnswer("Фин");
        emperors.addQuestion(p2);
        Question p3 = new Question();
        p3.setText("Почему забетонировали гроб с телом Роберта Вадлоу");
        p3.setImage(new File(Application.class.getResource("gui/pics/Giants/RobertWadlow.jpg").getFile()));
        p3.setAnswer("Что б тело не выкрали для научных исследований в области гигантизма людей");
        emperors.addQuestion(p3);
        Question p4 = new Question();
        p4.setText("Кто мог поднимать якоря в 1000кг?");
        p4.setImage(new File(Application.class.getResource("gui/pics/Giants/AngusMacAskill.jpg").getFile()));
        p4.setAnswer("Это был Ангус Макаскилл");
        emperors.addQuestion(p4);
        Question p5 = new Question();
        p5.setText("Подросток Федя Махонов мог поместиться в обычной кровати");
        p5.setImage(new File(Application.class.getResource("gui/pics/Giants/FyodorMakhnov.jpg").getFile()));
        p5.setAnswer("Нет. Для него сделали индивидуальную кровать и Федя перерос ее(((");
        emperors.addQuestion(p5);
        Application.topicService.addTopic(PeopleAreGiants);





    }

}
