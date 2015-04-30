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
public class SettingsFragment extends BaseFragment {

    public static final String SECTION_NAME = "Settings";

    @Override
    public String getSectionName() {
        return SECTION_NAME;
    }

    public static SettingsFragment newInstance() {
        SettingsFragment fragment = new SettingsFragment();
        return fragment;
    }

    public SettingsFragment() {
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_settings;
    }
}