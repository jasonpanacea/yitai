package com.yitai.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.*;
import com.yitai.DO.CommonListItem;
import com.yitai.adapter.CommonListAdapter;
import com.yitai.utils.Constants;
import com.yitai.utils.DataFactory;

import java.util.ArrayList;

import static android.view.View.OnClickListener;

/**
 * Created by FanJiaqi on 2014/9/2.
 */
public class NewItemsActivity extends Activity {
    private ListView recruittList;
    private Button link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.company_news);
        link = (Button) findViewById(R.id.link);
        recruittList = (ListView) findViewById(R.id.list);
        link.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(Constants.url1));
                startActivity(intent);
            }
        });

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
