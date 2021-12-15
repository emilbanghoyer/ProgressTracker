package com.emil.ProgressTracker;

import java.util.Date;
import java.util.List;

public interface ExerciseDatabase {
    ExerciseEntry findExerciseEntryById(String id);
    List<ExerciseEntry> getAllExerciseEntries();
    ExerciseEntry insertExerciseEntry(ExerciseEntry entry);
    boolean deleteExerciseEntryById(String id);
}
