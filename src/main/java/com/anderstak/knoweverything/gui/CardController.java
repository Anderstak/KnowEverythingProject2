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

        Card c = new Card("Крепостное право");
        c.setText("Let decabrists win!");
        //c.setImage(new Image(String.valueOf(getClass().getResource("pics/serfage.jpg"))));
        this.setCard(c);

        Card b = new Card("ХАХАХАХА");
        c.setText("MEM!");
        //c.setImage(new Image(String.valueOf(getClass().getResource("pics/GV.jpg"))));
        this.setCard(c);

    }

    void setCard(Card card) {
        this.LNameCard.setText(card.getName());
        //this.ImageMid.setImage(card.getImage());
        this.TextMid.setText(card.getText());
    }

}
