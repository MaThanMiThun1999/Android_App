package com.example.namakkaltourism.dataModel;

public class LocationData {
    int image;
    String name;
    String state;

    public LocationData(int image, String name, String state) {
        this.image = image;
        this.name = name;
        this.state = state;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
