package model;

public class Food {
    private long id;
    private String name;
    private int calories;
    private int protein;
    private int carbs;
    private int fats;

    public Food(int carbs, String name, int calories, int fats, int protein, long id) {
        this.carbs = carbs;
        this.name = name;
        this.calories = calories;
        this.fats = fats;
        this.protein = protein;
        this.id = id;
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

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }
}
