package com.example.foodie.foodie10;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Threehundredfeet extends Activity {

    ListView list;

    String[]name={

            "Baba Rafi",
            "Chaap Chabai ",
            "Gravity Kitchen",
            "Kabab Express Bd",
            "L'asparagus",
            "The Bizarre Cafe",
            "Vuri VOJ",
            "KOZMO"
    };


    Integer[]imgid={

            R.drawable.babarafi,
            R.drawable.chaapchabai,
            R.drawable.gravitykitchen,
            R.drawable.kababexpress,
            R.drawable.lasparagus,
            R.drawable.thebizarrecafe,
            R.drawable.vurivoj,
            R.drawable.kozmo


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threehundredfeet);

        CustomAdapter adapter=new CustomAdapter(Threehundredfeet.this,name,imgid);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(Threehundredfeet.this,""+name[+position],Toast.LENGTH_SHORT).show();

            }
        });
    }
}
