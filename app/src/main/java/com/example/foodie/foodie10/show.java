package com.example.foodie.foodie10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class show extends AppCompatActivity {
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        myWebView = (WebView)findViewById(R.id.orderlink);
        myWebView.setWebViewClient(new WebViewClient());

        int restu=getIntent().getIntExtra("restu",-1);

        myWebView.getSettings().setJavaScriptEnabled(true);

        myWebView.getSettings().setBuiltInZoomControls(true);


        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        // myWebView.loadUrl("https://www.foodmart.com.bd/index.php?Theme=default&Base=Page&Script=MenuPage&id=556");


        switch(restu){

            case 1:
                myWebView.loadUrl("https://www.foodmart.com.bd/index.php?Theme=default&Base=Page&Script=MenuPage&id=555");
                break;
            case 2:
                myWebView.loadUrl("https://goo.gl/maps/AZ62zRxhCyM2");
                break;
        }

    }
}