package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class credit extends AppCompatActivity {
    private ImageView git, backbutton, whoimg, coronabd, novel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);


        backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(credit.this, MyDash.class);
                startActivity(i);
            }
        });

        git = findViewById(R.id.git);
        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/mehadihn"));
                startActivity(browserIntent);
            }
        });

        whoimg = findViewById(R.id.whoimg);
        coronabd = findViewById(R.id.coronabd);
        novel = findViewById(R.id.novel);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Credit/novelcovid.jpg").into(novel);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Credit/corona.png").into(coronabd);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Credit/who.jpg").into(whoimg);

    }
}
