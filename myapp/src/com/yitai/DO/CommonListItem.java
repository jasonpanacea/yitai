package com.yitai.DO;

/**
 * Created by FanJiaqi on 2014/8/9.
 */
public class CommonListItem {
    private String title;
    private String subtitle;
    private int tag;

    public CommonListItem(String title, String subtitle, int tag) {
        this.title = title;
        this.subtitle = subtitle;
        this.tag = tag;
    }

    public CommonListItem(String title, int tag) {
        this.title = title;
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
}
