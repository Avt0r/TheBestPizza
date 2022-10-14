package com.example.thebestpizza.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.thebestpizza.R;
import com.example.thebestpizza.adapters.BannerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView bannerList;
    List<Drawable> images = new ArrayList<>();

    @SuppressLint({"ResourceType", "UseCompatLoadingForDrawables"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        images.add(getDrawable(R.drawable.img));
        images.add(getDrawable(R.drawable.img_1));
        images.add(getDrawable(R.drawable.img_2));
        images.add(getDrawable(R.drawable.img_3));
        bannerList = findViewById(R.id.bannerList);
        BannerAdapter adapter = new BannerAdapter(this, images);
        bannerList.setAdapter(adapter);
    }
}