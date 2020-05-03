package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class helpline extends AppCompatActivity {
    private ImageView shasto, a2i , iedcr1 , iedcr2 , iedcr3, iedcr4, iedcr5, iedcr6, icddrb1, icddrb2, icddrb3, icddrb4, icddrb5, icddrb6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);

        ImageView backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(helpline.this, MyDash.class);
                startActivity(i);
            }
        });

        shasto = findViewById(R.id.shasto);
        shasto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:16263"));
                startActivity(intent);
            }
        });

        a2i = findViewById(R.id.a2i);
        a2i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:333"));
                startActivity(intent);
            }
        });

        iedcr1 = findViewById(R.id.iedcr1);
        iedcr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:16263"));
                startActivity(intent);
            }
        });

        iedcr2 = findViewById(R.id.iedcr2);
        iedcr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01944333222"));
                startActivity(intent);
            }
        });

        iedcr3 = findViewById(R.id.iedcr3);
        iedcr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01937000011"));
                startActivity(intent);
            }
        });

        iedcr4 = findViewById(R.id.iedcr4);
        iedcr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01937110011"));
                startActivity(intent);
            }
        });

        iedcr5 = findViewById(R.id.iedcr5);
        iedcr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01927711784"));
                startActivity(intent);
            }
        });

        iedcr6 = findViewById(R.id.iedcr6);
        iedcr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01927711785"));
                startActivity(intent);
            }
        });

        icddrb1 = findViewById(R.id.icddrb1);
        icddrb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01401184551"));
                startActivity(intent);
            }
        });

        icddrb2 = findViewById(R.id.icddrb2);
        icddrb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01401184554"));
                startActivity(intent);
            }
        });

        icddrb3 = findViewById(R.id.icddrb3);
        icddrb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01401184555"));
                startActivity(intent);
            }
        });

        icddrb4 = findViewById(R.id.icddrb4);
        icddrb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01401184556"));
                startActivity(intent);
            }
        });

        icddrb5 = findViewById(R.id.icddrb5);
        icddrb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01401184559"));
                startActivity(intent);
            }
        });

        icddrb6 = findViewById(R.id.icddrb6);
        icddrb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01401184560"));
                startActivity(intent);
            }
        });

    }
}
