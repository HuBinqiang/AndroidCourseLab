package com.hubinqiang.lab;

/**
 * Created by hu on 2017/3/25.
 */

public class Lab3ListAnimal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private int imageID;

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public int getImageID() {
        return imageID;
    }

    public Lab3ListAnimal(String name, int imageID) {

        this.imageID = imageID;

        this.name = name;

    }
}
