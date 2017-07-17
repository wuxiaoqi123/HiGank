package com.tlkg.welcome.higank.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tlkg.welcome.higank.R;
import com.tlkg.welcome.higank.base.BaseFragment;

/**
 * Created by wuxiaoqi on 2017/7/14.
 */

public class WelfareFragment extends BaseFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recommend, null);
        Log.i("wxq", "onCreateView");
        return view;
    }

}
