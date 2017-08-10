package com.tlkg.welcome.higank.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tlkg.welcome.higank.R;
import com.tlkg.welcome.higank.base.BaseFragment;

import java.util.List;

import bean.TurnPictureBean;
import http.HttpClient;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by wuxiaoqi on 2017/7/14.
 */

public class RecommendFragment extends BaseFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recommend, null);
        Log.i("wxq", "onCreateView");
        initData();
        return view;
    }

    private void initData() {
        HttpClient.Builder.getTingServer().getFrontpage()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<TurnPictureBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("wxq","错误 :"+e.toString());
                    }

                    @Override
                    public void onNext(TurnPictureBean turnPictureBean) {
                        List<TurnPictureBean.ResultBeanXXXXXXXXXXXXXXXXX.FocusBean.ResultBeanXXXXXXXXXXXXX> result = turnPictureBean.getResult().getFocus().getResult();
                        Log.i("wxq", result.toString());
                    }
                });
    }

}
