package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class myth extends AppCompatActivity {
    private ImageView myth1, myth2, myth3, myth4, myth5, myth6, myth7, myth8, myth9, myth10, myth11, myth12, myth13,
            myth14, myth15, myth16, myth17, myth18, myth19, myth20, myth21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myth);

        ImageView backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(myth.this, MyDash.class);
                startActivity(i);
            }
        });

        myth1 = findViewById(R.id.myth1);
        myth2 = findViewById(R.id.myth2);
        myth3 = findViewById(R.id.myth3);
        myth4 = findViewById(R.id.myth4);
        myth5 = findViewById(R.id.myth5);
        myth6 = findViewById(R.id.myth6);
        myth7 = findViewById(R.id.myth7);
        myth8 = findViewById(R.id.myth8);
        myth9 = findViewById(R.id.myth9);
        myth10 = findViewById(R.id.myth10);
        myth11 = findViewById(R.id.myth11);
        myth12 = findViewById(R.id.myth12);
        myth13 = findViewById(R.id.myth13);
        myth14 = findViewById(R.id.myth14);
        myth15 = findViewById(R.id.myth15);
        myth16 = findViewById(R.id.myth16);
        myth17 = findViewById(R.id.myth17);
        myth18 = findViewById(R.id.myth18);
        myth19 = findViewById(R.id.myth19);
        myth20 = findViewById(R.id.myth20);
        myth21 = findViewById(R.id.myth21);



        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/1.png").into(myth1);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/2.png").into(myth2);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/3.png").into(myth3);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/4.png").into(myth4);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/5.png").into(myth5);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/6.png").into(myth6);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/7.png").into(myth7);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/8.png").into(myth8);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/9.png").into(myth9);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/10.png").into(myth10);

        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/11.png").into(myth11);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/12.png").into(myth12);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/13.png").into(myth13);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/14.png").into(myth14);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/15.png").into(myth15);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/16.png").into(myth16);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/17.png").into(myth17);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/18.png").into(myth18);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/19.png").into(myth19);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/20.png").into(myth20);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/myth/21.png").into(myth21);



    }
}
