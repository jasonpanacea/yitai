package com.yitai.DO;

/**
 * Created by FanJiaqi on 2014/8/7.
 */
public class ContactItem {
    int tag;
    String title;
    String name;
    String tele;
    String cell;

    public ContactItem(int tag, String title) {
        this.tag = tag;
        this.title = title;
    }

    public ContactItem(int tag,String title, String name, String tele, String cell) {
        this.tag = tag;
        this.name = name;
        this.tele = tele;
        this.cell = cell;
        this.title = title;
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

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
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



}
