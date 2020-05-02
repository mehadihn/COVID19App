package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class hospital extends AppCompatActivity {
    ImageView kuwaitCall , dmcCall , KamlaCall;

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

    }
}
