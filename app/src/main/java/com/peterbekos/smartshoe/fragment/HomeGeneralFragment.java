package com.peterbekos.smartshoe.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.daimajia.numberprogressbar.NumberProgressBar;
import com.peterbekos.smartshoe.App;
import com.peterbekos.smartshoe.R;

/**
 * Created by peterbekos on 4/28/15.
 */
public class HomeGeneralFragment extends BaseFragment {

    TextView stepText;
    TextView stepGoal;
    NumberProgressBar stepProgress;

    TextView caloriesText;
    TextView caloriesGoal;
    NumberProgressBar caloriesProgress;

    TextView distanceText;
    TextView distanceGoal;
    NumberProgressBar distanceProgress;

    TextView activeText;
    TextView activeGoal;
    NumberProgressBar activeProgress;

    TextView idleText;
    TextView idleGoal;
    NumberProgressBar idleProgress;

    @Override
    public String getSectionName() {
        return "Home";
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home_general;
    }

    public static HomeGeneralFragment newInstance() {
        HomeGeneralFragment fragment = new HomeGeneralFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);


        stepText = (TextView) view.findViewById(R.id.step_text);
        stepGoal = (TextView) view.findViewById(R.id.step_goal);
        stepProgress = (NumberProgressBar) view.findViewById(R.id.step_data);

        caloriesText = (TextView) view.findViewById(R.id.calorie_text);
        caloriesGoal = (TextView) view.findViewById(R.id.calorie_goal);
        caloriesProgress = (NumberProgressBar) view.findViewById(R.id.calorie_data);

        distanceText = (TextView) view.findViewById(R.id.distance_text);
        distanceGoal = (TextView) view.findViewById(R.id.distance_goal);
        distanceProgress = (NumberProgressBar) view.findViewById(R.id.distance_data);

        activeText = (TextView) view.findViewById(R.id.run_text);
        activeGoal = (TextView) view.findViewById(R.id.run_goal);
        activeProgress = (NumberProgressBar) view.findViewById(R.id.run_data);

        idleText = (TextView) view.findViewById(R.id.idle_text);
        idleGoal = (TextView) view.findViewById(R.id.idle_goal);
        idleProgress = (NumberProgressBar) view.findViewById(R.id.idle_data);



        stepText.setText("" + App.data.getSteps());
        caloriesText.setText("" + App.data.getCalories());
        distanceText.setText("" + App.data.getDistance());
        activeText.setText("" + App.data.getRunTime());
        idleText.setText("" + App.data.getIdleTime());

        stepGoal.setText("goal: " + App.settings.getStepGoal() + " steps");
        caloriesGoal.setText("goal: " + App.settings.getCalorieGoal() + " cals");
        distanceGoal.setText("goal: " + App.settings.getDistanceGoal() + " mi");
        activeGoal.setText("goal: " + App.settings.getRunGoal() + " min");
        idleGoal.setText("goal: keep under " + App.settings.getIdleGoal() + " min");

        stepProgress.setProgress((int) App.getStepProgress());
        caloriesProgress.setProgress((int) App.getCaloriesProgress());
        distanceProgress.setProgress((int) App.getDistanceProgress());
        activeProgress.setProgress((int) App.getRunProgress());
        idleProgress.setProgress((int) App.getIdleProgress());

        return view;
    }
}
