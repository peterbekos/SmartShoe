package com.peterbekos.smartshoe.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.peterbekos.smartshoe.R;

/**
 * Created by peterbekos on 3/23/15.
 */
public class StatsFragment extends BaseFragment {

    public static final String SECTION_NAME = "History / Stats";

    @Override
    public String getSectionName() {
        return SECTION_NAME;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_stats;
    }

    public static StatsFragment newInstance() {
        StatsFragment fragment = new StatsFragment();
        return fragment;
    }

    public StatsFragment() {
    }

}