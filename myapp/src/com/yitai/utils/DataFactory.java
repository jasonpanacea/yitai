package com.yitai.utils;

import com.yitai.activity.R;
import com.yitai.DO.ContactItem;

import java.util.ArrayList;

/**
 * Created by FanJiaqi on 2014/8/7.
 */
public class DataFactory {

    public static ArrayList<ContactItem> getContactData(){
        ArrayList<ContactItem> contactItems = new ArrayList<ContactItem>();
        ContactItem contactItem = new ContactItem(Constants.TITLE,"成都", R.color.darkgreen);
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTACT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTACT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTACT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);

        contactItem = new ContactItem(Constants.TITLE,"内蒙", R.color.darkorange);
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTACT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTACT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTACT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);
        return contactItems;
    }
}
