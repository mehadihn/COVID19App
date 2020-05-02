package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MyDash extends AppCompatActivity {
    private LinearLayout newsLa;
    private LinearLayout banglaAct;
    private LinearLayout worldAct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dash);

        newsLa = findViewById(R.id.newsla);
        newsLa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyDash.this, newsActivity.class);
                startActivity(i);
            }
        });

        banglaAct = findViewById(R.id.bangladesh);
        banglaAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyDash.this, activityBangladesh.class);
                startActivity(i);
            }
        });

        worldAct = findViewById(R.id.worldwide);
        worldAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyDash.this, world.class);
                startActivity(i);
            }
        });
    }
}
