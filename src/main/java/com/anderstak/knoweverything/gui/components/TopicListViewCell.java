package com.anderstak.knoweverything.gui.components;

import com.anderstak.knoweverything.topic.entities.Topic;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class TopicListViewCell extends HBox {

    @FXML
    Label topicNameLabel;

    @FXML
    Label descriptionLabel;

    public TopicListViewCell() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TopicListViewCell.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setTopic(Topic topic) {
        this.topicNameLabel.setText(topic.getNameTopic());
        this.descriptionLabel.setText(topic.getText());
    }


}
