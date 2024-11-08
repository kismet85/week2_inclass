package com.ismet.week2_inclass;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Locale.setDefault(new Locale("en", "UK"));

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));


        ResourceBundle bundle = ResourceBundle.getBundle("message", Locale.getDefault());
        fxmlLoader.setResources(bundle);

        Scene scene = new Scene(fxmlLoader.load(), 300, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
