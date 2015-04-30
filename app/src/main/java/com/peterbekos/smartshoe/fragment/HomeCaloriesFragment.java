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
public class HomeCaloriesFragment extends BaseFragment {

    CircleProgress circleProgress;
    BarView barView;

    @Override
    public String getSectionName() {
        return "Calories";
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home_calories;
    }

    public static HomeCaloriesFragment newInstance() {
        HomeCaloriesFragment fragment = new HomeCaloriesFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  super.onCreateView(inflater, container, savedInstanceState);

        circleProgress = (CircleProgress) view.findViewById(R.id.circle_progress);
        barView = (BarView) view.findViewById(R.id.bar_view);

        circleProgress.setProgress((int) App.getCaloriesProgress());

        //5000 / 10000

        final ArrayList<String> strings = new ArrayList<String>();
        strings.add("7AM");
        strings.add("8AM");
        strings.add("9AM");
        strings.add("10AM");
        strings.add("11AM");
        strings.add("12PM");
        strings.add("1PM");
        strings.add("2PM");
        strings.add("3PM");
        strings.add("4PM");
        strings.add("5PM");
        strings.add("6PM");
        strings.add("7PM");
        strings.add("8PM");
        final ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(0);
        integers.add(100);
        integers.add(900);
        integers.add(50);
        integers.add(150);
        integers.add(700);
        integers.add(50);
        integers.add(0);
        integers.add(50);
        integers.add(900);
        integers.add(1000);
        integers.add(750);
        integers.add(50);
        integers.add(200);

        barView.setBottomTextList(strings);
        barView.setDataList(integers, 1500);

        return view;
    }
}
