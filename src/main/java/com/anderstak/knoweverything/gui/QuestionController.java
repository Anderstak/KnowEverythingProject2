package com.anderstak.knoweverything.gui;

import com.anderstak.knoweverything.Application;
import com.anderstak.knoweverything.topic.entities.Card;
import com.anderstak.knoweverything.topic.entities.Topic;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class QuestionController implements Initializable {


    public TextField TextQuestion;
    public Button btBackQuestion;
    public Label LabelQuestion;
    public Button btForwardBackQuestion;
    public ImageView ImageQuestion;


    private final Topic topic = Application.currentTopic;
    private Card card;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        this.setCard(topic.getCurrentCard());
        this.updateButtons();

        btBackQuestion.setOnAction(event -> {
            System.out.println("back pressed");
            this.setCard(topic.getPreviousCard());
            this.updateButtons();
        });

        btForwardBackQuestion.setOnAction(event -> {
            System.out.println("forward pressed");
            this.setCard(topic.getNextCard());
            this.updateButtons();
        });

    }

    private void updateButtons() {

    }

    public void setCard(Card card) {
        if (card == null) {
            throw new RuntimeException("Такой карточки нет! Это было неожиданно...");
        }
        this.card = card;
        this.LabelQuestion.setText(card.getName());
        this.ImageQuestion.setImage(card.getImage());
        this.TextQuestion.setText(card.getText());
    }

    public Card getCard() {
        return card;
    }
}



// TODO: сделать аналогично



