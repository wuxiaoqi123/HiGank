package com.tlkg.welcome.higank;

import android.content.Intent;
import android.widget.ImageView;

import com.tlkg.welcome.higank.base.BaseActivity;

import butterknife.InjectView;

public class LaunchActivity extends BaseActivity {

    @InjectView(R.id.launch_img_view)
    ImageView launchImg;

    @Override
    protected int getContentView() {
        return R.layout.activity_launch;
    }

    @Override
    protected void initData() {
        launchImg.postDelayed(new Runnable() {
            @Override
            public void run() {
                toMainActivity();
            }
        }, 800);
    }


    /**
     * 跳转到MainActivity
     */
    private void toMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
//        overridePendingTransition(R.anim.screen_zoom_in, R.anim.screen_zoom_out);
        overridePendingTransition(R.anim.screen_tran_enter, R.anim.screen_tran_exit);
        finish();
    }
}
