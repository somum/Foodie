package com.example.foodie.foodie10;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class khilgaon extends Activity {

    ListView list;

    String[]name={

            "Al Fresco",
            "Cafe Theatre ",
            "Mr. Burger",
            "SubLovers",
            "Popeyes",
            "cafe 5Six7",
            "Cafe Cheeze Panic",
            "Appeliano",
            "Grind House",
            "Traditional BD",
            "Comic Cafe",
            "BFC"
    };


    Integer[]imgid={

            R.drawable.alfresco,
            R.drawable.theatre,
            R.drawable.burger,
            R.drawable.sub,
            R.drawable.popeyes,
            R.drawable.cafefivesixseven,
            R.drawable.cafecheezepanic,
            R.drawable.appeliano,
            R.drawable.grind,
            R.drawable.tbk,
            R.drawable.comiccafe,
            R.drawable.bfc

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khilgaon);

        CustomAdapter adapter=new CustomAdapter(khilgaon.this,name,imgid);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(khilgaon.this,""+name[+position],Toast.LENGTH_SHORT).show();
                switch(position){
                    case 0:  Intent newActivity = new Intent(khilgaon.this, alfrescopricelist.class);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity1 = new Intent(khilgaon.this, caeftheatre.class);
                        startActivity(newActivity1);
                        break;

                }

            }
            public void onClick(View v){
            };
        });
    }
}
