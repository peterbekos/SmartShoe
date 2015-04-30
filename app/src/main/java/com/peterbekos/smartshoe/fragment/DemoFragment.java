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
public class DemoFragment extends BaseFragment {

    final public static String SECTION_NAME = "Tutorial / Demo";

    @Override
    public String getSectionName() {
        return SECTION_NAME;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_demo;
    }

    public static DemoFragment newInstance() {
        DemoFragment fragment = new DemoFragment();
        return fragment;
    }

    public DemoFragment() {
    }

}
