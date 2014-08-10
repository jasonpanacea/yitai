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

/**
 * Created by FanJiaqi on 2014/8/10.
 */
public class CultureActivity extends Activity{
    private WebView webView;
    private CheckBox ckb;
    private RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.culture);
        webView = (WebView) findViewById(R.id.webView);
        ckb = (CheckBox) findViewById(R.id.ckb);
        rl = (RelativeLayout) findViewById(R.id.tvs);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webView.requestFocus();
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.getSettings().setLoadWithOverviewMode(true);

        webView.loadUrl("file:///android_asset/www/news.html");

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
                if (b){
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
