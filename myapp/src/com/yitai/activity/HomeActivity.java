package com.yitai.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import com.yitai.activity.R;

/**
 * Created by FanJiaqi on 2014/8/4.
 */
public class HomeActivity extends Activity {

    private String texts[] = null;
    private int images[] = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.home);
        images = new int[]{R.drawable.p1, R.drawable.p1,
                R.drawable.p1, R.drawable.p1,
                R.drawable.p1, R.drawable.p1,
                R.drawable.p1, R.drawable.p1, R.drawable.p1};
        texts = new String[]{"集团介绍", "联系方式",
                "招标信息", "宫式布局4",
                "宫式布局5", "宫式布局6",
                "宫式布局7", "宫式布局8", "宫式布局9"};
        GridView gridview = (GridView) findViewById(R.id.gridview);
        ArrayList<HashMap<String, Object>> lstImageItem = new ArrayList<HashMap<String, Object>>();
        for (int i = 0; i < 8; i++) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("itemImage", images[i]);
            map.put("itemText", texts[i]);
            lstImageItem.add(map);
        }

        SimpleAdapter saImageItems = new SimpleAdapter(this,
                lstImageItem,// 数据源
                R.layout.home_item,// 显示布局
                new String[] { "itemImage", "itemText" },
                new int[] { R.id.itemImage, R.id.itemText });
        gridview.setAdapter(saImageItems);
        gridview.setOnItemClickListener(new ItemClickListener());
    }

    class ItemClickListener implements AdapterView.OnItemClickListener {
        /**
         * 点击项时触发事件
         *
         * @param parent  发生点击动作的AdapterView
         * @param view 在AdapterView中被点击的视图(它是由adapter提供的一个视图)。
         * @param position 视图在adapter中的位置。
         * @param rowid 被点击元素的行id。
         */
        public void onItemClick(AdapterView<?> parent, View view, int position, long rowid) {
            HashMap<String, Object> item = (HashMap<String, Object>) parent.getItemAtPosition(position);
            //获取数据源的属性值
            String itemText=(String)item.get("itemText");
            Toast.makeText(HomeActivity.this, itemText, Toast.LENGTH_LONG).show();

            //根据图片进行相应的跳转
            switch (position) {
                case 0:
                    startActivity(new Intent(HomeActivity.this, IntroActivity.class));//启动另一个Activity
                    break;
                case 1:
                    startActivity(new Intent(HomeActivity.this, ContactActivity.class));//启动另一个Activity
                    break;

                case 2:
                    startActivity(new Intent(HomeActivity.this, TenderActivity.class));//启动另一个Activity
                    break;
            }

        }
    }
}
