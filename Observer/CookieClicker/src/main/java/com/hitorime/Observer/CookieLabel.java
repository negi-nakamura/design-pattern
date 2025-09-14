package com.hitorime.Observer;

import com.hitorime.Interface.Observer;
import com.hitorime.Model.Cookie;
import javafx.scene.control.Label;

public class CookieLabel implements Observer {

    private Cookie cookie;
    private Label cookieCountLabel;

    public CookieLabel(Cookie cookie, Label cookieCountLabel) {
        this.cookie = cookie;
        this.cookieCountLabel = cookieCountLabel;
    }

    public void updateCookieCounter() {
        cookieCountLabel.setText(cookie.getClickCount() + " cookies");
    }

    @Override
    public void update() {
        updateCookieCounter();
    }

}
