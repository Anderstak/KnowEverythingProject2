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
        fifth.setText("Александр 3 1881-1894. Начало строительство Транссибирской магистрали 1891г. Железная дорога между Челябинском и Владивостоком, соединяющая европейскую часть России с крупнейшими восточносибирскими и дальневосточными промышленными городами.");
        fifth.setImage(new File(Application.class.getResource("gui/pics/emperors/Alexandr3.jpg").getFile()));
        emperors.addCard(fifth);

        Question firstt = new Question();
        firstt.setText("В каком году было убийство Павла 1?");
        firstt.setImage(new File(Application.class.getResource("gui/pics/emperors/Pavel1.jpg").getFile()));
        firstt.setAnswer("1861г");
        emperors.addQuestion(firstt);
        Question secondd = new Question("");
        secondd.setText("Какие страны вошли в Священный союз?");
        secondd.setImage(new File(Application.class.getResource("gui/pics/emperors/Alexandr1.jpg").getFile()));
        secondd.setAnswer("Российская империя, Австрия, Пруссия");
        emperors.addQuestion(secondd);
        Question thirdd = new Question("");
        thirdd.setText("При каком императоре произошло восстание декабристов 1825г?");
        thirdd.setImage(new File(Application.class.getResource("gui/pics/emperors/Nikolay1.jpg").getFile()));
        thirdd.setAnswer("При Николаи 1");
        emperors.addQuestion(thirdd);
        Question fourthh = new Question("");
        fourthh.setText("В каком году было отменено крепостное право?");
        fourthh.setImage(new File(Application.class.getResource("gui/pics/emperors/Alexandr2.jpg").getFile()));
        fourthh.setAnswer("В 1861");
        emperors.addQuestion(fourthh);
        Question fifthh = new Question("");
        fifthh.setText("От куда и до куда располагалась Транссибирская магистраль?");
        fifthh.setImage(new File(Application.class.getResource("gui/pics/emperors/Alexandr3.jpg").getFile()));
        fourthh.setAnswer("Между Челябинском и Владивостоком");
        emperors.addQuestion(fifthh);
        Application.topicService.addTopic(emperors);

        Topic PeopleAreGiants = new Topic("ЛЮДИ ГИГАНТЫ", "Люди гиганты вкратце и очень доступно и понятно без регистраций и смс ");
        Card P1  = new Card("Гай Юлий Вер Максимин Фракиец");
        P1.setText("Известный, как император Максимин Первый. Он поднялся с самых низов армейского сословия. Фракиец правил Римской Империей на протяжении трёх лет — с 235 по 238 год нашей эры. Его рост составлял 249 см.");
        P1.setImage(new File(Application.class.getResource("gui/pics/Giants/GaiusJuliusVerusMaximinustheThracian.png").getFile()));
        PeopleAreGiants.addCard(P1);
        Card P2 = new Card("Финский солдат Вейно Мюллиринне");
        P2.setText("Рост финского великана, который родился в 1909г. составлял 256 см. Вейно прошёл службу в армии и до сих пор считается самым высоким солдатом в истории человечества");
        P2.setImage(new File(Application.class.getResource("gui/pics/Giants/VeinoMullirinne.png").getFile()));
        PeopleAreGiants.addCard(P2);
        Card P3 = new Card("Американец Роберт Вадлоу");
        P3.setText("Роберт Вадлоу родившийся в 1918 году и имевшего рост 2 метра 72 сантиметра. Рекорд был зафиксирован  в возрасте 22 года за 15 дней до смерти. На похоронной процессии гроб Роберта Вадлоу несли 12 человек, а могила по желанию его родителей была забетонирована, чтоб тело не выкрали.");
        P3.setImage(new File(Application.class.getResource("gui/pics/Giants/RobertWadlow.png").getFile()));
        PeopleAreGiants.addCard(P3);
        Card P4 = new Card("Ангус Макаскилл");
        P4.setText("К 20 летнему возрасту его рост достигал более 2 метров и вес около 200 килограмм. Его фигура была идеально сложена, у него огромная сила, он поднимал якоря в 1000кг.");
        P4.setImage(new File(Application.class.getResource("gui/pics/Giants/AngusMacAskill.png").getFile()));
        PeopleAreGiants.addCard(P4);
        Card P5 = new Card("Федор Махнов, жил в Российской империи");
        P5.setText("При весе 182 килограмма его рост был 285 сантиметров!\n" +
                "К 14-летнему возрасту 2-метровый юноша перестал вмещаться в доме. Отцу пришлось из-за этого нарастить на несколько венцов стены. Местному кузнецу заказали изготовление индивидуальной кровати, однако тот, перегруженный работой, делал ее целое лето. В конце-концов выяснилось, что Федя перерос и эту кровать.\n");
        P5.setImage(new File(Application.class.getResource("gui/pics/Giants/FyodorMakhnov.png").getFile()));
        PeopleAreGiants.addCard(P5);
        Question p1 = new Question();
        p1.setText("Он поднялся с самых низов армейского сословия. Фракиец правил Римской Империей на протяжении трёх лет. Кто это?");
        p1.setImage(new File(Application.class.getResource("gui/pics/Giants/GaiusJuliusVerusMaximinustheThracian.png").getFile()));
        p1.setAnswer("Гай Юлий Вер Максимин Фракиец ");
        PeopleAreGiants.addQuestion(p1);
        Question p2 = new Question();
        p2.setText("Какой национальности был солдат Вейно");
        p2.setImage(new File(Application.class.getResource("gui/pics/Giants/VeinoMullirinne.png").getFile()));
        p2.setAnswer("Фин");
        PeopleAreGiants.addQuestion(p2);
        Question p3 = new Question();
        p3.setText("Почему забетонировали гроб с телом Роберта Вадлоу");
        p3.setImage(new File(Application.class.getResource("gui/pics/Giants/RobertWadlow.png").getFile()));
        p3.setAnswer("Что б тело не выкрали для научных исследований в области гигантизма людей");
        PeopleAreGiants.addQuestion(p3);
        Question p4 = new Question();
        p4.setText("Кто мог поднимать якоря в 1000кг?");
        p4.setImage(new File(Application.class.getResource("gui/pics/Giants/AngusMacAskill.png").getFile()));
        p4.setAnswer("Это был Ангус Макаскилл");
        PeopleAreGiants.addQuestion(p4);
        Question p5 = new Question();
        p5.setText("Подросток Федя Махонов мог поместиться в обычной кровати");
        p5.setImage(new File(Application.class.getResource("gui/pics/Giants/FyodorMakhnov.png").getFile()));
        p5.setAnswer("Нет. Для него сделали индивидуальную кровать и Федя перерос ее(((");
        PeopleAreGiants.addQuestion(p5);
        Application.topicService.addTopic(PeopleAreGiants);

        Topic musicians = new Topic("Композиторы", "Композиторы вкратце и очень доступно и понятно без регистраций и смс ");
        Card P11  = new Card("Шостакович Дмитрий Дмитриевич");
        P11.setText("Композитор – классик 20 века, великий маэстро и яркий художник.\n" +
                "Он был страстным болельщиком футбольного клуба «Зенит» и даже вел тетрадь учета всех игр и голов.\n" +
                "В 1947 г. Шостакович был избран депутатом Верховного Совета РСФСР (переизбирался в 1951, 1955, 1959 гг.).");
        P11.setImage(new File(Application.class.getResource("gui/pics/Musicians/ShostakovichDmitryDmitrievich.png").getFile()));
        musicians.addCard(P11);
        Card P22 = new Card("Михаил Иванович Глинка");
        P22.setText("Глинка Михаил Иванович  был лично знаком с Пушкиным А.С. и написал произведение к стихотворению Руслан и Людмила»\n");
        P22.setImage(new File(Application.class.getResource("gui/pics/Musicians/MikhailIvanovichGlinka.png").getFile()));
        musicians.addCard(P22);
        Card P33 = new Card("Сергей Васильевич Рахманинов\n");
        P33.setText("Первая симфония Рахманинова была провальной и подверглась жесткой критике, после этого он не сочинял более трех лет., к нормальной жизни композитора смог вернуть только психолог-гипнотизер Н. В. Даль.\n");
        P33.setImage(new File(Application.class.getResource("gui/pics/Musicians/SergeyVasilyevichRachmaninov.png").getFile()));
        musicians.addCard(P33);
        Card P44 = new Card("Николай Римский-Корсаков");
        P44.setText("Римский-Корсаков воспринимал музыку в виде цветов, \n" +
                "Мозг гениального композитора работал очень своеобразно – он утверждал, что видит музыку и звуки в целом, как определённые цвета\n");
        P44.setImage(new File(Application.class.getResource("gui/pics/Musicians/NikolaiRimsky-Korsakov.png").getFile()));
        musicians.addCard(P44);
        Card P55 = new Card("Сергей Сергеевич Прокофьев");
        P55.setText("Одним из увлечений Сергея Прокофьева были шахматы. Он говорил, что эта логическая игра стимулирует мышление и тем самым помогает ему сочинять музыку.\n" +
                "Наиболее масштабным произведением-опера “Война и мир”, основанную на одноимённом романе Льва Толстого. Работал он над ней целых 11 лет! У Толстого ушло меньше времени на то, чтобы написать сам этот роман.\n");
        P55.setImage(new File(Application.class.getResource("gui/pics/Musicians/SergeySergeyevichProkofiev.png").getFile()));
        musicians.addCard(P55);
        Question p11 = new Question();
        p11.setText("За какой футбольный клуб болел Шестакович?");
        p11.setImage(new File(Application.class.getResource("gui/pics/Musicians/ShostakovichDmitryDmitrievich.png").getFile()));
        p11.setAnswer("Зенит");
        musicians.addQuestion(p11);
        Question p22 = new Question();
        p22.setText("C каким великим поэтом был знаком Глинка?");
        p22.setImage(new File(Application.class.getResource("gui/pics/Musicians/MikhailIvanovichGlinka.png").getFile()));
        p22.setAnswer("C Пушкиным");
        musicians.addQuestion(p22);
        Question p33 = new Question();
        p33.setText("Почему Рахманинов более 3-х лет не сочинял музыку?");
        p33.setImage(new File(Application.class.getResource("gui/pics/Musicians/SergeyVasilyevichRachmaninov.png").getFile()));
        p33.setAnswer("Потому что первая симфония была раскритикована публикой.");
        musicians.addQuestion(p33);
        Question p44 = new Question();
        p44.setText("Как видел музыку и звуки Корсаков?");
        p44.setImage(new File(Application.class.getResource("gui/pics/Musicians/NikolaiRimsky-Korsakov.png").getFile()));
        p44.setAnswer("Видел в виде цвета");
        musicians.addQuestion(p44);
        Question p55 = new Question();
        p55.setText("Какое увлечение Прокофьеву помогало сочинять музыку?");
        p55.setImage(new File(Application.class.getResource("gui/pics/Musicians/SergeySergeyevichProkofiev.png").getFile()));
        p55.setAnswer("Шахматы");
        musicians.addQuestion(p55);
        Application.topicService.addTopic(musicians);





    }

}
