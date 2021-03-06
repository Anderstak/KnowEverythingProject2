package com.anderstak.knoweverything.gui;

import com.anderstak.knoweverything.Application;
import com.anderstak.knoweverything.topic.entities.Card;
import com.anderstak.knoweverything.topic.entities.Question;
import com.anderstak.knoweverything.topic.entities.Topic;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.security.cert.PolicyNode;
import java.util.EventObject;
import java.util.ResourceBundle;


public class QuestionController implements Initializable {
    public Button btBackQuestion;
    public Label LabelQuestion;
    public Button btForwardBackQuestion;
    public ImageView ImageQuestion;


    private final Topic topic = Application.currentTopic;
    public Button btShowCard;
    public Button btTrue;
    public Button btFalse;


    public Text ShowAnswer;
    public Text HowManyCorrectAnswer;
    public Text WrongAnswer;
    public Button ChoiceOfTopics;
    public Text TextQuestion;
    private Question question;

    int AllAnswer = 0;
    int CorrectAnswer = 0;
    int UnCorrectAnswer = 0;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        this.setQuestion(topic.getCurrentQuestion());
        this.updateButtons();

        btBackQuestion.setOnAction(event -> {
            this.btShowCard.setDisable(false);
            ShowAnswer.setText("");
            this.updateButtons();
        });

        btForwardBackQuestion.setOnAction(event -> {
            this.btShowCard.setDisable(false);
            ShowAnswer.setText("");
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


        btTrue.setOnAction(event -> {
            this.btShowCard.setDisable(false);
            ShowAnswer.setText("");
            System.out.println("Correct");
            this.setQuestion(topic.getNextQuestion());
            this.CorrectAnswer = CorrectAnswer + 1;
            this.AllAnswer = AllAnswer + 1;
            HowManyCorrectAnswer.setText(CorrectAnswer + "/" + AllAnswer);
            this.updateButtons();
        });

        btFalse.setOnAction(event -> {
            this.btShowCard.setDisable(false);
            ShowAnswer.setText("");
            System.out.println("false");
            this.setQuestion(topic.getNextQuestion());
            this.UnCorrectAnswer = UnCorrectAnswer +1;
            this.AllAnswer = AllAnswer + 1;
            WrongAnswer.setText(AllAnswer - CorrectAnswer + "/" + AllAnswer);
            this.updateButtons();
        });
    }

    private void updateButtons() {
        this.btBackQuestion.setDisable(true);
        this.btForwardBackQuestion.setDisable(true);


        if (this.topic.currentQuestion == this.topic.getQuestionSize() - 1) { //?????????????? ????????, ?????? ?????? ?????????????????? ????????????????
            // disable forward
            this.btTrue.setDisable(true);
        } else {
            this.btTrue.setDisable(false);
        }

        if (this.topic.currentQuestion == this.topic.getQuestionSize() - 1) {
            this.btFalse.setDisable(true);
        } else {
            this.btFalse.setDisable(false);
        }
    }




    public void setQuestion(Question question) {
        if (question == null) {
            throw new RuntimeException("???????????? ?????????????? ??????! ?????? ???????? ????????????????????...");
        }
        this.question = question;
        this.LabelQuestion.setText(question.getName());
        this.ImageQuestion.setImage(question.getImage());
        this.TextQuestion.setText(question.getText());
    }

    public Question getQuestion() {
        return question;
    }


    public void setChoiceOfTopics(ActionEvent actionEvent) throws IOException {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("TopicScene.fxml")));
        Stage appStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }
}

