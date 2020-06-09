package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class handwash extends AppCompatActivity {
    private SwipeRefreshLayout swipehand;
    private ImageView handwash;

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
        handwash = findViewById(R.id.handwash);

        loadImg();

        swipehand = findViewById(R.id.swipehand);
        swipehand.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadImg();
                swipehand.setRefreshing(false);
            }
        });





    }

    public void loadImg(){

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.down)
                .error(R.drawable.fail);


        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/handwash/how_to_handwash_lge.gif").apply(options).into(handwash);
    }
}
