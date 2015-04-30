package com.peterbekos.smartshoe.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.peterbekos.smartshoe.R;

/**
 * Created by peterbekos on 3/17/15.
 */
public class UserModeFragment extends BaseFragment {
    @Override
    public int getLayoutId() {
        return R.layout.fragment_usermode;
    }

    public static final String SECTION_NAME = "User Mode";

    @Override
    public String getSectionName() {
        return SECTION_NAME;
    }

    public static UserModeFragment newInstance() {
        UserModeFragment fragment = new UserModeFragment();
        return fragment;
    }

    public UserModeFragment() {

    }

}
