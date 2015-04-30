package com.peterbekos.smartshoe.activity;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;

import com.peterbekos.smartshoe.App;
import com.peterbekos.smartshoe.fragment.DemoFragment;
import com.peterbekos.smartshoe.fragment.HomeFragment;
import com.peterbekos.smartshoe.fragment.InfoFragment;
import com.peterbekos.smartshoe.fragment.NavigationDrawerFragment;
import com.peterbekos.smartshoe.R;
import com.peterbekos.smartshoe.fragment.RunFragment;
import com.peterbekos.smartshoe.fragment.SettingsFragment;
import com.peterbekos.smartshoe.fragment.StatsFragment;
import com.peterbekos.smartshoe.fragment.TestFragment;
import com.peterbekos.smartshoe.fragment.UserModeFragment;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));

        setMockData();
    }

    private void setMockData() {
        App.settings.setStepGoal(10000);
        App.settings.setCalorieGoal(1500);
        App.settings.setDistanceGoal(1.5f);
        App.settings.setRunGoal(45f);
        App.settings.setIdleGoal(60f);

        App.data.setSteps(5000);
        App.data.setCalories(1200);
        App.data.setDistance(0.75f);
        App.data.setRunTime(20f);
        App.data.setIdleTime(50f);
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {

        final String sectionString = App.navDrawerSections[position];
        mTitle = sectionString;

        Fragment fragment = null;

        if (sectionString.equals(HomeFragment.SECTION_NAME)) {
            fragment = HomeFragment.newInstance();
        } else if (sectionString.equals(UserModeFragment.SECTION_NAME)) {
            fragment = UserModeFragment.newInstance();
        } else if (sectionString.equals(RunFragment.SECTION_NAME)) {
            fragment = RunFragment.newInstance();
        } else if (sectionString.equals(TestFragment.SECTION_NAME)) {
            fragment = TestFragment.newInstance();
        } else if (sectionString.equals(StatsFragment.SECTION_NAME)) {
            fragment = StatsFragment.newInstance();
        } else if (sectionString.equals(DemoFragment.SECTION_NAME)) {
            fragment = DemoFragment.newInstance();
        } else if (sectionString.equals(InfoFragment.SECTION_NAME)) {
            fragment = InfoFragment.newInstance();
        } else if (sectionString.equals(SettingsFragment.SECTION_NAME)) {
            fragment = SettingsFragment.newInstance();
        }


        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.container, fragment)
                    .commit();
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*
        if (id == R.id.action_settings) {
            return true;
        }
        */

        return super.onOptionsItemSelected(item);
    }


}
