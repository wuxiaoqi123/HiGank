package com.tlkg.welcome.higank.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.tlkg.welcome.higank.base.BaseFragment;
import com.tlkg.welcome.higank.fragment.RecommendFragment;

import java.util.List;

/**
 * Created by wuxiaoqi on 2017/7/14.
 */

public class FragmentAdapter extends FragmentStatePagerAdapter {

    private List<BaseFragment> mFragments;

    public FragmentAdapter(FragmentManager fm, List<BaseFragment> fragments) {
        super(fm);
        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        if (mFragments == null) {
            throw new IllegalArgumentException("mFragments is null!!!");
        }
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        if (mFragments == null) {
            return 0;
        }
        return mFragments.size();
    }
}
