package com.yitai.activity;

import java.lang.reflect.InvocationTargetException;

import android.content.Intent;
import android.webkit.WebChromeClient;
import com.yitai.activity.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yitai.view.ProgressWebView;

/**
 * Created by Jiangtao on 2014/8/9.
 */
public class NewsActivity extends Activity {

    private WebView webView;
	private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.setContentView(R.layout.news);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
    	progress = (ProgressBar) findViewById(R.id.progressBar);
		progress.setMax(100);
        
        webView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webSettings.setAllowFileAccess(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        
        webView.requestFocus();
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.loadUrl(url);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setPluginsEnabled(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

        });
        
        webView.setWebChromeClient(new WebChromeClient(){

			@Override
			public void onProgressChanged(WebView view, int newProgress) {
				// TODO Auto-generated method stub
	            if (newProgress == 100) {
	            	progress.setVisibility(View.GONE);
	            } else {
	                if (progress.getVisibility() == View.GONE)
	                	progress.setVisibility(View.VISIBLE);
	                progress.setProgress(newProgress);
	            }
				super.onProgressChanged(view, newProgress);
			}
			
        	
        }); 
    }
    
    public void setValue(int progress) {
		this.progress.setProgress(progress);		
	}
    
    @Override  
    public void onPause() {// 继承自Activity  
        super.onPause();  
        try {
			webView.getClass().getMethod("onPause").invoke(webView,(Object[])null);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }  
      
    @Override  
    public void onResume() {// 继承自Activity  
        super.onResume();  
        try {
			webView.getClass().getMethod("onResume").invoke(webView,(Object[])null);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }  
}
