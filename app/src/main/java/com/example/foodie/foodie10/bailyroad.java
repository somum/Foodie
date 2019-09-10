package com.example.foodie.foodie10;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class bailyroad extends Activity {

    ListView list;

    String[]name={

            "BFC",
            "Boomers Café",
            "Coffeelicious Coffee",
            "Dosa Express",
            "Thirty 3"
    };


    Integer[]imgid={

            R.drawable.bfc,
            R.drawable.boomers,
            R.drawable.coffeeliciouscoffee,
            R.drawable.dosaexpress,
            R.drawable.thirtythree

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bailyroad);

        CustomAdapter adapter=new CustomAdapter(bailyroad.this,name,imgid);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(bailyroad.this,""+name[+position],Toast.LENGTH_SHORT).show();

            }
        });
    }
}
