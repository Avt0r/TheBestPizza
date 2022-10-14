package com.example.thebestpizza.objects;

import android.graphics.drawable.Drawable;
import android.media.Image;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Item{

    private final List<Dish> dishList = new ArrayList<>();

    Combo(int price,String title, String description, Drawable image){
        super(price,title,description,image);
    }
    Combo(int price, String title, String description, Drawable image, List<Dish> dishList){
        super(price,title,description,image);
        fillCombo(dishList);
    }

    public void fillCombo(List<Dish> dishList){
        this.dishList.addAll(dishList);
    }
}
