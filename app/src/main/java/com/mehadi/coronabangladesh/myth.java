package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class    myth extends AppCompatActivity {
    private ImageView myth1, myth2, myth3, myth4, myth5, myth6, myth7, myth8, myth9, myth10, myth11, myth12, myth13,
            myth14, myth15, myth16, myth17, myth18, myth19, myth20, myth21;

    private SwipeRefreshLayout swipemyth;

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

        loadImg();


        swipemyth = findViewById(R.id.swipemyth);
        swipemyth.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadImg();
                swipemyth.setRefreshing(false);
            }
        });






    }

    private void loadImg(){

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.down)
                .error(R.drawable.fail);


        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/1.png").apply(options).into(myth1);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/2.png").apply(options).into(myth2);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/3.png").apply(options).into(myth3);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/4.png").apply(options).into(myth4);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/5.png").apply(options).into(myth5);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/6.png").apply(options).into(myth6);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/7.png").apply(options).into(myth7);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/8.png").apply(options).into(myth8);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/9.png").apply(options).into(myth9);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/10.png").apply(options).into(myth10);

        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/11.png").apply(options).into(myth11);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/12.jpg").apply(options).into(myth12);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/13.jpg").apply(options).into(myth13);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/14.jpg").apply(options).into(myth14);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/15.png").apply(options).into(myth15);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/16.png").apply(options).into(myth16);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/17.png").apply(options).into(myth17);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/18.png").apply(options).into(myth18);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/19.png").apply(options).into(myth19);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/20.png").apply(options).into(myth20);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/myth/21.png").apply(options).into(myth21);
    }
}
