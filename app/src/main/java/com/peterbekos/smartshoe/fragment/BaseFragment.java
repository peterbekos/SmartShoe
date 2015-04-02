package com.peterbekos.smartshoe.fragment;

import android.support.v4.app.Fragment;

/**
 * Created by peterbekos on 3/23/15.
 */
public abstract class BaseFragment extends Fragment {

    /**
     * This is not really neccesary, but I put this here to enforce the
     * public static final SECTION_NAME convention
     * @return SECTION_NAME
     */

    abstract public String getSectionName();
}
