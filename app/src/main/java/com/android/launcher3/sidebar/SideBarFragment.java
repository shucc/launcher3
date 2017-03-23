package com.android.launcher3.sidebar;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.android.launcher3.R;
import com.android.launcher3.util.ScreenUtil;

/**
 * Created by shucc on 17/3/22.
 * cc@cchao.org
 */
public class SideBarFragment extends Fragment {

    private final String TAG = "LeftFragment";

    private View viewStatusBar;
    private View viewNavigationBar;

    private Activity activity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        activity = getActivity();
        View rootView = inflater.inflate(R.layout.fragment_sidebar, container, false);
        initViews(rootView);
        return rootView;
    }

    private void initViews(View rootView) {
        viewStatusBar = rootView.findViewById(R.id.view_statusBar);
        viewNavigationBar = rootView.findViewById(R.id.view_navigationBar);

        initStatusNavigation();
    }

    /**
     * 处理状态栏和底部虚拟按键
     */
    private void initStatusNavigation() {
        int statusHeight = ScreenUtil.getStatusHeight(activity);
        int navigationHeight = ScreenUtil.getBottomStatusHeight(activity);

        RelativeLayout.LayoutParams statusParams = (RelativeLayout.LayoutParams) viewStatusBar.getLayoutParams();
        statusParams.height = statusHeight;
        statusParams.width = RelativeLayout.LayoutParams.MATCH_PARENT;
        viewStatusBar.setLayoutParams(statusParams);

        RelativeLayout.LayoutParams navigationParams = (RelativeLayout.LayoutParams) viewNavigationBar.getLayoutParams();
        navigationParams.height = navigationHeight;
        navigationParams.width = RelativeLayout.LayoutParams.MATCH_PARENT;
        viewNavigationBar.setLayoutParams(navigationParams);
    }
}
