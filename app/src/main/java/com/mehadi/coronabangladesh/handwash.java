package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class handwash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handwash);

        ImageView backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(handwash.this, MyDash.class);
                startActivity(i);
            }
        });

        ImageView handwash = findViewById(R.id.handwash);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/handwash/how_to_handwash_lge.gif").into(handwash);

    }
}
