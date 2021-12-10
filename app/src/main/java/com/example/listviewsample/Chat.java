package com.example.listviewsample;

public class Chat {
    String name,time;
    int icon,callIcon;

    public Chat(String name, String time, int icon, int callIcon) {
        this.name = name;
        this.time = time;
        this.icon = icon;
        this.callIcon = callIcon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getCallIcon() {
        return callIcon;
    }

    public void setCallIcon(int callIcon) {
        this.callIcon = callIcon;
    }
}
