package com.anderstak.knoweverything.topic.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    // имя
    private String nameTopic = "Исторические факты";
    // описание
    private String text = "Супер-пупер фактики.";

    private int currentCard = 0;

    //ArrayList Card

    @OneToMany(cascade=CascadeType.ALL)
    private List<Card> cards = new ArrayList<>();

    @OneToMany(cascade=CascadeType.ALL)
    private List<Question> questions = new ArrayList<>();

    public String getNameTopic() {
        return nameTopic;
    }

    public String getText() {
        return text;
    }

    public List<Card> getArrayList() {
        return this.cards;
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
        } else{
            return null;
        }
    }

    // эррейлист вопросов




}
