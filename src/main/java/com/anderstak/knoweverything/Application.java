package com.anderstak.knoweverything;

import com.anderstak.knoweverything.topic.TopicService;
import com.anderstak.knoweverything.topic.entities.Topic;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class Application extends javafx.application.Application {

    public static TopicService topicService;
    private static ConfigurableApplicationContext context;

    @Override
    public void start(Stage stage) throws IOException {

        context = SpringApplication.run(Application.class);
        topicService = context.getBean(TopicService.class);
        topicService.addTopic(new Topic());

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("gui/TopicScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Знай все!!!");
        stage.setScene(scene);
        stage.show();



    }

    @Override
    public void stop() throws Exception {
        super.stop();
        context.close();
    }

    public static void main(String[] args) {
        launch();
    }
}