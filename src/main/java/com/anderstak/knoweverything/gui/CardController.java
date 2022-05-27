package com.anderstak.knoweverything.gui;

import com.anderstak.knoweverything.topic.entities.Card;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class CardController implements Initializable {
    public TextArea TextMid;
    public Button btBackMid;
    public Label btLMid;
    public Button btForwardMid;
    public ImageView ImageMid;
    public Label LNameCard;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btBackMid.setOnAction(event -> {
            System.out.println("back pressed");
        });

        btForwardMid.setOnAction(event -> {
            System.out.println("forward pressed");
        });
//        if (this.btForwardMid >= 1){
//            return new Card();
//        }

        Card a = new Card("Крепостное право");
        a.setText("Let decabrists win!");
        //c.setImage(new Image(String.valueOf(getClass().getResource("pics/serfage.jpg"))));
        File serfage = new File("pics/serfage.jpg");
        BufferedImage image1 = ImageIO.read(serfage);
        this.setCard(a);



        Card b = new Card("ХАХАХАХА");
        b.setText("MEM!");
        File GV = new File("pics/GV.jpg");
        BufferedImage image2 = ImageIO.read(GV);
        this.setCard(b);
        //c.setImage(new Image(String.valueOf(getClass().getResource("pics/GV.jpg"))));
        this.setCard(b);

        Card c = new Card("kkk");
        c.setText("15 марта 1889 г. 15 марта 1889 г.");
        File eiffel_tower = new File("C:\\Users\\Admin\\Documents\\Курсы\\java\\ПРОЕКТ JAVA\\Эйфеваля башня JPEG");
        BufferedImage imagew3 = ImageIO.read(eiffel_tower);
        this.setCard(c);
        //c.setImage(new Image(String.valueOf(getClass().getResource("pics/GV.jpg"))));
        this.setCard(c);
    }



    void setCard(Card card) {
        this.LNameCard.setText(card.getName());
        //this.ImageMid.setImage(card.getImage());
        this.TextMid.setText(card.getText());
    }

}
