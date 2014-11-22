package com.yitai.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.*;
import com.yitai.DO.CommonListItem;
import com.yitai.adapter.CommonListAdapter;
import com.yitai.adapter.ProductListAdapter;
import com.yitai.utils.DataFactory;

import java.util.ArrayList;

/**
 * Created by FanJiaqi on 2014/8/9.
 */
public class ProductActivity extends Activity {
    private ListView producttList;
    private Button link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.product);

        producttList = (ListView) findViewById(R.id.list);
        link = (Button) findViewById(R.id.link);
        link.setVisibility(View.GONE);
        ArrayList<CommonListItem> commonListItems = DataFactory.getProductData();
        ProductListAdapter commonListAdapter = new ProductListAdapter(commonListItems, ProductActivity.this, false);
        producttList.setAdapter(commonListAdapter);
    }
}
