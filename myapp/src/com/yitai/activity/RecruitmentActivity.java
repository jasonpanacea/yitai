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
 * Created by FanJiaqi on 2014/8/9.
 */
public class RecruitmentActivity extends Activity {
    private ListView recruittList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.tender);
        ImageView imageView = (ImageView) findViewById(R.id.bg);
        imageView.setBackgroundResource(R.drawable.recruitment_pic);
        RelativeLayout header_layout = (RelativeLayout) findViewById(R.id.header_layout);
        header_layout.setBackgroundColor(getResources().getColor(R.color.recruit));
        TextView header_text = (TextView) findViewById(R.id.header_text);
        header_text.setText("人才招聘");
        recruittList = (ListView) findViewById(R.id.list);

        ArrayList<CommonListItem> commonListItems = DataFactory.getRecruitListData();
        CommonListAdapter commonListAdapter = new CommonListAdapter(commonListItems, RecruitmentActivity.this, true);
        recruittList.setAdapter(commonListAdapter);

        recruittList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(RecruitmentActivity.this, ZhaopinActivity.class));
            }
        });
    }
}
