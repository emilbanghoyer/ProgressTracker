package com.emil.ProgressTracker;

import java.util.Date;

public class ExerciseEntry {
    private final String id;
    private final String exerciseName;
    private final int reps;
    private final double weight;
    private final Date date;

    public ExerciseEntry(String id, String exerciseName, int reps, double weight, Date date) {
        this.id = id;
        this.exerciseName = exerciseName;
        this.reps = reps;
        this.weight = weight;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public int getReps() {
        return reps;
    }

    public double getWeight() {
        return weight;
    }

    public Date getDate() {
        return date;
    }

}
