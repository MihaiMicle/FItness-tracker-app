package model;

import java.time.LocalDate;

public class User {
    private long id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private LocalDate birthdate;
    private int caloriesGoal;
    private int proteinGoal;
    private int carbsGoal;
    private int fatGoal;
    private int currentWeight;
    private int height;


    public User(int height, int currentWeight, int fatGoal, int carbsGoal, int proteinGoal,
                int caloriesGoal, LocalDate birthdate, String phone, String email,
                String password, String username, long id) {
        this.height = height;
        this.currentWeight = currentWeight;
        this.fatGoal = fatGoal;
        this.carbsGoal = carbsGoal;
        this.proteinGoal = proteinGoal;
        this.caloriesGoal = caloriesGoal;
        this.birthdate = birthdate;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.username = username;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getCaloriesGoal() {
        return caloriesGoal;
    }

    public void setCaloriesGoal(int caloriesGoal) {
        this.caloriesGoal = caloriesGoal;
    }

    public int getProteinGoal() {
        return proteinGoal;
    }

    public void setProteinGoal(int proteinGoal) {
        this.proteinGoal = proteinGoal;
    }

    public int getCarbsGoal() {
        return carbsGoal;
    }

    public void setCarbsGoal(int carbsGoal) {
        this.carbsGoal = carbsGoal;
    }

    public int getFatGoal() {
        return fatGoal;
    }

    public void setFatGoal(int fatGoal) {
        this.fatGoal = fatGoal;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birthdate=" + birthdate +
                ", caloriesGoal=" + caloriesGoal +
                ", proteinGoal=" + proteinGoal +
                ", carbsGoal=" + carbsGoal +
                ", fatGoal=" + fatGoal +
                ", currentWeight=" + currentWeight +
                ", height=" + height +
                '}';
    }
}
