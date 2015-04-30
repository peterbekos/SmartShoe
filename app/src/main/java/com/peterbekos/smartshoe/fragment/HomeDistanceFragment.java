package com.peterbekos.smartshoe.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dacer.androidcharts.BarView;
import com.github.lzyzsd.circleprogress.CircleProgress;
import com.peterbekos.smartshoe.App;
import com.peterbekos.smartshoe.R;

import java.util.ArrayList;

/**
 * Created by peterbekos on 4/27/15.
 */
public class HomeDistanceFragment extends BaseFragment {

    CircleProgress circleProgress;

    @Override
    public String getSectionName() {
        return "Distance";
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home_distance;
    }

    public static HomeDistanceFragment newInstance() {
        HomeDistanceFragment fragment = new HomeDistanceFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  super.onCreateView(inflater, container, savedInstanceState);

        circleProgress = (CircleProgress) view.findViewById(R.id.circle_progress);


        circleProgress.setProgress((int) App.getDistanceProgress());


        return view;
    }
}
