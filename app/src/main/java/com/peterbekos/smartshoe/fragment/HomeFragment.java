package com.peterbekos.smartshoe.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dacer.androidcharts.ClockPieHelper;
import com.dacer.androidcharts.ClockPieView;
import com.peterbekos.smartshoe.R;

import java.util.ArrayList;

/**
 * Created by peterbekos on 3/12/15.
 */
public class HomeFragment extends BaseFragment {

    final public static String SECTION_NAME = "Home";

    TextView generalTab;
    TextView stepsTab;
    TextView caloriesTab;
    TextView distanceTab;
    TextView idleTab;

    @Override
    public String getSectionName() {
        return SECTION_NAME;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);

        generalTab = (TextView) view.findViewById(R.id.home_general_tab);
        stepsTab = (TextView) view.findViewById(R.id.home_steps_tab);
        caloriesTab = (TextView) view.findViewById(R.id.home_calories_tab);
        distanceTab = (TextView) view.findViewById(R.id.home_distance_tab);
        idleTab = (TextView) view.findViewById(R.id.home_idle_tab);

        generalTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToGeneralInfo();
            }
        });
        stepsTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSteps();
            }
        });
        caloriesTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCalories();
            }
        });
        distanceTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDistance();
            }
        });
        idleTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToIdle();
            }
        });

        goToGeneralInfo();

        return view;
    }

    private void resetTabColors() {
        generalTab.setBackgroundColor(getResources().getColor(R.color.primary));
        stepsTab.setBackgroundColor(getResources().getColor(R.color.primary));
        caloriesTab.setBackgroundColor(getResources().getColor(R.color.primary));
        distanceTab.setBackgroundColor(getResources().getColor(R.color.primary));
        idleTab.setBackgroundColor(getResources().getColor(R.color.primary));
    }

    private void goToGeneralInfo() {
        resetTabColors();
        generalTab.setBackgroundColor(getResources().getColor(R.color.primary_light));
        flipFragment(HomeGeneralFragment.newInstance());
    }

    private void goToSteps() {
        resetTabColors();
        stepsTab.setBackgroundColor(getResources().getColor(R.color.primary_light));
        flipFragment(HomeStepsFragment.newInstance());
    }

    private void goToCalories() {
        resetTabColors();
        caloriesTab.setBackgroundColor(getResources().getColor(R.color.primary_light));
        flipFragment(HomeCaloriesFragment.newInstance());
    }

    private void goToDistance() {
        resetTabColors();
        distanceTab.setBackgroundColor(getResources().getColor(R.color.primary_light));
        flipFragment(HomeDistanceFragment.newInstance());
    }

    private void goToIdle() {
        resetTabColors();
        idleTab.setBackgroundColor(getResources().getColor(R.color.primary_light));
        flipFragment(HomeIdleFragment.newInstance());
    }

    private void flipFragment(Fragment fragment) {
        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.home_frame, fragment);
        transaction.commit();
    }
}
