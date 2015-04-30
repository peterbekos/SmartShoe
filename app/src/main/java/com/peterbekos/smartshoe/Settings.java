package com.peterbekos.smartshoe;

/**
 * Created by peterbekos on 4/29/15.
 */
public class Settings {

    private int stepGoal = 0;
    private int calorieGoal = 0;
    private float distanceGoal = 0;
    private float runGoal = 0;
    private float idleGoal = 0;

    public Settings() {

    }

    public int getStepGoal() {
        return stepGoal;
    }

    public void setStepGoal(int stepGoal) {
        this.stepGoal = stepGoal;
    }

    public int getCalorieGoal() {
        return calorieGoal;
    }

    public void setCalorieGoal(int calorieGoal) {
        this.calorieGoal = calorieGoal;
    }

    public float getDistanceGoal() {
        return distanceGoal;
    }

    public void setDistanceGoal(float distanceGoal) {
        this.distanceGoal = distanceGoal;
    }

    public float getRunGoal() {
        return runGoal;
    }

    public void setRunGoal(float runGoal) {
        this.runGoal = runGoal;
    }

    public float getIdleGoal() {
        return idleGoal;
    }

    public void setIdleGoal(float idleGoal) {
        this.idleGoal = idleGoal;
    }

}
