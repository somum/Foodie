package com.example.foodie.foodie10;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class banani extends Activity {

    ListView list;

    String[]name={

            "Mad Chef",
            "Nando's ",
            "Burgerking",
            "Handi",
            "Starkabab",
            "Takeout",
            "Sauslys",
            "Al Fresco",
            "American Burger",
            "Voot",
            "Shawarma House",
            "Sajna"
    };


    Integer[]imgid={

            R.drawable.madchef,
            R.drawable.nandos,
            R.drawable.burgerking,
            R.drawable.handi,
            R.drawable.starkabab,
            R.drawable.takeout,
            R.drawable.sauslys,
            R.drawable.alfresco,
            R.drawable.voot,
            R.drawable.americanburger,
            R.drawable.shawarmahouse,
            R.drawable.sajna

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banani);

        CustomAdapter adapter=new CustomAdapter(banani.this,name,imgid);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(banani.this,""+name[+position],Toast.LENGTH_SHORT).show();

            }
        });
    }
}

