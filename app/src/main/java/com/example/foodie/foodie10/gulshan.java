package com.example.foodie.foodie10;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class gulshan extends Activity {

    ListView list;

    String[]name={

            "A&W",
            "Gloria Jean's Coffees",
            "KFC",
            "KIVA HAN",
            "Nando's"

    };


    Integer[]imgid={

            R.drawable.aandw,
            R.drawable.gloriajeans,
            R.drawable.kfc,
            R.drawable.kivahan,
            R.drawable.nandos

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gulshan);

        CustomAdapter adapter=new CustomAdapter(gulshan.this,name,imgid);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(gulshan.this,""+name[+position],Toast.LENGTH_SHORT).show();

            }
        });
    }
}
