package com.emil.ProgressTracker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryExerciseDatabase implements ExerciseDatabase {

    List<ExerciseEntry> exerciseEntries;

    public InMemoryExerciseDatabase() {
        exerciseEntries = new ArrayList<>();

        ExerciseEntry e1 = new ExerciseEntry("1", "Squat", 8, 80, new Date());
        ExerciseEntry e2 = new ExerciseEntry("2", "Deadlift", 5, 120, new Date());
        ExerciseEntry e3 = new ExerciseEntry("3", "Bench Press", 8, 60, new Date());
        ExerciseEntry e4 = new ExerciseEntry("4", "Dips", 10, 0, new Date());
        ExerciseEntry e5 = new ExerciseEntry("5", "Military Press", 6, 50, new Date());
        ExerciseEntry e6 = new ExerciseEntry("6", "Barbell Rows", 8, 60, new Date());
        exerciseEntries.add(e1);
        exerciseEntries.add(e2);
        exerciseEntries.add(e3);
        exerciseEntries.add(e4);
        exerciseEntries.add(e5);
        exerciseEntries.add(e6);
    }

    @Override
    public ExerciseEntry getExerciseEntry(String id) {
        for (ExerciseEntry e : exerciseEntries) {
            if (e.getId().equals(id)) return e;
        }
        return null;
    }

    @Override
    public boolean insertExerciseEntry(String id, String exerciseName, int reps, double weight, Date date) {
        ExerciseEntry entry = new ExerciseEntry(id, exerciseName, reps, weight, date);
        exerciseEntries.add(entry);
        return true;
    }
}
