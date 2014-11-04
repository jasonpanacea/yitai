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
        ContactItem contactItem = new ContactItem(Constants.TITLE,"内蒙");
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTENT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTENT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTENT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);

        contactItem = new ContactItem(Constants.TITLE,"成都");
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTENT,"伊泰煤炭股份有限公司", "+86-477-8565688", "成都市青羊区温家街188号A107楼","0477-1234567");
        contactItems.add(contactItem);

        contactItem = new ContactItem(Constants.TITLE,"海南");
        contactItems.add(contactItem);
        contactItem = new ContactItem(Constants.CONTENT,"海南伊泰置业有限责任公司", "+86-477-8565688", "海南省海口市文化路13号星历国际大厦","0477-1234567");
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
        sb.append("收到基地位发热量：>= 5500 (千卡/千克)"+"\n");
        sb.append("收到基全硫：< 0.6%"+"\n");
        sb.append("收到基灰分：<= 12%"+"\n");
        sb.append("全水分：< 16%"+"\n");
        sb.append("灰熔点软化温度：1100-1250 (℃)"+"\n");
        sb.append("收到基挥发分：22-30%"+"\n");
        commonListItem = new CommonListItem("伊泰3号",sb.toString(),Constants.CONTENT);
        commonListItems.add(commonListItem);
        sb = new StringBuilder();
        sb.append("收到基地位发热量：>= 5000 (千卡/千克)"+"\n");
        sb.append("收到基全硫：< 0.7%"+"\n");
        sb.append("收到基灰分：<= 15%"+"\n");
        sb.append("全水分：< 16%"+"\n");
        sb.append("灰熔点软化温度：1100-1250 (℃)"+"\n");
        sb.append("收到基挥发分：22-30%"+"\n");
        commonListItem = new CommonListItem("伊泰4号",sb.toString(),Constants.CONTENT);
        commonListItems.add(commonListItem);
        sb = new StringBuilder();
        sb.append("收到基地位发热量：>= 4800 (千卡/千克)"+"\n");
        sb.append("收到基全硫：< 1.0%"+"\n");
        sb.append("收到基灰分：<= 25%"+"\n");
        sb.append("全水分：< 14%"+"\n");
        sb.append("灰熔点软化温度：> 1500 (℃)"+"\n");
        sb.append("收到基挥发分：22-28%"+"\n");
        commonListItem = new CommonListItem("伊泰7号",sb.toString(),Constants.CONTENT);
        commonListItems.add(commonListItem);

        commonListItem = new CommonListItem("煤制油",Constants.TITLE);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("F-T合成柴油","产品标准编号：Q/NMYT01-2009",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("F-T合成石脑油","产品标准编号：Q/NMYT02-2009",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("F-T合成液体石蜡","产品标准编号：Q/NMYT03-2012",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("F-T合成液体石蜡1#","产品标准编号：Q/NMYT04-2012",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("煤基合成蜡","产品标准编号：Q/NMYT05-2011",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("（粗石蜡）减底油","产品标准编号：Q/NMYT06-2012",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("液化气","产品标准编号：GB 11174-1997",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("工业硫磺","产品标准编号：GB/T 2449-2006",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("调和柴油","产品标准编号：GB 252-2011",Constants.CONTENT);
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


    public static ArrayList<CommonListItem> getNewsListData(){
        ArrayList<CommonListItem> commonListItems = new ArrayList<CommonListItem>();
        CommonListItem commonListItem = new CommonListItem("7月",Constants.TITLE);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("伊泰集团举办安全生产知识竞赛","发布时间：2014年7月5日——2014年8月1日",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("成都伊泰天骄项目亚洲人居环境颁奖和...","发布时间：2014年7月5日——2014年8月1日",Constants.CONTENT);
        commonListItems.add(commonListItem);

        commonListItem = new CommonListItem("6月",Constants.TITLE);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("中煤平朔集团党委书记刘勇一行来伊泰考察调研","发布时间：2014年7月5日——2014年8月1日",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("伊泰集团召开2013年度企业文化建设表彰大会","发布时间：2014年7月5日——2014年8月1日",Constants.CONTENT);
        commonListItems.add(commonListItem);

        commonListItem = new CommonListItem("5月",Constants.TITLE);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("中央第二巡回督导组杨衍银到伊泰大地精煤矿调研指导","发布时间：2014年7月5日——2014年8月1日",Constants.CONTENT);
        commonListItems.add(commonListItem);
        commonListItem = new CommonListItem("4000吨级大型干粉煤气化炉开工会举行","发布时间：2014年7月5日——2014年8月1日",Constants.CONTENT);
        commonListItems.add(commonListItem);
        return commonListItems;
    }
}
