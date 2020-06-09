package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

public class donate extends AppCompatActivity {
    private LinearLayout ektakalayout, braclay;
    private ImageView ektkimg, bracimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        ImageView backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(donate.this, MyDash.class);
                startActivity(i);
            }
        });

        ektakalayout = findViewById(R.id.ektakalayout);
        braclay = findViewById(R.id.braclay);


        ektakalayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bkash.com/bkash-donation/donation?page=bidyanondo"));
                startActivity(browserIntent);
            }
        });

        braclay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bkash.com/bkash-donation/donation?page=brac"));
                startActivity(browserIntent);
            }
        });

        ektkimg = findViewById(R.id.ektkimg);
        bracimg = findViewById(R.id.bracimg);

        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Donate/brac1.jpg").into(bracimg);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Donate/ek.jpg").into(ektkimg);}
}
