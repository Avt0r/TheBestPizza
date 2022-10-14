package com.example.thebestpizza.objects;

import android.graphics.drawable.Drawable;
import android.media.Image;

public abstract class Item {
    protected final int price;
    protected final String title;
    protected final String description;
    protected final Drawable image;

    Item(int price, String title, String description, Drawable image){
        this.price = price;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public Drawable getImage() {
        return image;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
}
