package model;

import java.util.*;

public class Workout {
    private long id;
    private String name;
    private List<Exercise> exercises;
    private String notes;

    public Workout(long id, String name, List<Exercise> exercises, String notes) {
        this.id = id;
        this.name = name;
        this.exercises = exercises;
        this.notes = notes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


    public void addExercise(Exercise exercise) {
        this.exercises.add(exercise);
    }

    public void removeExercise(Exercise exercise) {
        this.exercises.remove(exercise);
    }


}
