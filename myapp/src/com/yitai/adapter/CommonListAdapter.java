package com.yitai.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.yitai.DO.CommonListItem;
import com.yitai.activity.R;
import com.yitai.utils.Constants;

import java.util.ArrayList;

/**
 * Created by FanJiaqi on 2014/8/9.
 */
public class CommonListAdapter extends BaseAdapter {
    private ArrayList<CommonListItem> commonListItems = new ArrayList<CommonListItem>();
    private Context context;

    public CommonListAdapter(ArrayList<CommonListItem> commonListItems, Context context) {
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
        int type = getItemViewType(i);
        CommonListItem commonListItem = commonListItems.get(i);
        ViewHolder vh = null;
        TitleViewHolder mTitleViewHolder = null;

        if (view == null) {
            if (type == Constants.CONTENT) {
                vh = new ViewHolder();
                view = LayoutInflater.from(context).inflate(
                        R.layout.contact_content, null);
                vh.title = (TextView) view.findViewById(R.id.title);
                vh.subtitle = (TextView) view.findViewById(R.id.subtitle);
                view.setTag(vh);
            } else {
                mTitleViewHolder = new TitleViewHolder();
                view = LayoutInflater.from(context).inflate(
                        R.layout.ribbon, null);
                mTitleViewHolder.line = view.findViewById(R.id.line);
                mTitleViewHolder.title = (TextView) view.findViewById(R.id.circle);
                view.setTag(mTitleViewHolder);
            }
        } else {
            if (type == Constants.CONTENT)
                vh = (ViewHolder) view.getTag();
            else
                mTitleViewHolder = (TitleViewHolder) view.getTag();
        }

        if (type == Constants.CONTENT) {
            vh.title.setText(commonListItem.getTitle());
            vh.subtitle.setText(commonListItem.getSubtitle());
        } else {
            mTitleViewHolder.title.setText(commonListItem.getTitle());
//                mTitleViewHolder.title.setBackgroundColor(contactItems.get(i).getColor());
//                mTitleViewHolder.line.setBackgroundColor(contactItems.get(i).getColor());
        }

        return view;

    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return commonListItems.get(position).getTag();
    }


    //部分点击响应
    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return commonListItems.get(position).getTag()==Constants.CONTENT;
    }

}
