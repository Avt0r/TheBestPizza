package com.example.thebestpizza.objects;

import android.media.Image;

public abstract class Item {
    protected final int price;
    protected final String title;
    protected final String description;
    protected final Image image;

    Item(int price, String title, String description, Image image){
        this.price = price;
        this.title = title;
        this.description = description;
        this.image = image;
    }
}
