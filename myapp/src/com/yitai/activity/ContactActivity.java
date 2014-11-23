package com.yitai.activity;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.*;

import com.yitai.DO.ContactItem;
import com.yitai.adapter.TitleViewHolder;
import com.yitai.utils.Constants;
import com.yitai.utils.DataFactory;
import com.yitai.utils.Utils;

/**
 * Created by FanJiaqi on 2014/8/6.
 */
public class ContactActivity extends ActivityGroup {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.contact);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        // 如果没有继承TabActivity时，通过该种方法加载启动tabHost
        tabHost.setup(this.getLocalActivityManager());
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("总部")
                .setContent(new Intent(this, ZongBuActivity.class)));

        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("分公司")
                .setContent(new Intent(this, FenGongSiActivity.class)));
        TextView x = (TextView) tabHost.getTabWidget().getChildAt(0).findViewById(android.R.id.title);
        x.setTextColor(this.getResources().getColorStateList(R.color.text_tab_indicator));
        x.setTextSize(20);
        x = (TextView) tabHost.getTabWidget().getChildAt(1).findViewById(android.R.id.title);
        x.setTextColor(this.getResources().getColorStateList(R.color.text_tab_indicator));
        x.setTextSize(20);


    }


}
