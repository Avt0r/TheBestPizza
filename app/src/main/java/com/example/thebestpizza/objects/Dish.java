package com.example.thebestpizza.objects;

import android.media.Image;

public abstract class Dish extends Item{
    Dish(int price, String title, String description, Image image){
        super(price,title,description,image);
    }
}
