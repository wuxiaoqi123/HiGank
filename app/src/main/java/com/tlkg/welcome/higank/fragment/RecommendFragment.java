package com.tlkg.welcome.higank.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tlkg.welcome.higank.R;
import com.tlkg.welcome.higank.app.MyApp;
import com.tlkg.welcome.higank.base.BaseFragment;
import com.tlkg.welcome.higank.load.BannerImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import bean.TurnPictureBean;
import butterknife.ButterKnife;
import butterknife.InjectView;
import http.HttpClient;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by wuxiaoqi on 2017/7/14.
 */

public class RecommendFragment extends BaseFragment {

    private static String TAG = "RecommendFragment";

    Banner banner;

    private ArrayList<String> bannerImgs;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recommend, null);
        Log.i(TAG, "onCreateView");
        banner = (Banner) view.findViewById(R.id.banner);
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
                        MyApp.showToast(e.getMessage());
                    }

                    @Override
                    public void onNext(TurnPictureBean turnPictureBean) {
                        List<TurnPictureBean.ResultBeanXXXXXXXXXXXXXXXXX.FocusBean.ResultBeanXXXXXXXXXXXXX> result =
                                turnPictureBean.getResult().getFocus().getResult();
                        if (bannerImgs == null) {
                            bannerImgs = new ArrayList<String>();
                        }
                        bannerImgs.clear();
                        for (int i = 0; i < result.size(); i++) {
                            Log.i("wxq", result.get(i).getRandpic());
                            bannerImgs.add(result.get(i).getRandpic());
                        }
                        banner.setImages(bannerImgs).setImageLoader(new BannerImageLoader()).start();
                    }
                });
    }

}
