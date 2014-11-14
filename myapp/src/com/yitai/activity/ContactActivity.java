package com.yitai.activity;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yitai.DO.ContactItem;
import com.yitai.adapter.TitleViewHolder;
import com.yitai.utils.Constants;
import com.yitai.utils.DataFactory;
import com.yitai.utils.Utils;

/**
 * Created by FanJiaqi on 2014/8/6.
 */
public class ContactActivity extends Activity {
    private ListView contactList;
    private ArrayList<ContactItem> contactItems = new ArrayList<ContactItem>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.contact);
        TextView title = (TextView) findViewById(R.id.header_text);
        contactList = (ListView) findViewById(R.id.contact_list);

        title.setText("联系方式");
        ArrayList<ContactItem> contactItems = DataFactory.getContactData();
        ContactAdapter ca = new ContactAdapter(this,contactItems);
        contactList.setAdapter(ca);
    }


    private class ContactViewHolder{
        TextView name;
        TextView addr_text;
        TextView mailcode_text;
        TextView tele_text;
    }
    


    private class ContactAdapter extends BaseAdapter{
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
                    mContactViewHolder.addr_text = (TextView) view.findViewById(R.id.addr_text);
                    mContactViewHolder.tele_text = (TextView) view.findViewById(R.id.tele_text);
                    mContactViewHolder.mailcode_text = (TextView) view.findViewById(R.id.mailcode_text);
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
                mContactViewHolder.name.setText(contactItem.getName());
                mContactViewHolder.tele_text.setText(contactItem.getTele());
                mContactViewHolder.addr_text.setText(contactItem.getAddr());
                mContactViewHolder.mailcode_text.setText(contactItem.getMailcode());
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
            return contactItems.get(position).getTag()==Constants.CONTENT;
        }
    }
}
