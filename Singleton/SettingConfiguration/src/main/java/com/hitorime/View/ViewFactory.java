package com.hitorime.View;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ViewFactory {

    Stage primaryStage;

    public ViewFactory(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void start() throws IOException {

        URL rootResource = getClass().getClassLoader().getResource("fxml/Setting.fxml");
        Parent root = FXMLLoader.load(rootResource);

        URL iconResource = getClass().getClassLoader().getResource("image/torii-icon.png");
        Image icon = new Image(iconResource.toString());

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Setting");
        primaryStage.getIcons().add(icon);
        primaryStage.show();

    }

}
