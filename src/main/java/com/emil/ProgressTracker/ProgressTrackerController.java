package com.emil.ProgressTracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgressTrackerController {

    ExerciseDatabase db;

    public ProgressTrackerController() {
        this.db = new InMemoryExerciseDatabase();
    }

    @GetMapping("/entry")
    public ExerciseEntry entry(@RequestParam(value = "id") String id) {
        return db.getExerciseEntry(id);
    }

}
