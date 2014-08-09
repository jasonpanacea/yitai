package com.yitai.utils;

import com.yitai.DO.CommonListItem;
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
        contactItem = new ContactItem(Constants.CONTENT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTENT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTENT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);

        contactItem = new ContactItem(Constants.TITLE,"内蒙", R.color.darkorange);
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTENT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTENT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTENT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);
        return contactItems;
    }


    public static ArrayList<CommonListItem> getCommonListData(){
        ArrayList<CommonListItem> commonListItems = new ArrayList<CommonListItem>();
        CommonListItem commonListItem = new CommonListItem("工程",Constants.TITLE);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("阿尔玛勒煤矿露天剥离工程招标答疑","2014年7月5日",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("阿尔玛勒煤矿露天剥离工程招标答疑","2014年7月5日",Constants.CONTENT);
        commonListItems.add(commonListItem);

        commonListItem = new CommonListItem("物资",Constants.TITLE);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("阿尔玛勒煤矿露天剥离工程招标答疑","2014年7月5日",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("阿尔玛勒煤矿露天剥离工程招标答疑","2014年7月5日",Constants.CONTENT);
        commonListItems.add(commonListItem);

        return commonListItems;
    }
}
