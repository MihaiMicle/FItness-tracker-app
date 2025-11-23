package model;

public class Set {
    private long id;
    private int reps;
    private double weight;

    public Set(long id, int reps, double weight) {
        this.id = id;
        this.reps = reps;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
