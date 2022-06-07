package com.anderstak.knoweverything.topic.entities;

import com.anderstak.knoweverything.Util;
import javafx.scene.image.Image;

import javax.persistence.*;
import java.io.File;
import java.io.IOException;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public Question(String name, String text, String answer) {
        this.name = name;
        this.text = text;
        this.answer = answer;
    }

    private String name = "";
    private String text = "";

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    private String answer = "";
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] image;

    public Question() {

    }
    public String getName() {
        return name;
    }


    public Image getImage() {
        try {
            Image im = Util.bytesToImage(this.image);
            System.out.println(im.getHeight());
            return im;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public Question(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImage(File image) throws IOException {
        this.image = Util.imageToBytes(image);
    }

}
