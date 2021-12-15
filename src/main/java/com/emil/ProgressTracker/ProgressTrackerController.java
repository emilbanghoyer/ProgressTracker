package com.emil.ProgressTracker;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProgressTrackerController {

    ExerciseDatabase db;

    public ProgressTrackerController() {
        this.db = new InMemoryExerciseDatabase();
    }

    @GetMapping("/entries")
    public List<ExerciseEntry> allEntries() {
        return db.getAllExerciseEntries();
    }

    @GetMapping("/entries/{id}")
    public ExerciseEntry entryById(@PathVariable String id) {
        return db.findExerciseEntryById(id);
    }

    @PostMapping("/entries")
    public ExerciseEntry newEntry(@RequestBody ExerciseEntry entry) {
        return db.insertExerciseEntry(entry);
    }

    @DeleteMapping("/entries/{id}")
    public void deleteEntryById(@PathVariable String id) {
        db.deleteExerciseEntryById(id);
    }

}
