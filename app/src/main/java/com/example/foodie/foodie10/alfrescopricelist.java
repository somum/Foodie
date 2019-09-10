package com.example.foodie.foodie10;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class alfrescopricelist extends Activity {
        ListView listView ;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_alfrescopricelist);
            listView = (ListView) findViewById(R.id.list);

            String[] values = new String[] {

                    "pasta:",
            "Pasta Basta - TK. 285",
            "Pasta BBQ - TK. 295",
            "Pasta Classico -TK. 290",
            "Pasta Italiano -TK. 280",
            "Pasta Spano -TK. 295",
            "Pasta Vegetarian -TK. 245",
            "Pasta Zeletti -TK. 290",
                    "Pizza:",
            "Four Season - TK. 375",
            "Mexican Pizza -TK. 355",
            "Pasta Alfresco -TK. 290",
            "Pizza Alfresco -TK. 365",
            "Pizza Classico -TK. 350",
            "Pizza Italiano -TK. 345",
            "Pizza Maramanti -TK. 370",
            "Pizza Salami -TK. 375",
            "Pizza Vegetarian -TK. 290"

            };


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, values);

            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {

                }

            });
        }
    public void foodmart(View v){

        Intent p = new Intent(this, show.class);
        p.putExtra("restu",1);
        startActivity(p);
    }
    public void googlemap(View v){

        Intent q = new Intent(this, show.class);
        q.putExtra("restu",2);
        startActivity(q);
    }

    }

