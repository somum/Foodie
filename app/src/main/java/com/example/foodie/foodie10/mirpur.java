package com.example.foodie.foodie10;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class mirpur extends Activity {

    ListView list;

    String[]name={

            "Coffee Express",
            "Coffee Time",
            "CP",
            "KFC",
            "Pizza Hut",
            "Zaytun"
    };


    Integer[]imgid={

            R.drawable.coffeeexpress,
            R.drawable.coffeetime,
            R.drawable.cp,
            R.drawable.kfc,
            R.drawable.pizzahut,
            R.drawable.zaytun

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirpur);

        CustomAdapter adapter=new CustomAdapter(mirpur.this,name,imgid);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(mirpur.this,""+name[+position],Toast.LENGTH_SHORT).show();

            }
        });
    }
}
