package com.yitai.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by FanJiaqi on 2014/8/10.
 */
public class CultureActivity extends Activity {
    private WebView webView;
    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private Boolean changeedGroup = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.culture);
        radioGroup1 = (RadioGroup) findViewById(R.id.orderBy1);
        radioGroup1.setOnCheckedChangeListener(new MyRadioGroupOnCheckedChangedListener());
        radioGroup2 = (RadioGroup) findViewById(R.id.orderBy2);
        radioGroup2.setOnCheckedChangeListener(new MyRadioGroupOnCheckedChangedListener());

        webView = (WebView) findViewById(R.id.webView);

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

    }

    class MyRadioGroupOnCheckedChangedListener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (!changeedGroup) {
                changeedGroup = true;
                if (group == radioGroup1) {
                    radioGroup2.clearCheck();
                } else if (group == radioGroup2) {
                    radioGroup1.clearCheck();
                }
                changeedGroup = false;
            }
            switch (checkedId){
                case R.id.rb1:
                    webView.loadUrl("file:///android_asset/www/culture1.html");
                    break;
                case R.id.rb2:
                    webView.loadUrl("file:///android_asset/www/culture2.html");
                    break;
                case R.id.rb3:
                    webView.loadUrl("file:///android_asset/www/culture3.html");
                    break;
                case R.id.rb4:
                    webView.loadUrl("file:///android_asset/www/culture4.html");
                    break;
                case R.id.rb5:
                    webView.loadUrl("file:///android_asset/www/culture5.html");
                    break;
                case R.id.rb6:
                    webView.loadUrl("file:///android_asset/www/culture6.html");
                    break;
            }
        }
    }

}
