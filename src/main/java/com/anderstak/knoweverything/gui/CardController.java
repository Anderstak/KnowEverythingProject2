package com.anderstak.knoweverything.gui;

import com.anderstak.knoweverything.Application;
import com.anderstak.knoweverything.topic.entities.Card;
import com.anderstak.knoweverything.topic.entities.Topic;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.awt.*;
import java.awt.image.RenderedImage;
import java.net.URL;
import java.util.ResourceBundle;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class CardController implements Initializable {

    // TODO: Заменить на что-нибудь другое, например,  TextField
    
    public Button btBackMid;
    public Label btLMid;
    public Button btForwardMid;

    // TODO: Поменяй разметку у карточек, иначе выглядит ужасно
    public ImageView ImageMid;
    public Label LNameCard;

    private final Topic topic = Application.currentTopic;
    public Text TextCard;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        this.setCard(topic.getCurrentCard());
        this.updateButtons();

        btBackMid.setOnAction(event -> {
            System.out.println("back pressed");
            this.setCard(topic.getPreviousCard());
            this.updateButtons();
        });

        btForwardMid.setOnAction(event -> {
            System.out.println("forward pressed");
            this.setCard(topic.getNextCard());
            this.updateButtons();
        });

    }

    void updateButtons() {

        // TODO: update buttons!
        if (this.topic.currentCard==0) {//сравниваем два числа
            // disable back button
            this.btBackMid.setDisable(true);
        }else{
            this.btBackMid.setDisable(false);
        }

        if (this.topic.currentCard==this.topic.getCardSize()-1) { //условие того, что это последняя карточка
            // disable forward
            this.btForwardMid.setDisable(true);
        }else{
            this.btForwardMid.setDisable(false);
        }
    }



    void setCard(Card card) {
        if (card == null) {
            throw new RuntimeException("Такой карточки нет! Это было неожиданно...");
        }

        this.LNameCard.setText(card.getName());
        this.ImageMid.setImage(card.getImage());
        this.TextCard.setText(card.getText());
    }

}
