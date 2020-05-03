package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class hospital extends AppCompatActivity {
    ImageView kuwaitCall , dmcCall , KamlaCall , dhakamohan , mmh , Kamrangirchar , Aminbazar , National , Sheikh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        kuwaitCall = findViewById(R.id.kuwaitCall);
        kuwaitCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01999956290"));
                startActivity(intent);
            }
        });

        dmcCall = findViewById(R.id.dmcCall);
        dmcCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01819220180"));
                startActivity(intent);
            }
        });

        KamlaCall = findViewById(R.id.KamlaCall);
        KamlaCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0255007420"));
                startActivity(intent);
            }
        });

        dhakamohan = findViewById(R.id.dhakamohan);
        dhakamohan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0257390860"));
                startActivity(intent);
            }
        });

        mmh = findViewById(R.id.mmh);
        mmh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:029002012"));
                startActivity(intent);
            }
        });

        Kamrangirchar = findViewById(R.id.Kamrangirchar);
        Kamrangirchar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01726321189"));
                startActivity(intent);
            }
        });

        Aminbazar = findViewById(R.id.Aminbazar);
        Aminbazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01712290100"));
                startActivity(intent);
            }
        });

        National = findViewById(R.id.National);
        National.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:028811910"));
                startActivity(intent);
            }
        });

        Sheikh = findViewById(R.id.Sheikh);
        Sheikh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:028811910"));
                startActivity(intent);
            }
        });

    }
}
