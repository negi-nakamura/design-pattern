package com.hitorime;

import com.hitorime.View.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        ViewFactory viewFactory = new ViewFactory(primaryStage);
        viewFactory.start();

    }
}