package com.tlkg.welcome.higank.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by wuxiaoqi on 2017/8/12.
 */

public class MyViewPager extends ViewPager {
    private static final String TAG = "MyViewPager";

    /**
     * 是否滑动
     */
    private boolean scroll = true;

    public MyViewPager(Context context) {
        this(context, null);
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public void setCurrentItem(int item) {
        super.setCurrentItem(item);
    }

    @Override
    public void setCurrentItem(int item, boolean smoothScroll) {
        if (item == getCurrentItem()) {
            return;
        }
        super.setCurrentItem(item, smoothScroll);
    }

    public void setScroll(boolean scroll) {
        this.scroll = scroll;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (scroll) {
            return super.onTouchEvent(ev);
        }
        return false;
    }
}
