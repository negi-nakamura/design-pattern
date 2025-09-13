package com.hitorime.Model;

public class Setting {

    private boolean lightMode;
    private boolean notificationEnabled;
    private boolean autoSave;
    private boolean debugMode;
    private boolean locationEnabled;
    private boolean autoCompletion;

    public Setting() {
        setDefaultSetting();
    }

    public boolean getLightMode() {
        return lightMode;
    }

    public void setLightMode(boolean lightMode) {
        this.lightMode = lightMode;
    }

    public boolean getNotificationEnabled() {
        return notificationEnabled;
    }

    public void setNotificationEnabled(boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
    }

    public boolean getAutoSave() {
        return autoSave;
    }

    public void setAutoSave(boolean autoSave) {
        this.autoSave = autoSave;
    }

    public boolean getDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }

    public boolean getLocationEnabled() {
        return locationEnabled;
    }

    public void setLocationEnabled(boolean locationEnabled) {
        this.locationEnabled = locationEnabled;
    }

    public boolean getAutoCompletion() {
        return autoCompletion;
    }

    public void setAutoCompletion(boolean autoCompletion) {
        this.autoCompletion = autoCompletion;
    }

    public void setDefaultSetting() {
        setLightMode(false);
        setNotificationEnabled(false);
        setAutoSave(false);
        setDebugMode(false);
        setLocationEnabled(false);
        setAutoCompletion(false);
    }

    @Override
    public String toString() {
        return "Settings{" +
                "lightMode=" + lightMode +
                ", notificationEnabled=" + notificationEnabled +
                ", autoSave=" + autoSave +
                ", debugMode=" + debugMode +
                ", locationEnabled=" + locationEnabled +
                ", autoCompletion=" + autoCompletion +
                '}';
    }

}
