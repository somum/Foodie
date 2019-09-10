package com.example.foodie.foodie10;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class dhanmondi extends Activity {

    ListView list;

    String[]name={

            "BFC",
            "Boomers Cafe ",
            "Bread and Beyond",
            "Burger n Boost",
            "KFC",
            "Mad Chef",
            "Pizza Hut",
            "Star Kabab",
            "Take Out"
    };


    Integer[]imgid={

            R.drawable.bfc,
            R.drawable.boomers,
            R.drawable.breadandbeyond,
            R.drawable.burgernboost,
            R.drawable.kfc,
            R.drawable.madchef,
            R.drawable.pizzahut,
            R.drawable.starkabab,
            R.drawable.takeout


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhanmondi);

        CustomAdapter adapter=new CustomAdapter(dhanmondi.this,name,imgid);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(dhanmondi.this,""+name[+position],Toast.LENGTH_SHORT).show();

            }
        });
    }
}
