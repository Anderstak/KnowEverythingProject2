package com.anderstak.knoweverything.gui;

import com.anderstak.knoweverything.Application;
import com.anderstak.knoweverything.gui.components.TopicListViewCell;
import com.anderstak.knoweverything.topic.entities.Topic;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.EventObject;
import java.util.ResourceBundle;


public class TopicController implements Initializable {
    public ListView topicListView;
    public AnchorPane root;

    public final ObservableList<Topic> topics = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        topics.addAll(this.topics);
        this.topicListView.setItems(this.topics);

        this.topics.addAll(Application.topicService.getTopics());

        this.topicListView.setCellFactory(lv -> {
            ListCell<Topic> cell = new ListCell<Topic>() {
                @Override
                protected void updateItem(Topic item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        return;
                    }
                    TopicListViewCell c = new TopicListViewCell();
                    c.setTopic(item);
                    setGraphic(c);
                }
            };
            cell.setOnMouseClicked(e -> {
                if (!cell.isEmpty()) {
                    try {
                        this.topicSelected(e, (Topic) this.topicListView.getSelectionModel().getSelectedItem());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    e.consume();
                }
            });
            return cell;
        });
    }

    public void topicSelected(MouseEvent mouseEvent, Topic selectedItem) throws IOException {
        Application.currentTopic = selectedItem;

        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("CardScene.fxml")));
        Stage appStage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

}

