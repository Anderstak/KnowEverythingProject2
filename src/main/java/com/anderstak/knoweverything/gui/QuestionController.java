package com.anderstak.knoweverything.gui;

import com.anderstak.knoweverything.Application;
import com.anderstak.knoweverything.topic.entities.Card;
import com.anderstak.knoweverything.topic.entities.Question;
import com.anderstak.knoweverything.topic.entities.Topic;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
    public Button btShowCard;
    public Button btTrue;
    public Button btFalse;



    public Text ShowAnswer;
    private Question question;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        this.setQuestion(topic.getCurrentQuestion());
        this.updateButtons();

        btBackQuestion.setOnAction(event -> {
            System.out.println("back pressed");
            this.setQuestion(topic.getPreviousQuestion());
            this.updateButtons();
        });

        btForwardBackQuestion.setOnAction(event -> {
            System.out.println("forward pressed");
            this.setQuestion(topic.getNextQuestion());
            this.updateButtons();
        });

        btShowCard.setOnAction(event -> {
            System.out.println("Forward");
            this.ShowAnswer.setText(this.question.getAnswer());
            this.updateButtons();
            this.btShowCard.setDisable(true);
        });

    }

    private void updateButtons() {
        // TODO: update buttons!
        if (this.topic.currentQuestion == 0) {//сравниваем два числа
            // disable back button
            this.btBackQuestion.setDisable(true);
        } else {
            this.btBackQuestion.setDisable(false);
        }


        if (this.topic.currentQuestion == this.topic.getQuestionSize() - 1) { //условие того, что это последняя карточка
            // disable forward
            this.btForwardBackQuestion.setDisable(true);
        } else {
            this.btForwardBackQuestion.setDisable(false);
        }
    }




    public void setQuestion(Question question) {
        if (question == null) {
            throw new RuntimeException("Такой вопроса нет! Это было неожиданно...");
        }
        this.question = question;
        this.LabelQuestion.setText(question.getName());
        this.ImageQuestion.setImage(question.getImage());
        this.TextQuestion.setText(question.getText());
    }

    public Question getQuestion() {
        return question;
    }
}



// TODO: сделать аналогично



