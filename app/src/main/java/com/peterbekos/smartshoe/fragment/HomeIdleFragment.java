package com.peterbekos.smartshoe.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dacer.androidcharts.ClockPieHelper;
import com.dacer.androidcharts.ClockPieView;
import com.github.lzyzsd.circleprogress.DonutProgress;
import com.peterbekos.smartshoe.App;
import com.peterbekos.smartshoe.R;

import java.util.ArrayList;

/**
 * Created by peterbekos on 4/27/15.
 */
public class HomeIdleFragment extends BaseFragment {
    @Override
    public String getSectionName() {
        return "Idle";
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home_idle;
    }

    public static HomeIdleFragment newInstance() {
        HomeIdleFragment fragment = new HomeIdleFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  super.onCreateView(inflater, container, savedInstanceState);

        ClockPieView pieView = (ClockPieView) view.findViewById(R.id.clock_pie_view);
        DonutProgress donutProgress = (DonutProgress) view.findViewById(R.id.donut_progress);

        donutProgress.setProgress((int)App.getIdleProgress());

        ArrayList<ClockPieHelper> pieHelperArrayList = new ArrayList<ClockPieHelper>();

        pieHelperArrayList.add(new ClockPieHelper(0,00, 24,00));

        pieHelperArrayList.add(new ClockPieHelper(7, 30, 7, 45));
        pieHelperArrayList.add(new ClockPieHelper(8,15, 9,00));
        pieHelperArrayList.add(new ClockPieHelper(9,50, 10,00));
        pieHelperArrayList.add(new ClockPieHelper(10,50, 11,00));
        pieHelperArrayList.add(new ClockPieHelper(11,50, 12,00));
        pieHelperArrayList.add(new ClockPieHelper(12+1,50, 12+2,00));
        pieHelperArrayList.add(new ClockPieHelper(12+4,50, 12+6,00));
        pieHelperArrayList.add(new ClockPieHelper(12+7,30, 12+8,00));
        pieHelperArrayList.add(new ClockPieHelper(12+10,30, 12+11,00));

        pieHelperArrayList.add(new ClockPieHelper(7, 30, 7, 45));
        pieHelperArrayList.add(new ClockPieHelper(8,15, 9,00));
        pieHelperArrayList.add(new ClockPieHelper(9,50, 10,00));
        pieHelperArrayList.add(new ClockPieHelper(10,50, 11,00));
        pieHelperArrayList.add(new ClockPieHelper(11,50, 12,00));
        pieHelperArrayList.add(new ClockPieHelper(12+1,50, 12+2,00));
        pieHelperArrayList.add(new ClockPieHelper(12+4,50, 12+6,00));
        pieHelperArrayList.add(new ClockPieHelper(12+7,30, 12+8,00));
        pieHelperArrayList.add(new ClockPieHelper(12+10,30, 12+11,00));

        pieHelperArrayList.add(new ClockPieHelper(7, 30, 7, 45));
        pieHelperArrayList.add(new ClockPieHelper(8,15, 9,00));
        pieHelperArrayList.add(new ClockPieHelper(9,50, 10,00));
        pieHelperArrayList.add(new ClockPieHelper(10,50, 11,00));
        pieHelperArrayList.add(new ClockPieHelper(11,50, 12,00));
        pieHelperArrayList.add(new ClockPieHelper(12+1,50, 12+2,00));
        pieHelperArrayList.add(new ClockPieHelper(12+4,50, 12+6,00));
        pieHelperArrayList.add(new ClockPieHelper(12+7,30, 12+8,00));
        pieHelperArrayList.add(new ClockPieHelper(12+10,30, 12+11,00));

        pieView.setDate(pieHelperArrayList);

        return view;
    }
}
