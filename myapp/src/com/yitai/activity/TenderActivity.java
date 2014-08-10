package com.yitai.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.*;
import com.yitai.DO.CommonListItem;
import com.yitai.DO.ContactItem;
import com.yitai.adapter.CommonListAdapter;
import com.yitai.utils.DataFactory;

import java.util.ArrayList;

/**
 * Created by FanJiaqi on 2014/8/9.
 */
public class TenderActivity extends Activity {
    private ListView tendertList;
    private EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.tender);
        tendertList = (ListView) findViewById(R.id.list);
        search = (EditText) findViewById(R.id.search);
        ArrayList<CommonListItem> commonListItems = DataFactory.getCommonListData();
        CommonListAdapter commonListAdapter = new CommonListAdapter(commonListItems, TenderActivity.this, true);
        tendertList.setAdapter(commonListAdapter);

        tendertList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(TenderActivity.this, ZhaobiaoActivity.class));
            }
        });
    }
}
