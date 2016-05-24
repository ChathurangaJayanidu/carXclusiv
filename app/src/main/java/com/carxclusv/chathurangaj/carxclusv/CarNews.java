package com.carxclusv.chathurangaj.carxclusv;

/**
 * Created by DELL on 1/8/2016.
 */
public class CarNews {
    private String mName;
    private String mDes;
    private int mThumbnail;
    private String mDate;
    private String mNewsType;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getDes() {
        return mDes;
    }

    public void setDes(String des) {
        this.mDes = des;
    }

    public int getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.mThumbnail = thumbnail;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmNewsType() {
        return mNewsType;
    }

    public void setmNewsType(String mNewsType) {
        this.mNewsType = mNewsType;
    }
}
