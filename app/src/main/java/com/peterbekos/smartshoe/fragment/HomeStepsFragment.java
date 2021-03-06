package com.peterbekos.smartshoe.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dacer.androidcharts.BarView;
import com.github.lzyzsd.circleprogress.CircleProgress;
import com.peterbekos.smartshoe.App;
import com.peterbekos.smartshoe.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by peterbekos on 4/27/15.
 */
public class HomeStepsFragment extends BaseFragment {

    CircleProgress circleProgress;
    BarView barView;
    TextView dataText;

    @Override
    public String getSectionName() {
        return "Steps";
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home_steps;
    }

    public static HomeStepsFragment newInstance() {
        HomeStepsFragment fragment = new HomeStepsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  super.onCreateView(inflater, container, savedInstanceState);

        circleProgress = (CircleProgress) view.findViewById(R.id.circle_progress);
        barView = (BarView) view.findViewById(R.id.bar_view);
        dataText = (TextView) view.findViewById(R.id.data_text);

        circleProgress.setProgress((int)App.getStepProgress());
        dataText.setText("Total Steps: " + App.data.getSteps() + " / " + App.settings.getStepGoal());

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
