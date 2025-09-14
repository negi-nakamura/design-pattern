package com.hitorime;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CookieClicker.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.setTitle("Cookie Clicker");
        primaryStage.getIcons().add(new Image(getClass().getResource("/image/torii-icon.png").toString()));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}