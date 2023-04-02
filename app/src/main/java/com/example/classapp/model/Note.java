package com.example.classapp.model;

import java.util.Date;

public class Note {
    private int id;
    private String title;
    private String body;
    private String image;
    private float latitude;
    private float longitude;
    private Date date;

    public Note(int id, String title, String body, String image, float latitude, float longitude,Date date) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.image = image;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
