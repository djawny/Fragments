package com.example.daniel.fragments.Model;

import java.io.Serializable;

public class Product implements Serializable {

    static final String TABLE_NAME = "products";

    private int mId;

    private String mName;

    private int mPrice;

    private String mImageName;

    public Product() {
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Id= ");
        stringBuilder.append(mId);
        stringBuilder.append("\nName= ");
        stringBuilder.append(mName);
        stringBuilder.append("\nPrice= ");
        stringBuilder.append(mPrice);
        stringBuilder.append("\nImageName= ");
        stringBuilder.append(mImageName);
        return stringBuilder.toString();
    }

    public Product(String mName, int mPrice) {
        this.mName = mName;
        this.mPrice = mPrice;
    }

    public Product(String mName, int mPrice, String mImageName) {
        this.mName = mName;
        this.mPrice = mPrice;
        this.mImageName = mImageName;
    }

    public Product(int mId, String mName, int mPrice, String mImageName) {
        this.mId = mId;
        this.mName = mName;
        this.mPrice = mPrice;
        this.mImageName = mImageName;
    }

    public int getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public int getmPrice() {
        return mPrice;
    }

    public String getmImageName() {
        return mImageName;
    }
}
