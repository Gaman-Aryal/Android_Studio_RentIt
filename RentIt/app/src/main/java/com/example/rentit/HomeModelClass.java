package com.example.rentit;

public class HomeModelClass {
    private int image;
    private String OwnerName;
    private String location;

    public HomeModelClass(int image, String ownerName, String location) {
        this.image = image;
        OwnerName = ownerName;
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public String getLocation() {
        return location;
    }
}
