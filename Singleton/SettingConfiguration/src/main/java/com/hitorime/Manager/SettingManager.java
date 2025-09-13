package com.hitorime.Manager;

import com.google.gson.Gson;
import com.hitorime.Model.Setting;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class SettingManager {

    private static SettingManager instance;
    private Setting setting;
    private File FILE_SETTING_CONFIGURATION_JSON;

    private SettingManager() {

    }

    public static SettingManager getInstance() {
        if(instance == null) instance = new SettingManager();
        return instance;
    }

    public void setFileSettingConfiguration(File file) {
        FILE_SETTING_CONFIGURATION_JSON = file;
    }

    private File getFileSettingConfiguration() {
        return FILE_SETTING_CONFIGURATION_JSON;
    }

    private void setSetting(Setting setting) {
        this.setting = setting;
    }

    public Setting getSetting() {
        return setting;
    }

    public void loadFileSettingConfiguration() {
        try {
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(FILE_SETTING_CONFIGURATION_JSON);
            setting = gson.fromJson(fileReader, Setting.class);
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveFileSettingConfiguration() {
        try {
            Gson gson = new Gson();
            FileWriter fileWriter = new FileWriter(FILE_SETTING_CONFIGURATION_JSON);
            gson.toJson(setting, fileWriter);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void resetFileSettingConfiguration() {
        setting.setDefaultSetting();
        saveFileSettingConfiguration();
    }

}
