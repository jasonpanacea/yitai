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

    public static ArrayList<CommonListItem> getProductData(){
        ArrayList<CommonListItem> commonListItems = new ArrayList<CommonListItem>();
        StringBuilder sb = new StringBuilder();
        CommonListItem commonListItem = new CommonListItem("煤炭",Constants.TITLE);
        commonListItems.add(commonListItem);
        sb.append("收到基地位发热量：>= 5000 (千卡/千克)"+"\n");
        sb.append("收到基全硫：< 0.6%"+"\n");
        sb.append("收到基灰分：<= 12%"+"\n");
        sb.append("全水分：< 16%"+"\n");
        sb.append("灰熔点软化温度：1100-1250 (℃)"+"\n");
        sb.append("收到基挥发分：22-33%"+"\n");
        commonListItem = new CommonListItem("伊泰3号",sb.toString(),Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("伊泰4号",sb.toString(),Constants.CONTENT);
        commonListItems.add(commonListItem);

        commonListItem = new CommonListItem("煤油",Constants.TITLE);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("F-T合成柴油","产品标准编号：Q/MMTY101-2982123",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("F-T合成石脑油","产品标准编号：Q/MMTY101-2982123",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("F-T合成柴油","产品标准编号：Q/MMTY101-2982123",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("F-T合成石脑油","产品标准编号：Q/MMTY101-2982123",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("F-T合成柴油","产品标准编号：Q/MMTY101-2982123",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("F-T合成石脑油","产品标准编号：Q/MMTY101-2982123",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("F-T合成柴油","产品标准编号：Q/MMTY101-2982123",Constants.CONTENT);
        commonListItems.add(commonListItem);
        return commonListItems;
    }


    public static ArrayList<CommonListItem> getRecruitListData(){
        ArrayList<CommonListItem> commonListItems = new ArrayList<CommonListItem>();
        CommonListItem commonListItem = new CommonListItem("北京",Constants.TITLE);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("煤化工项目计划管理顾问","有效期：2014年7月5日——2014年8月1日",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("煤化工项目价格管理顾问（1人）","有效期：2014年7月5日——2014年8月1日",Constants.CONTENT);
        commonListItems.add(commonListItem);

        commonListItem = new CommonListItem("内蒙",Constants.TITLE);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("煤化工项目计划管理顾问","有效期：2014年7月5日——2014年8月1日",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("煤化工项目价格管理顾问（1人）","有效期：2014年7月5日——2014年8月1日",Constants.CONTENT);
        commonListItems.add(commonListItem);

        commonListItem = new CommonListItem("矿区",Constants.TITLE);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("煤化工项目计划管理顾问","有效期：2014年7月5日——2014年8月1日",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("煤化工项目价格管理顾问（1人）","有效期：2014年7月5日——2014年8月1日",Constants.CONTENT);
        commonListItems.add(commonListItem);

        commonListItem = new CommonListItem("新疆",Constants.TITLE);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("煤化工项目计划管理顾问","有效期：2014年7月5日——2014年8月1日",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("煤化工项目价格管理顾问（1人）","有效期：2014年7月5日——2014年8月1日",Constants.CONTENT);
        commonListItems.add(commonListItem);
        return commonListItems;
    }
}
