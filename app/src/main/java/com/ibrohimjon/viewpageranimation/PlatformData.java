package com.ibrohimjon.viewpageranimation;

/**
 * Created by Ibrohimjon on 11.04.2020.
 */
public class PlatformData {

    public int imageId;
    public String name;

    public PlatformData(){

    }

    public PlatformData(int imageId, String name) {
        this.imageId = imageId;
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
