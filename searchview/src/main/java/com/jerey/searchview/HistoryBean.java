package com.jerey.searchview;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/**
 * @author xiamin
 * @date 8/24/17.
 */
public class HistoryBean {
    private long time;
    private String type = "default";
    private Drawable mDrawable;
    private String mDrawableURL;
    private Bitmap mBitmap;
    private String content;

    public HistoryBean() {
    }

    public HistoryBean(String content) {
        this.content = content;
    }

    public HistoryBean(String type, String content) {
        this.type = type;
        this.content = content;
    }


    public HistoryBean(String type, String drawableURL, String content) {
        this.type = type;
        mDrawableURL = drawableURL;
        this.content = content;
    }

    public HistoryBean(Drawable drawable, String content) {
        mDrawable = drawable;
        this.content = content;
    }

    public HistoryBean(Bitmap bitmap, String content) {
        mBitmap = bitmap;
        this.content = content;
    }


    public Drawable getDrawable() {
        return mDrawable;
    }

    public void setDrawable(Drawable drawable) {
        mDrawable = drawable;
    }

    public String getDrawableURL() {
        return mDrawableURL;
    }

    public void setDrawableURL(String drawableURL) {
        mDrawableURL = drawableURL;
    }

    public Bitmap getBitmap() {
        return mBitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        mBitmap = bitmap;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
