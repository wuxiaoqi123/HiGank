package com.tlkg.welcome.higank.base;


import android.support.v4.app.Fragment;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by wuxiaoqi on 2017/7/14.
 */

public class BaseFragment extends Fragment {

    private final String mPackageNameUmeng = this.getClass().getName();

    @Override
    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart(this.mPackageNameUmeng);
        MobclickAgent.onResume(getActivity());
    }

    @Override
    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd(this.mPackageNameUmeng);
        MobclickAgent.onPause(getActivity());
    }
}
