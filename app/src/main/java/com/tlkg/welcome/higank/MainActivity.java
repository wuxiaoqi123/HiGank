package com.tlkg.welcome.higank;

import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;
import com.tlkg.welcome.higank.adapter.FragmentAdapter;
import com.tlkg.welcome.higank.app.MyApp;
import com.tlkg.welcome.higank.base.BaseActivity;
import com.tlkg.welcome.higank.base.BaseFragment;
import com.tlkg.welcome.higank.fragment.LiteratureFragment;
import com.tlkg.welcome.higank.fragment.RecommendFragment;
import com.tlkg.welcome.higank.fragment.WatercressFragment;
import com.tlkg.welcome.higank.fragment.WelfareFragment;
import com.tlkg.welcome.higank.listener.ImpOnPageChangeListener;
import com.tlkg.welcome.higank.statusbar.StatusBarUtil;
import com.tlkg.welcome.higank.widget.MyViewPager;
import com.umeng.analytics.MobclickAgent;

import java.util.ArrayList;
import java.util.List;

import butterknife.InjectView;
import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @InjectView(R.id.drawerlayout)
    DrawerLayout drawerLayout;

    @InjectView(R.id.status_bar_view)
    View statusBarView;

    @InjectView(R.id.tool_bar_head_iv)
    CircleImageView toolBarHeadIv;

    @InjectView(R.id.nav_view)
    NavigationView navView;

    @InjectView(R.id.ll_title_menu)
    FrameLayout titleMenu;

    @InjectView(R.id.bottomBar)
    BottomBar bottomBar;

    @InjectView(R.id.vp_content)
    MyViewPager vpContent;

    private List<BaseFragment> mFragments = new ArrayList<>();
    private FragmentAdapter mFragmentAdapter;

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
        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                toolBarHeadIv.clearAnimation();
                toolBarHeadIv.animate().alpha(1 - slideOffset).setDuration(0).start();
            }

            @Override
            public void onDrawerOpened(View drawerView) {

            }

            @Override
            public void onDrawerClosed(View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
        initLeftMenu();
    }

    private void initLeftMenu() {
        navView.setItemIconTintList(null);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                onClickLeftMenu(item);
                return true;
            }
        });
    }

    private void onClickLeftMenu(@NonNull final MenuItem item) {
        drawerLayout.closeDrawer(Gravity.START);
        drawerLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (item.getItemId()) {
                    case R.id.exit:
                        MobclickAgent.onKillProcess(MainActivity.this.getApplicationContext());
                        finish();
                        android.os.Process.killProcess(android.os.Process.myPid());
                        break;
                }
            }
        }, 290);
    }

    @Override
    protected void initData() {
        titleMenu.setOnClickListener(this);
        mFragments.add(new RecommendFragment());
        mFragments.add(new WelfareFragment());
        mFragments.add(new LiteratureFragment());
        mFragments.add(new WatercressFragment());
        mFragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), mFragments);
        vpContent.setAdapter(mFragmentAdapter);
//        vpContent.setScroll(false);
//        vpContent.setCurrentItem(0, false);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId) {
                    case R.id.tab_recommend://推荐
                        MyApp.showToast("推荐");
                        vpContent.setCurrentItem(0, false);
                        break;
                    case R.id.tab_welfare://福利
                        MyApp.showToast("福利");
                        vpContent.setCurrentItem(1, false);
                        break;
                    case R.id.tab_literature://文学
                        MyApp.showToast("文学");
                        vpContent.setCurrentItem(2, false);
                        break;
                    case R.id.tab_watercress://豆瓣
                        MyApp.showToast("豆瓣");
                        vpContent.setCurrentItem(3, false);
                        break;
                    default:
                        break;
                }
            }
        });
        vpContent.addOnPageChangeListener(new ImpOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                bottomBar.selectTabAtPosition(position);
            }
        });
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
