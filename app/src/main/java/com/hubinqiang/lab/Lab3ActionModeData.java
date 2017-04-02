package com.hubinqiang.lab;

/**
 * Created by hu on 2017/4/2.
 */

public class Lab3ActionModeData {

    public Lab3ActionModeData(int imageID, String name) {
        this.imageID = imageID;
        this.name = name;
    }

    public int getImageID() {
        return imageID;
    }

    public String getName() {
        return name;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int imageID;
    private String name;


}
