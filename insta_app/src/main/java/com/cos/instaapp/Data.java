package com.cos.instaapp;


public class Data {
    private int image;
    private String username;
    private String content;

    public Data(int image, String username, String content) {
        this.image = image;
        this.username = username;
        this.content = content;
    }

    public int getImage() {
        return image;
    }

    public String getUsername() {
        return username;
    }

    public String getContent() {
        return content;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
