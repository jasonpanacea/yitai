package com.yitai.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yitai.DO.CommonListItem;
import com.yitai.activity.R;
import com.yitai.utils.Constants;

public class ProductListAdapter extends BaseAdapter {
    private ArrayList<CommonListItem> commonListItems = new ArrayList<CommonListItem>();
    private Context context;
    private boolean isShowArrow;

    public ProductListAdapter(ArrayList<CommonListItem> commonListItems, Context context, boolean isShowArrow) {
        this.commonListItems = commonListItems;
        this.context = context;
        this.isShowArrow = isShowArrow;
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
        ImageViewHolder mImageViewHolder = null;

        if (view == null) {
            if (type == Constants.CONTENT) {
                vh = new ViewHolder();
                view = LayoutInflater.from(context).inflate(
                        R.layout.list_item, null);
                vh.title = (TextView) view.findViewById(R.id.title);
                vh.subtitle = (TextView) view.findViewById(R.id.subtitle);
                vh.arrow = (ImageView) view.findViewById(R.id.arrow);
                view.setTag(vh);
            } else {
                mImageViewHolder = new ImageViewHolder();
                view = LayoutInflater.from(context).inflate(
                        R.layout.product_img_item, null);
                mImageViewHolder.img = (ImageView) view.findViewById(R.id.product_img);
                view.setTag(mImageViewHolder);
            }
        } else {
            if (type == Constants.CONTENT)
                vh = (ViewHolder) view.getTag();
            else
                mImageViewHolder = (ImageViewHolder) view.getTag();
        }

        if (type == Constants.CONTENT) {
            vh.title.setText(commonListItem.getTitle());
            vh.subtitle.setText(commonListItem.getSubtitle());
            if (!this.isShowArrow)
                vh.arrow.setVisibility(View.GONE);
            else
                vh.arrow.setVisibility(View.VISIBLE);
        }
        else if (type == Constants.COAL)
            mImageViewHolder.img.setImageResource(R.drawable.coal_text);
        else if (type == Constants.PARAFFIN)
            mImageViewHolder.img.setImageResource(R.drawable.paraffin_text);


        return view;

    }

    @Override
    public int getViewTypeCount() {
        return 3;
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
        return commonListItems.get(position).getTag() == Constants.CONTENT;
    }
}
