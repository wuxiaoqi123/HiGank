package com.tlkg.welcome.higank;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.tlkg.welcome.higank.base.BaseActivity;
import com.tlkg.welcome.higank.statusbar.StatusBarUtil;
import com.umeng.analytics.MobclickAgent;

import butterknife.InjectView;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @InjectView(R.id.drawerlayout)
    DrawerLayout drawerLayout;

    @InjectView(R.id.status_bar_view)
    View statusBarView;

    @InjectView(R.id.nav_view)
    NavigationView navView;

    @InjectView(R.id.ll_title_menu)
    FrameLayout titleMenu;

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initWindow() {
        StatusBarUtil.setTranslucentForDrawerLayout(this, drawerLayout, 0);
        ViewGroup.LayoutParams layoutParams = statusBarView.getLayoutParams();
        layoutParams.height = StatusBarUtil.getStatusBarHeight(MainActivity.this);
        statusBarView.requestLayout();

        initLeftMenu();
    }

    private void initLeftMenu() {
        navView.setItemIconTintList(null);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.exit:
                        MobclickAgent.onKillProcess(MainActivity.this.getApplicationContext());
                        finish();
                        android.os.Process.killProcess(android.os.Process.myPid());
                        break;
                }
                return true;
            }
        });
    }

    @Override
    protected void initData() {
        titleMenu.setOnClickListener(this);
    }


    private long lastClickTime;

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(Gravity.START)) {
            drawerLayout.closeDrawer(Gravity.START);
        } else {
            if (System.currentTimeMillis() - lastClickTime > 2000) {
                Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();
                lastClickTime = System.currentTimeMillis();
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_title_menu:
                drawerLayout.openDrawer(Gravity.START);
                break;
        }
    }
}
