package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class info extends AppCompatActivity {
    ImageView beready1, beready2, beready3, beready4, beready5, beready6, beready7;
    ImageView pro1, pro2, pro3, pro4;
    ImageView act1, act2, act3, act4, act5, act6, act7;
    ImageView  work1, work2, work3, work4, work5, work6, work7, work8;
    ImageView hel1, hel2, hel3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ImageView beready1 = (ImageView) findViewById(R.id.beready1);
        ImageView beready2 = (ImageView) findViewById(R.id.beready2);
        ImageView beready3 = (ImageView) findViewById(R.id.beready3);
        ImageView beready4 = (ImageView) findViewById(R.id.beready4);
        ImageView beready5 = (ImageView) findViewById(R.id.beready5);
        ImageView beready6 = (ImageView) findViewById(R.id.beready6);
        ImageView beready7 = (ImageView) findViewById(R.id.beready7);


        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/beready/beready1.png").into(beready1);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/beready/beready2.png").into(beready2);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/beready/beready3.png").into(beready3);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/beready/beready4.png").into(beready4);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/beready/beready5.png").into(beready5);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/beready/beready6.png").into(beready6);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/beready/beready7.png").into(beready7);


        ImageView pro1 = (ImageView) findViewById(R.id.pro1);
        ImageView pro2 = (ImageView) findViewById(R.id.pro2);
        ImageView pro3 = (ImageView) findViewById(R.id.pro3);
        ImageView pro4 = (ImageView) findViewById(R.id.pro4);


        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/pro/pro1.jpg").into(pro1);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/pro/pro2.jpg").into(pro2);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/pro/pro3.jpg").into(pro3);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/pro/pro4.jpg").into(pro4);


        ImageView act1 = (ImageView) findViewById(R.id.act1);
        ImageView act2 = (ImageView) findViewById(R.id.act2);
        ImageView act3 = (ImageView) findViewById(R.id.act3);
        ImageView act4 = (ImageView) findViewById(R.id.act4);
        ImageView act5 = (ImageView) findViewById(R.id.act5);
        ImageView act6 = (ImageView) findViewById(R.id.act6);
        ImageView act7 = (ImageView) findViewById(R.id.act7);



        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Activity/act1.png").into(act1);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Activity/act2.png").into(act2);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Activity/act3.png").into(act3);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Activity/act4.png").into(act4);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Activity/act5.png").into(act5);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Activity/act6.png").into(act6);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Activity/act6.png").into(act7);

        ImageView hel1 = (ImageView) findViewById(R.id.hel1);
        ImageView hel2 = (ImageView) findViewById(R.id.hel2);
        ImageView hel3 = (ImageView) findViewById(R.id.hel3);

        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Health/hel1.jpg").into(hel1);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Health/hel2.jpg").into(hel2);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Health/hel3.jpg").into(hel3);

        ImageView work1 = (ImageView) findViewById(R.id.work1);
        ImageView work2 = (ImageView) findViewById(R.id.work2);
        ImageView work3 = (ImageView) findViewById(R.id.work3);
        ImageView work4 = (ImageView) findViewById(R.id.work4);
        ImageView work5 = (ImageView) findViewById(R.id.work5);
        ImageView work6 = (ImageView) findViewById(R.id.work6);
        ImageView work7 = (ImageView) findViewById(R.id.work7);
        ImageView work8 = (ImageView) findViewById(R.id.work8);

        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Work/work1.png").into(work1);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Work/work2.png").into(work2);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Work/work3.png").into(work3);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Work/work4.png").into(work4);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Work/work5.png").into(work5);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Work/work6.png").into(work6);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Work/work7.png").into(work7);
        Glide.with(this).load("https://raw.githubusercontent.com/mehadihn/imagehost/master/Work/work8.png").into(work8);







    }
}
