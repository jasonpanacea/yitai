package com.yitai.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.easyandroidanimations.library.Animation;
import com.easyandroidanimations.library.SlideInAnimation;

/**
 * Created by FanJiaqi on 2014/8/4.
 */
public class HomeActivity extends Activity implements View.OnClickListener {

    private Button intro;
    private Button culture;
    private Button news;
    private Button tender;
    private Button product;
    private Button recruit;
    private Button contact;
    private ScrollView scroll;
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.home);

        intro = (Button) findViewById(R.id.intro);
        culture = (Button) findViewById(R.id.culture);
        news = (Button) findViewById(R.id.news);
        tender = (Button) findViewById(R.id.tender);
        product = (Button) findViewById(R.id.product);
        recruit = (Button) findViewById(R.id.recruit);
        contact = (Button) findViewById(R.id.contact);
        logo = (ImageView) findViewById(R.id.logo);
        scroll = (ScrollView) findViewById(R.id.scroll);
		new SlideInAnimation(logo).setDirection(Animation.DIRECTION_LEFT).setDuration(Animation.DURATION_LONG)
		.animate();
//        scroll.setVisibility(View.INVISIBLE);
        intro.setOnClickListener(this);
        culture.setOnClickListener(this);
        news.setOnClickListener(this);
        tender.setOnClickListener(this);
        product.setOnClickListener(this);
        recruit.setOnClickListener(this);
        contact.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.intro:
                startActivity(new Intent(HomeActivity.this, IntroActivity.class));//启动另一个Activity
                break;
            case R.id.contact:
                startActivity(new Intent(HomeActivity.this, ContactActivity.class));//启动另一个Activity
                break;
            case R.id.tender:
                startActivity(new Intent(HomeActivity.this, TenderActivity.class));//启动另一个Activity
                break;
            case R.id.news:
                startActivity(new Intent(HomeActivity.this, NewItemsActivity.class));//启动另一个Activity
                break;
            case R.id.product:
                startActivity(new Intent(HomeActivity.this, ProductActivity.class));//启动另一个Activity
                break;
            case R.id.recruit:
                startActivity(new Intent(HomeActivity.this, RecruitmentActivity.class));//启动另一个Activity
                break;
            case R.id.culture:
                startActivity(new Intent(HomeActivity.this, CultureActivity.class));//启动另一个Activity
                break;
        }
    }

}
