package com.hitorime.Model;

import com.hitorime.Interface.Observer;
import com.hitorime.Interface.Subject;
import com.hitorime.Observer.CookieAnimation;
import com.hitorime.Observer.CookieLabel;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class Cookie implements Subject {

    private int clickCount;
    private Image cookieImageFile;
    private ArrayList<Observer> observerArrayList;
    private CookieLabel cookieLabel;
    private CookieAnimation cookieAnimation;

    public Cookie(Label cookieLabel, AnchorPane root) {
        clickCount = 0;
        cookieImageFile = new Image(getClass().getResource("/image/cookie.png").toString() );
        this.observerArrayList = new ArrayList<>();
        this.cookieLabel = new CookieLabel(this, cookieLabel);
        this.cookieAnimation = new CookieAnimation(this, root);

        registerObserver(this.cookieLabel);
        registerObserver(this.cookieAnimation);
    }

    public int getClickCount() {
        return clickCount;
    }

    public void setClickCount(int clickCount) {
        this.clickCount = clickCount;
    }

    public Image getCookieImageFile() {
        return cookieImageFile;
    }

    public void setCookieImageFile(Image cookieImageFile) {
        this.cookieImageFile = cookieImageFile;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerArrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerArrayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        setClickCount(getClickCount() + 1);
        for(Observer observer : observerArrayList) {
            observer.update();
        }
    }

}
