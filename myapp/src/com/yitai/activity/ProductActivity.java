package com.yitai.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.yitai.DO.CommonListItem;
import com.yitai.adapter.CommonListAdapter;
import com.yitai.utils.DataFactory;

import java.util.ArrayList;

/**
 * Created by FanJiaqi on 2014/8/9.
 */
public class ProductActivity extends Activity {
    private ListView producttList;
    private EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.tender);
        producttList = (ListView) findViewById(R.id.list);
        TextView header_text = (TextView) findViewById(R.id.header_text);
        header_text.setText("产品中心");
        search = (EditText) findViewById(R.id.search);
        search.setHint("  搜索产品");
        ArrayList<CommonListItem> commonListItems = DataFactory.getProductData();
        CommonListAdapter commonListAdapter = new CommonListAdapter(commonListItems, ProductActivity.this, false);
        producttList.setAdapter(commonListAdapter);
    }
}
