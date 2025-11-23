package model;

import exception.ExerciseException;
import java.util.*;

public class Exercise {
    private long id;
    private String name;
    private String targetedMuscle;
    private ArrayList<Set> sets;


    public Exercise(long id, String name, String targetedMuscle) {
        this.id = id;
        this.name = name;
        this.targetedMuscle = targetedMuscle;
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

    public String getTargetedMuscle() {
        return targetedMuscle;
    }

    public void setTargetedMuscle(String targetedMuscle) {
        this.targetedMuscle = targetedMuscle;
    }

    public ArrayList<Set> getSets() {
        return sets;
    }

    public void setSets(ArrayList<Set> sets) {
        this.sets = sets;
    }

}
