package com.yitai.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
    private ListView newsList;
    private Button link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.company_news);
        link = (Button) findViewById(R.id.link);
        newsList = (ListView) findViewById(R.id.list);
        link.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(Constants.url1));
                startActivity(intent);
            }
        });

        ArrayList<CommonListItem> commonListItems = DataFactory.getNewsListData2();
        NewsListAdapter newsListAdapter = new NewsListAdapter(commonListItems, NewItemsActivity.this);
        newsList.setAdapter(newsListAdapter);

        newsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = null;
                switch (i){
                    case 0:
                        intent = new Intent(NewItemsActivity.this, NewsActivity.class);
                        intent.putExtra("url","http://dwz.cn/wyu4T");
                        break;
                    case 1:
                    case 2:
                        intent = new Intent(NewItemsActivity.this, NewsActivity.class);
                        intent.putExtra("url","http://v.youku.com/v_show/id_XODI4OTg5NTky.html?from=y1.2-1-91.3.2-1.1-1-1-1");
                        break;
                }
                startActivity(intent);

            }
        });
    }

    private class NewsViewHolder{
        TextView title;
        TextView subTitle;
        ImageView img;
    }
    private class NewsListAdapter extends BaseAdapter{
        private ArrayList<CommonListItem> commonListItems = new ArrayList<CommonListItem>();
        private Context context;
        public NewsListAdapter(ArrayList<CommonListItem> commonListItems, Context context) {
            this.commonListItems = commonListItems;
            this.context = context;
        }
        @Override
        public int getCount() {
            return commonListItems.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            CommonListItem commonListItem = commonListItems.get(i);
            NewsViewHolder mNewsViewHolder;
            if (view == null) {
                mNewsViewHolder = new NewsViewHolder();
                view = LayoutInflater.from(context).inflate(
                        R.layout.new_item, null);
                mNewsViewHolder.title = (TextView) view.findViewById(R.id.title);
                mNewsViewHolder.subTitle = (TextView) view.findViewById(R.id.subtitle);
                mNewsViewHolder.img = (ImageView) view.findViewById(R.id.img);
                view.setTag(mNewsViewHolder);
            }
            else{
                mNewsViewHolder = (NewsViewHolder) view.getTag();
            }
            if (i == 0)
                mNewsViewHolder.img.setImageResource(R.drawable.news);
            else {
                mNewsViewHolder.img.setImageResource(R.drawable.video1);
                Drawable drawable = context.getResources().getDrawable(R.drawable.player);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());//必须设置图片大小，否则不显示
                mNewsViewHolder.subTitle.setCompoundDrawables(drawable,null,null,null);
                mNewsViewHolder.subTitle.setCompoundDrawablePadding(5);
            }
            mNewsViewHolder.title.setText(commonListItem.getTitle());
            mNewsViewHolder.subTitle.setText(commonListItem.getSubtitle());
            return view;
        }
    }
}


