package com.anderstak.knoweverything.topic.entities;

import com.anderstak.knoweverything.Util;
import javafx.scene.image.Image;
import javafx.scene.image.PixelFormat;

import javax.imageio.ImageIO;
import javax.persistence.*;
import java.awt.image.RenderedImage;
import java.io.*;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name = "";

    private String text = "";

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] image;

    public Card() {

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

    public Card(String name) {
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

