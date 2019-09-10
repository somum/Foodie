package com.example.foodie.foodie10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class caeftheatre extends AppCompatActivity {

    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caeftheatre);
        listView = (ListView) findViewById(R.id.list);

        String[] values = new String[] {

                "Chicken Lovers-TK. 669",
                "Mexican Hot-TK. 669",
                "Pizza Troy-TK. 669",
                "Romio & Juliet Pizza-TK. 669",
                "Pasta Basta-TK. 285",
                "Tandoori Grill Chicken-TK. 195",
                "Cajun Blackened Chicken-TK. 295",
                "Grill Chicken Steak-TK. 305",
                "Pizza Sandwich-TK. 209",
                "Smoke Grilled Chicken Sandwich-TK. 219",
                "Wrap Shawarma-TK. 169",
                "Absolute Cheesy Juicy Burger-TK. 185"

        };


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

            }

        });
    }
}
