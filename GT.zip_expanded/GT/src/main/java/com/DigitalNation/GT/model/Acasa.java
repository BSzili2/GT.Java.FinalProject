package com.DigitalNation.GT.model;

public class Acasa {

    private String welcomeMessage;
    private String description;

    public Acasa(String welcomeMessage, String description) {
        this.welcomeMessage = welcomeMessage;
        this.description = description;
    }

    
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}