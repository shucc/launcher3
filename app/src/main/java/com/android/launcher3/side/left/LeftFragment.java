package com.android.launcher3.side.left;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.launcher3.R;

/**
 * Created by shucc on 17/3/22.
 * cc@cchao.org
 */
public class LeftFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_letf_side, container, false);
        return rootView;
    }
}
