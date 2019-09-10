package com.example.foodie.foodie10;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class first extends Activity {
    public EditText inputarea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_first);

        inputarea = (EditText) findViewById(R.id.inputarea);
    }

    public void buttonClicked(View v) {

        switch (inputarea.getText().toString().toLowerCase()) {
            case "khilgaon" :
                Intent p = new Intent(first.this, khilgaon.class);
                startActivity(p);
                break;

            case "banani" :
                Intent q = new Intent(first.this, banani.class);
                startActivity(q);
                break;
            case "dhanmondi" :
                Intent intent = new Intent(first.this, dhanmondi.class);
                startActivity(intent);
                break;
            case "300feet" :
                Intent intent1 = new Intent(first.this, Threehundredfeet.class);
                startActivity(intent1);
                break;
            case "gulshan" :
                Intent intent2 = new Intent(first.this, gulshan.class);
                startActivity(intent2);
                break;
            case "mirpur" :
                Intent intent3 = new Intent(first.this, mirpur.class);
                startActivity(intent3);
                break;
            case "bailyroad" :
                Intent intent4 = new Intent(first.this, bailyroad.class);
                startActivity(intent4);
                break;
            default:
                Toast.makeText(first.this, "Not Found", Toast.LENGTH_SHORT).show();
        }
    }
}
