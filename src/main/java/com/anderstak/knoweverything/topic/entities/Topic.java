package com.anderstak.knoweverything.topic.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Topic() {

    }

    public Topic(String nameTopic, String text) {
        this.nameTopic = nameTopic;
        this.text = text;
    }

    // имя
    private String nameTopic = "Названеи темы";
    // описание
    private String text = "Описание темы";

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Card> cards = new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Question> questions = new ArrayList<>();

    public String getNameTopic() {
        return nameTopic;
    }

    public String getText() {
        return text;
    }

    public List<Card> getCards() {
        return this.cards;
    }

    public void addCard(Card c) {
        this.cards.add(c);
    }

    public int currentCard = 0;
    public int currentQuestion = 0;

    public int getCardSize() {
        return this.cards.size();
    }

    public int getQuestionSize() {
        return this.questions.size();
    }


    public Card getPreviousCard() {
        if (this.currentCard >= 1) {
            this.currentCard -= 1;
            return this.cards.get(this.currentCard);
        } else {
            return null;
        }
    }

    public Card getNextCard() {
        if (this.currentCard <= this.cards.size()) {
            this.currentCard += 1;
            return this.cards.get(this.currentCard);
        } else {
            return null;
        }
    }

    public Card getCurrentCard() {
        if (this.currentCard >= this.cards.size()) {
            this.currentCard = 0;
        }
        return this.cards.get(this.currentCard);
    }

    public Question getPreviousQuestion() {
        // TODO: аналогично, как с карточками
        if (this.currentQuestion >= 1) {
            this.currentQuestion = this.currentQuestion - 1;
            return this.questions.get(this.currentQuestion);
        } else {
            return null;
        }
    }

    public Question getNextQuestion() {
        // TODO: аналогично, как с карточками
        if (this.currentQuestion >= 1) {
            this.currentQuestion += 1;
            return this.questions.get(this.currentQuestion);
        } else {
            return null;
        }
    }

    public void addQuestion(Question firstt) {
        this.questions.add(firstt);
    }

    public Question getCurrentQuestion() {
        if (this.currentQuestion >= this.questions.size()) {
            this.currentQuestion = 0;
        }
        return this.questions.get(this.currentQuestion);

    }
}
