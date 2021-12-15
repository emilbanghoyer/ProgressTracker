package com.emil.ProgressTracker;

import java.util.Date;

public interface ExerciseDatabase {
    ExerciseEntry getExerciseEntry(String id);
    boolean insertExerciseEntry(String id, String exerciseName, int reps, double weight, Date date);
}
