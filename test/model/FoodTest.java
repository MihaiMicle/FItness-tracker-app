package model;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class FoodTest {

    @Test
    public void testConstructorAndGetters(){
        long id=1;
        String name = "Egg";
        int calories = 100;
        int protein = 10;
        int carbs = 0;
        int fats = 5;

        Food food = new Food(id, name, calories, protein, carbs, fats);

        assertEquals(id, food.getId());
        assertEquals(name, food.getName());
        assertEquals(calories, food.getCalories());
        assertEquals(protein, food.getProtein());
        assertEquals(carbs, food.getCarbs());
        assertEquals(fats, food.getFats());
    }

    @Test
    public void testSetters(){
        Food food = new Food(0, "Test", 0, 0, 1, 0);

        food.setId(1);
        food.setName("Egg");
        food.setCalories(100);
        food.setProtein(10);
        food.setCarbs(0);
        food.setFats(5);

        assertEquals(1, food.getId());
        assertEquals("Egg", food.getName());
        assertEquals(100, food.getCalories());
        assertEquals(10, food.getProtein());
        assertEquals(0, food.getCarbs());
        assertEquals(5, food.getFats());
    }

    @Test
    public void testTOString(){
        Food food = new Food(1, "Egg", 100, 10, 0, 5);

        String result = food.toString();

        assertTrue(result.contains("id=1"));
        assertTrue(result.contains("name='Egg'"));
        assertTrue(result.contains("calories=100"));
        assertTrue(result.contains("protein=10"));
        assertTrue(result.contains("carbs=0"));
        assertTrue(result.contains("fats=5"));
    }
}
