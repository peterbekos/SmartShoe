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
public class TestFragment extends BaseFragment {

    public static final String SECTION_NAME = "Test Mode";

    @Override
    public String getSectionName() {
        return SECTION_NAME;
    }

    public static TestFragment newInstance() {
        TestFragment fragment = new TestFragment();
        return fragment;
    }

    public TestFragment() {
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_testmode;
    }

}