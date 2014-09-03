package com.yitai.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by FanJiaqi on 2014/8/10.
 */
public class CultureActivity extends Activity implements View.OnClickListener{
    private WebView webView;
    private CheckBox ckb;
    private RelativeLayout rl;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.culture);
        webView = (WebView) findViewById(R.id.webView);
        ckb = (CheckBox) findViewById(R.id.ckb);
        rl = (RelativeLayout) findViewById(R.id.tvs);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webView.requestFocus();
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.getSettings().setLoadWithOverviewMode(true);

        webView.loadUrl("file:///android_asset/www/culture1.html");

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

        });


        ckb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rl.getVisibility() == View.GONE){
                    rl.setAnimation(new MenuHideShow().show());
                    rl.setVisibility(View.VISIBLE);
                }
                else{
                    rl.setAnimation(new MenuHideShow().hide());
                    rl.setVisibility(View.GONE);
                }
            }
        });

    }

    @Override
    public void onClick(View view) {
        String url = null;
        rl.setAnimation(new MenuHideShow().hide());
        rl.setVisibility(View.GONE);
        switch (view.getId()){
            case R.id.tv1:
                url = "file:///android_asset/www/culture6.html";
                break;
            case R.id.tv2:
                url = "file:///android_asset/www/culture2.html";
                break;
            case R.id.tv3:
                url = "file:///android_asset/www/culture3.html";
                break;
            case R.id.tv4:
                url = "file:///android_asset/www/culture4.html";
                break;
            case R.id.tv5:
                url = "file:///android_asset/www/culture5.html";
                break;
            default:url = "file:///android_asset/www/culture1.html";
        }

        webView.loadUrl(url);
    }

    public class MenuHideShow{
        Animation showMenu,hideMenu;

        public Animation show(){
            showMenu = new ScaleAnimation(0, 1, 0, 1,
                    Animation.RELATIVE_TO_SELF, 0.5f,
                    Animation.RELATIVE_TO_SELF, 0);
            showMenu.setDuration(1000);
            return showMenu;
        }

        public Animation hide(){
            hideMenu = new ScaleAnimation(1, 0, 1, 0,
                    Animation.RELATIVE_TO_SELF, 0.5f,
                    Animation.RELATIVE_TO_SELF, 1);

            hideMenu.setDuration(1000);

            Log.v("menuAnimation", "hide");

            return hideMenu;
        }
    }
}
