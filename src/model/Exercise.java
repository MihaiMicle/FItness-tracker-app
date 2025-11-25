package model;

import java.util.*;
import exception.RepositoryException;
import repository.SetRepository;

public class Exercise {
    private long id;
    private String name;
    private String targetedMuscle;
    private SetRepository sets = new SetRepository();


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

    public List<Set> getSets(){
        return this.sets.getAll();
    }

    public void addSet(Set set){
        this.sets.add(set);
    }

    public void removeSet(int setNumber) throws RepositoryException {
        this.sets.remove(setNumber);
    }

    public void updateSet(int setNumber, Set newSetData) throws RepositoryException {
        this.sets.update(setNumber,newSetData);
    }



    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", targetedMuscle='" + targetedMuscle + '\'' +
                ", sets=" + sets.getAll() +
                '}';
    }
}
