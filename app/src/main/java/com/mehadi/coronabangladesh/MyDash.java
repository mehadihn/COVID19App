package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MyDash extends AppCompatActivity {
    private RelativeLayout newsLa;
    private RelativeLayout banglaAct;
    private RelativeLayout worldAct;
    private RelativeLayout hospital;
    private RelativeLayout helpline;

    private TextView greeting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dash);

        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        greeting = findViewById(R.id.greeting);

        if(timeOfDay >= 0 && timeOfDay < 12){
            greeting.setText("Good Morning");
        }else if(timeOfDay >= 12 && timeOfDay < 16){
            greeting.setText("Good Afternoon");
        }else if(timeOfDay >= 16 && timeOfDay < 21){
            greeting.setText("Good Evening");
        }else if(timeOfDay >= 21 && timeOfDay < 24){
            greeting.setText("Good Night");
        }










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

        hospital = findViewById(R.id.hospital);
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyDash.this, hospital.class);
                startActivity(i);
            }
        });


        helpline = findViewById(R.id.helpline);
        helpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyDash.this, helpline.class);
                startActivity(i);
            }
        });
    }
}
