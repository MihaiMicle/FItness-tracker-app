package model;

import exception.RepositoryException;
import repository.ExerciseRepository;
import java.util.*;

public class Workout {
    private long id;
    private String name;
    private String notes;
    private ExerciseRepository exercises = new ExerciseRepository();

    public Workout(long id, String name, String notes) {
        this.id = id;
        this.name = name;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<Exercise> getExercises(){
        return this.exercises.getAll();
    }

    public void addExercise(Exercise ex){
        this.exercises.add(ex);
    }

    public void removeExercise(int exNumber) throws RepositoryException {
        this.exercises.remove(exNumber);
    }

    public void updateExercise(int exNumber, Exercise newExData) throws RepositoryException {
        this.exercises.update(exNumber,newExData);
    }

    @Override
    public String toString() {
        return "Workout{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", notes='" + notes + '\'' +
                ", exercises=" + exercises.getAll() +
                '}';
    }


}
