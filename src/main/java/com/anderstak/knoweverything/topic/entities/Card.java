package com.anderstak.knoweverything.topic.entities;

import javafx.scene.image.Image;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name = "";

    private String text = "";

//    private Image image;

    public String getName() {
        return name;
    }

//    public Image getImage() {
//        return image;
//    }

    public Card(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

//    public void setImage(Image image) {
//        this.image = image;
//    }
}

