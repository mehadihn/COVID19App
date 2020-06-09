package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class info extends AppCompatActivity {
    private ImageView beready1, beready2, beready3, beready4, beready5, beready6, beready7;
    private ImageView pro1, pro2, pro3, pro4;
    private ImageView act1, act2, act3, act4, act5, act6, act7;
    private ImageView  work1, work2, work3, work4, work5, work6, work7, work8;
    private ImageView hel1, hel2, hel3;
    private SwipeRefreshLayout swipeinfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ImageView backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(info.this, MyDash.class);
                startActivity(i);
            }
        });

         beready1 = (ImageView) findViewById(R.id.beready1);
         beready2 = (ImageView) findViewById(R.id.beready2);
         beready3 = (ImageView) findViewById(R.id.beready3);
         beready4 = (ImageView) findViewById(R.id.beready4);
         beready5 = (ImageView) findViewById(R.id.beready5);
         beready6 = (ImageView) findViewById(R.id.beready6);
         beready7 = (ImageView) findViewById(R.id.beready7);
         pro1 = (ImageView) findViewById(R.id.pro1);
         pro2 = (ImageView) findViewById(R.id.pro2);
         pro3 = (ImageView) findViewById(R.id.pro3);
         pro4 = (ImageView) findViewById(R.id.pro4);
         act1 = (ImageView) findViewById(R.id.act1);
         act2 = (ImageView) findViewById(R.id.act2);
         act3 = (ImageView) findViewById(R.id.act3);
         act4 = (ImageView) findViewById(R.id.act4);
         act5 = (ImageView) findViewById(R.id.act5);
         act6 = (ImageView) findViewById(R.id.act6);
         act7 = (ImageView) findViewById(R.id.act7);
         hel1 = (ImageView) findViewById(R.id.hel1);
         hel2 = (ImageView) findViewById(R.id.hel2);
         hel3 = (ImageView) findViewById(R.id.hel3);
         work1 = (ImageView) findViewById(R.id.work1);
         work2 = (ImageView) findViewById(R.id.work2);
         work3 = (ImageView) findViewById(R.id.work3);
         work4 = (ImageView) findViewById(R.id.work4);
         work5 = (ImageView) findViewById(R.id.work5);
         work6 = (ImageView) findViewById(R.id.work6);
         work7 = (ImageView) findViewById(R.id.work7);
         work8 = (ImageView) findViewById(R.id.work8);

         loadImg();

        swipeinfo = findViewById(R.id.swipeinfo);
        swipeinfo.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadImg();
                swipeinfo.setRefreshing(false);
            }
        });
    }

    private void loadImg(){

        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.down)
                .error(R.drawable.fail);


        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/beready/beready1.png").apply(options).into(beready1);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/beready/beready2.png").apply(options).into(beready2);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/beready/beready3.png").apply(options).into(beready3);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/beready/beready4.png").apply(options).into(beready4);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/beready/beready5.png").apply(options).into(beready5);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/beready/beready6.png").apply(options).into(beready6);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/beready/beready7.png").apply(options).into(beready7);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/pro/pro1.jpg").apply(options).into(pro1);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/pro/pro2.jpg").apply(options).into(pro2);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/pro/pro3.jpg").apply(options).into(pro3);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/pro/pro4.jpg").apply(options).into(pro4);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Activity/act1.png").apply(options).into(act1);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Activity/act2.png").apply(options).into(act2);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Activity/act3.png").apply(options).into(act3);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Activity/act4.png").apply(options).into(act4);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Activity/act5.png").apply(options).into(act5);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Activity/act6.png").apply(options).into(act6);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Activity/act6.png").apply(options).into(act7);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Health/hel1.jpg").apply(options).into(hel1);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Health/hel2.jpg").apply(options).into(hel2);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Health/hel3.jpg").apply(options).into(hel3);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Work/work1.png").apply(options).into(work1);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Work/work2.png").apply(options).into(work2);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Work/work3.png").apply(options).into(work3);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Work/work4.png").apply(options).into(work4);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Work/work5.png").apply(options).into(work5);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Work/work6.png").apply(options).into(work6);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Work/work7.png").apply(options).into(work7);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/COVID19App/master/Images/Work/work8.png").apply(options).into(work8);

    }
}
