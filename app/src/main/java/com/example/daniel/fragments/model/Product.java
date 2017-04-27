package com.example.daniel.fragments.model;

import java.io.Serializable;

public class Product implements Serializable {

    private int mId;

    private String mName;

    private int mPrice;

    private String mImageName;

    @Override
    public String toString() {
        return "Id= " +
                mId +
                "\nName= " +
                mName +
                "\nPrice= " +
                mPrice +
                "\nImageName= " +
                mImageName;
    }

    public Product(int mId, String mName, int mPrice, String mImageName) {
        this.mId = mId;
        this.mName = mName;
        this.mPrice = mPrice;
        this.mImageName = mImageName;
    }
}
