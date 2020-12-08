package com.fbmeylis.breakingbadcast;

import android.graphics.Bitmap;

import java.io.Serializable;

public class BreakingBad implements Serializable {

    private String realname;
    private String castname;
    private int pictureid;

    public BreakingBad(String realname, String castname, int pictureid) {
        this.realname = realname;
        this.castname = castname;
        this.pictureid = pictureid;
    }

    public String getRealname() {
        return realname;
    }

    public String getCastname() {
        return castname;
    }

    public int getPictureid() {
        return pictureid;
    }
}
