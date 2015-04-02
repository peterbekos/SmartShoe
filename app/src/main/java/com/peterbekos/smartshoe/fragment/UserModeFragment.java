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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_usermode, container, false);
        return rootView;
    }


}
