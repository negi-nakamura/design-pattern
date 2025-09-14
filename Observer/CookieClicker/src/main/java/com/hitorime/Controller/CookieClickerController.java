package com.hitorime.Controller;

import com.hitorime.Model.Cookie;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class CookieClickerController implements Initializable {

    private Cookie cookie;

    @FXML
    private AnchorPane cookie_clicker;
    @FXML
    private AnchorPane cookie_clicker_container;
    @FXML
    private Label cookie_clicker_title_label;
    @FXML
    private HBox cookie_clicker_counter_label_container;
    @FXML
    private Label cookie_clicker_counter_label;
    @FXML
    private ImageView cookie_image;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cookie = new Cookie(cookie_clicker_counter_label, cookie_clicker_container);
        onCookieClick();
    }

    public void onCookieClick() {
        cookie_image.setOnMouseClicked(event -> {
            cookie.notifyObservers();
        });
    }

}
