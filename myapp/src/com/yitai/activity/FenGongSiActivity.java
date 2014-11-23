package com.yitai.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.yitai.DO.ContactItem;
import com.yitai.adapter.TitleViewHolder;
import com.yitai.utils.Constants;
import com.yitai.utils.DataFactory;
import com.yitai.utils.Utils;

import java.util.ArrayList;

/**
 * Created by FanJiaqi on 2014/11/22.
 */
public class FenGongSiActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fengongsi);
        ListView contactList = (ListView) findViewById(R.id.contact_list);
        ArrayList<ContactItem> contactItems = DataFactory.getContactData();
        ContactAdapter ca = new ContactAdapter(this,contactItems);
        contactList.setAdapter(ca);
        setListViewHeightBasedOnChildren(contactList);
    }

    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = listView.getPaddingTop() + listView.getPaddingBottom();
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            if (listItem instanceof ViewGroup) {
                listItem.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            }
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }


    private class ContactViewHolder{
        TextView title;
        TextView name;
        TextView cell;
        TextView tele;
    }



    private class ContactAdapter extends BaseAdapter {
        private Context context;
        private ArrayList<ContactItem> contactItems = new ArrayList<ContactItem>();

        private ContactAdapter(Context context, ArrayList<ContactItem> contactItems) {
            this.context = context;
            this.contactItems = contactItems;
        }

        @Override
        public int getItemViewType(int position) {
            return contactItems.get(position).getTag();
        }

        @Override
        public int getViewTypeCount() {
            return 2;
        }

        @Override
        public int getCount() {
            return contactItems.size();
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
            ContactViewHolder mContactViewHolder = null;
            TitleViewHolder mTitleViewHolder = null;
            int type = getItemViewType(i);
            ContactItem contactItem = contactItems.get(i);
            if(view == null){
                if (type == Constants.CONTENT) {
                    mContactViewHolder = new ContactViewHolder();
                    view = LayoutInflater.from(context).inflate(
                            R.layout.contact_content, null);
                    mContactViewHolder.name = (TextView) view.findViewById(R.id.name);
                    mContactViewHolder.tele = (TextView) view.findViewById(R.id.tele);
                    mContactViewHolder.cell = (TextView) view.findViewById(R.id.cell);
                    mContactViewHolder.title = (TextView) view.findViewById(R.id.title);
                    view.setTag(mContactViewHolder);
                }
                else{
                    mTitleViewHolder = new TitleViewHolder();
                    view = LayoutInflater.from(context).inflate(
                            Utils.getRandomRibbon(), null);
                    mTitleViewHolder.line = view.findViewById(R.id.line);
                    mTitleViewHolder.title = (TextView) view.findViewById(R.id.circle);
                    view.setTag(mTitleViewHolder);
                }
            }
            else{
                if (type == Constants.CONTENT)
                    mContactViewHolder = (ContactViewHolder)view.getTag();
                else
                    mTitleViewHolder = (TitleViewHolder)view.getTag();
            }

            if (type == Constants.CONTENT) {
                mContactViewHolder.title.setText(contactItem.getTitle());
                mContactViewHolder.name.setText(contactItem.getName());
                if (contactItem.getTele() == "")
                    mContactViewHolder.tele.setVisibility(View.GONE);
                if (contactItem.getCell() == "")
                    mContactViewHolder.cell.setVisibility(View.GONE);
                mContactViewHolder.tele.setText(contactItem.getTele());
                mContactViewHolder.cell.setText(contactItem.getCell());
            }
            else{
                mTitleViewHolder.title.setText(contactItem.getTitle());
            }

            return view;
        }

        //禁止点击响应
        @Override
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override
        public boolean isEnabled(int position) {
            return false;
        }
    }
}
