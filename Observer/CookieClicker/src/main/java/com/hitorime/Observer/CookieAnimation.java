package com.hitorime.Observer;

import com.hitorime.Interface.Observer;
import com.hitorime.Model.Cookie;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;


public class CookieAnimation implements Observer {

    AnchorPane root;
    Image cookieImageFile;

    public CookieAnimation(Cookie cookie, AnchorPane root) {
        this.root = root;
        this.cookieImageFile = cookie.getCookieImageFile();
    }

    public void animateFallingCookie() {
        int min = 25;
        int max = (int) root.getWidth() - min;
        double x = min + (Math.random() * (max - min) );

        ImageView cookie = new ImageView(cookieImageFile);
        cookie.setFitWidth(min);
        cookie.setPreserveRatio(true);
        root.getChildren().add(cookie);

        TranslateTransition translate = new TranslateTransition(Duration.seconds(0.5), cookie);
        translate.setFromX(x);
        translate.setFromY(0);
        translate.setToX(x);
        translate.setToY(root.getHeight() - min);
        translate.setInterpolator(Interpolator.LINEAR);
        translate.setOnFinished(event -> root.getChildren().remove(cookie));
        translate.play();
    }

    @Override
    public void update() {
        animateFallingCookie();
    }

}
