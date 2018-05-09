package com.bucketsoft.user.project5tourguideapp;

public class PointOfInterest {

    private static final int nullImage = -1;

    private String name;
    private String description;
    private int imageId;

    public PointOfInterest(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        this.imageId = imageId;
    }

    public PointOfInterest(String name, String description) {
        this.name = name;
        this.description = description;
        this.imageId = nullImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public boolean hasImage() {

        return (this.imageId != nullImage);

    }
}
