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
import com.easyandroidanimations.library.AnimationListener;
import com.easyandroidanimations.library.PuffInAnimation;
import com.easyandroidanimations.library.SlideInAnimation;
import com.easyandroidanimations.library.TransferAnimation;

public class LauncherActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    private Button intro;
    private Button culture;
    private Button news;
    private Button tender;
    private Button product;
    private Button recruit;
    private Button contact;
    private ScrollView scroll;
    private View logo;
    private ImageView iv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);       
        setContentView(R.layout.launcher);

        iv = (ImageView) findViewById(R.id.big_icon);
        intro = (Button) findViewById(R.id.intro);
        culture = (Button) findViewById(R.id.culture);
        news = (Button) findViewById(R.id.news);
        tender = (Button) findViewById(R.id.tender);
        product = (Button) findViewById(R.id.product);
        recruit = (Button) findViewById(R.id.recruit);
        contact = (Button) findViewById(R.id.contact);
        logo = (View) findViewById(R.id.logo);
        scroll = (ScrollView) findViewById(R.id.scroll);
        scroll.setVisibility(View.INVISIBLE);
        
        intro.setOnClickListener(this);
        culture.setOnClickListener(this);
        news.setOnClickListener(this);
        tender.setOnClickListener(this);
        product.setOnClickListener(this);
        recruit.setOnClickListener(this);
        contact.setOnClickListener(this);
        
		final TransferAnimation ta = new TransferAnimation(iv).setDestinationView(logo).setDuration(2000);
		ta.setListener(new AnimationListener() {

			@Override
			public void onAnimationEnd(Animation arg0) {
				// TODO Auto-generated method stub
				new SlideInAnimation(scroll).setDirection(Animation.DIRECTION_RIGHT).setDuration(Animation.DURATION_LONG)
				.animate();
			}});
		PuffInAnimation pia = new PuffInAnimation(iv).setDuration(2000);
        pia.setListener(new AnimationListener() {

			@Override
			public void onAnimationEnd(Animation arg0) {
				// TODO Auto-generated method stub
				ta.animate();
			}});
        pia.animate();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.intro:
                startActivity(new Intent(this, IntroActivity.class));//启动另一个Activity
                break;
            case R.id.contact:
                startActivity(new Intent(this, ContactActivity.class));//启动另一个Activity
                break;
            case R.id.tender:
                startActivity(new Intent(this, TenderActivity.class));//启动另一个Activity
                break;
            case R.id.news:
                startActivity(new Intent(this, NewItemsActivity.class));//启动另一个Activity
                break;
            case R.id.product:
                startActivity(new Intent(this, ProductActivity.class));//启动另一个Activity
                break;
            case R.id.recruit:
                startActivity(new Intent(this, RecruitmentActivity.class));//启动另一个Activity
                break;
            case R.id.culture:
                startActivity(new Intent(this, CultureActivity.class));//启动另一个Activity
                break;
        }
    }
    
    
}
