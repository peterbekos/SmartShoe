package com.peterbekos.smartshoe.fragment;

import android.os.Bundle;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dacer.androidcharts.BarView;
import com.github.lzyzsd.circleprogress.CircleProgress;
import com.google.android.gms.maps.SupportMapFragment;
import com.peterbekos.smartshoe.App;
import com.peterbekos.smartshoe.R;

import java.util.ArrayList;

/**
 * Created by peterbekos on 4/27/15.
 */
public class HomeDistanceFragment extends BaseFragment {

    private static View view;

    CircleProgress circleProgress;
    TextView dataText;

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

        if (view != null) {
        ViewGroup parent = (ViewGroup) view.getParent();
        if (parent != null)
            parent.removeView(view);
        }
        try {
            view = super.onCreateView(inflater, container, savedInstanceState);
        } catch (InflateException e) {

        }

        circleProgress = (CircleProgress) view.findViewById(R.id.circle_progress);
        dataText = (TextView) view.findViewById(R.id.data_text);

        dataText.setText("Total Distance: " + App.data.getDistance() + " / " + App.settings.getDistanceGoal());


        circleProgress.setProgress((int) App.getDistanceProgress());


        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        SupportMapFragment f = (SupportMapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        if (f != null)
            getFragmentManager().beginTransaction().remove(f).commit();
    }
}
