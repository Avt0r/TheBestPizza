package com.example.thebestpizza.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.thebestpizza.R;
import com.example.thebestpizza.objects.Item;

public class ItemAdapter extends ArrayAdapter <Item>  {

    public ItemAdapter(Context context, int res){
        super(context,res);
    }

    @SuppressLint("InflateParams")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.dish_list_item, null);
        }
        Item item = getItem(position);
        ImageView image = convertView.findViewById(R.id.item_image);
        TextView title = convertView.findViewById(R.id.item_title);
        TextView description = convertView.findViewById(R.id.item_description);
        image.setImageDrawable(item.getImage());
        description.setText(item.getDescription());
        title.setText(item.getTitle());
        return convertView;
    }
}
