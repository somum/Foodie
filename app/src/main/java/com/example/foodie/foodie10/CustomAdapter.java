package com.example.foodie.foodie10;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by SOMUM on 11/10/2016.
 */

public class CustomAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] name;
    private final Integer[]imgid;

    public CustomAdapter(Activity context,String[] name, Integer[] imgid) {
        super(context,R.layout.mylist, name);
        this.context = context;
        this.name = name;
        this.imgid = imgid;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist,null,true);
        TextView txtTitle= (TextView) rowView.findViewById(R.id.item_name);
        ImageView imageView= (ImageView) rowView.findViewById(R.id.list_item);

        txtTitle.setText(name[position]);
        imageView.setImageResource(imgid[position]);

        return rowView;

    }
}

