package com.yitai.DO;

/**
 * Created by FanJiaqi on 2014/8/7.
 */
public class ContactItem {
    int tag;
    String title;
    String name;
    String tele;
    String addr;
    String mailcode;
    int color;

    public ContactItem(int tag, String title, int color) {
        this.tag = tag;
        this.title = title;
        this.color = color;
    }

    public ContactItem(int tag, String name, String tele, String addr, String mailcode) {
        this.tag = tag;
        this.name = name;
        this.tele = tele;
        this.addr = addr;
        this.mailcode = mailcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getMailcode() {
        return mailcode;
    }

    public void setMailcode(String mailcode) {
        this.mailcode = mailcode;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

}
