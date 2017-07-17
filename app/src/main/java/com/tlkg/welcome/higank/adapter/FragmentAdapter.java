package com.tlkg.welcome.higank.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.tlkg.welcome.higank.fragment.RecommendFragment;

/**
 * Created by wuxiaoqi on 2017/7/14.
 */

public class FragmentAdapter extends FragmentStatePagerAdapter {


    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
//        switch (position) {
//            case 0:
        Log.i("wxq", "getItem" + position);
        fragment = new RecommendFragment();
//        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
