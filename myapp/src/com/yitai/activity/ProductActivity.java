package com.yitai.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.*;
import com.yitai.DO.CommonListItem;
import com.yitai.adapter.CommonListAdapter;
import com.yitai.utils.DataFactory;

import java.util.ArrayList;

/**
 * Created by FanJiaqi on 2014/8/9.
 */
public class ProductActivity extends Activity {
    private ListView producttList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.tender);
        ImageView imageView = (ImageView) findViewById(R.id.bg);
        imageView.setBackgroundResource(R.drawable.product_pic);
        RelativeLayout header_layout = (RelativeLayout) findViewById(R.id.header_layout);
        header_layout.setBackgroundColor(getResources().getColor(R.color.product));
        producttList = (ListView) findViewById(R.id.list);
        TextView header_text = (TextView) findViewById(R.id.header_text);
        header_text.setText("产品中心");
        ArrayList<CommonListItem> commonListItems = DataFactory.getProductData();
        CommonListAdapter commonListAdapter = new CommonListAdapter(commonListItems, ProductActivity.this, false);
        producttList.setAdapter(commonListAdapter);
    }
}
