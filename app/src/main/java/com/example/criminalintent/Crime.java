package com.example.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by 王宇飞 on 2017/10/15/015.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;

    public Crime(){
        this(UUID.randomUUID());
    }

    public Crime(UUID id){
        mId = id;
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public String getSuspect(){
        return mSuspect;
    }

    public void setmSuspect(String suspect){
        mSuspect = suspect;
    }

    public String getPhotoFileName(){
        return "IMG_" + getmId().toString() + ".jpg";
    }
}
