package com.yitai.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.*;
import com.yitai.DO.CommonListItem;
import com.yitai.adapter.CommonListAdapter;
import com.yitai.utils.DataFactory;

import java.util.ArrayList;

/**
 * Created by FanJiaqi on 2014/9/2.
 */
public class NewItemsActivity extends Activity {
    private ListView recruittList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.tender);
        ImageView imageView = (ImageView) findViewById(R.id.bg);
        imageView.setBackgroundResource(R.drawable.news_pic);
        RelativeLayout header_layout = (RelativeLayout) findViewById(R.id.header_layout);
        header_layout.setBackgroundColor(getResources().getColor(R.color.news));
        TextView header_text = (TextView) findViewById(R.id.header_text);
        header_text.setText("公司新闻");
        recruittList = (ListView) findViewById(R.id.list);


        ArrayList<CommonListItem> commonListItems = DataFactory.getNewsListData();
        CommonListAdapter commonListAdapter = new CommonListAdapter(commonListItems, NewItemsActivity.this, true);
        recruittList.setAdapter(commonListAdapter);

        recruittList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(NewItemsActivity.this, NewsActivity.class));
            }
        });
    }
}
