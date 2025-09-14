package com.hitorime.Controller;

import com.hitorime.Singleton.SettingManager;
import com.hitorime.Model.Setting;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class SettingController implements Initializable {

    SettingManager settingManager;
    Setting setting;
    File file;

    @FXML
    RadioButton light_mode_btn, notification_enabled_btn, auto_save_btn, debug_mode_btn, location_enabled_btn, auto_completion_btn;

    @FXML
    Button reset_btn, save_setting_btn;

    public SettingController() throws URISyntaxException {
        URL jsonResource = getClass().getClassLoader().getResource("json/setting.json");
        file = new File(jsonResource.toURI());
        initializeSetting(file);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        applySetting();
        applyListener();
    }

    public void initializeSetting(File file) {
        settingManager = SettingManager.getInstance();
        settingManager.setFileSettingConfiguration(file);
        settingManager.loadFileSettingConfiguration();
        setting = settingManager.getSetting();
    }

    public void applyListener() {
        changeLightMode();
        changeNotificationEnabled();
        changeAutoSave();
        changeDebugMode();
        changeLocationEnabled();
        changeAutoCompletion();
        resetSetting();
        saveSetting();
    }

    public void applySetting() {
        setLightMode();
        setNotificationEnabled();
        setAutoSave();
        setDebugMode();
        setLocationEnabled();
        setAutoCompletion();
    }

    public void setLightMode() {
        light_mode_btn.setSelected(setting.getLightMode());
    }

    private void setNotificationEnabled() {
        notification_enabled_btn.setSelected(setting.getNotificationEnabled());
    }

    public void setAutoSave() {
        auto_save_btn.setSelected(setting.getAutoSave());
    }

    public void setDebugMode() {
        debug_mode_btn.setSelected(setting.getDebugMode());
    }

    public void setLocationEnabled() {
        location_enabled_btn.setSelected(setting.getLocationEnabled());
    }

    public void setAutoCompletion() {
        auto_completion_btn.setSelected(setting.getAutoCompletion());
    }

    public void changeLightMode() {
        light_mode_btn.setOnAction(event -> {
            setting.setLightMode(light_mode_btn.isSelected());
        });
    }

    public void changeNotificationEnabled() {
        notification_enabled_btn.setOnAction(event -> {
            setting.setNotificationEnabled(notification_enabled_btn.isSelected());
        });
    }

    public void changeAutoSave() {
        auto_save_btn.setOnAction(event -> {
            setting.setAutoSave(auto_save_btn.isSelected());
        });
    }

    public void changeDebugMode() {
        debug_mode_btn.setOnAction(event -> {
            setting.setDebugMode(debug_mode_btn.isSelected());
        });
    }

    public void changeLocationEnabled() {
        location_enabled_btn.setOnAction(event -> {
            setting.setLocationEnabled(location_enabled_btn.isSelected());
        });
    }

    public void changeAutoCompletion() {
        auto_completion_btn.setOnAction(event -> {
            setting.setAutoCompletion(auto_completion_btn.isSelected());
        });
    }

    public void resetSetting() {
        reset_btn.setOnAction(event -> {
            settingManager.resetFileSettingConfiguration();
            applySetting();
            settingLog();
        });
    }

    public void saveSetting() {
        save_setting_btn.setOnAction(event -> {
            settingManager.saveFileSettingConfiguration();
            settingLog();
        });
    }

    public void settingLog() {
        System.out.println(setting.toString());
    }

}
