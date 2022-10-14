package com.example.thebestpizza.objects;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class Pizza extends Dish {

    Pizza(int price,String title, String description, Drawable image){
        super(price,title,description,image);
    }
}
