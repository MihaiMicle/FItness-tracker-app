package model;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
     void testConstructorAndGetters() {
        long id = 1;
        String username = "john_doe";
        String password = "securePass123";
        String email = "john@example.com";
        String phone = "123-456-7890";
        LocalDate birthdate = LocalDate.of(1990, 5, 20);
        int caloriesGoal = 2500;
        int proteinGoal = 180;
        int carbsGoal = 250;
        int fatGoal = 70;
        int currentWeight = 80;
        int height = 180;


        User user = new User(
                height, currentWeight, fatGoal, carbsGoal, proteinGoal,
                caloriesGoal, birthdate, phone, email, password, username, id
        );

        assertEquals(id, user.getId());
        assertEquals(username, user.getUsername());
        assertEquals(password, user.getPassword());
        assertEquals(email, user.getEmail());
        assertEquals(phone, user.getPhone());
        assertEquals(birthdate, user.getBirthdate());
        assertEquals(caloriesGoal, user.getCaloriesGoal());
        assertEquals(proteinGoal, user.getProteinGoal());
        assertEquals(carbsGoal, user.getCarbsGoal());
        assertEquals(fatGoal, user.getFatGoal());
        assertEquals(currentWeight, user.getCurrentWeight());
        assertEquals(height, user.getHeight());
    }

    @Test
    void testSetters() {
        User user = new User(0, 0, 0, 0, 0, 0, LocalDate.now(), "", "", "", "", 0L);

        user.setUsername("jane_doe");
        user.setCurrentWeight(65);
        user.setCaloriesGoal(2000);

        assertEquals("jane_doe", user.getUsername());
        assertEquals(65, user.getCurrentWeight());
        assertEquals(2000, user.getCaloriesGoal());
    }

    @Test
    void testToString() {
        LocalDate dob = LocalDate.of(2000, 1, 1);
        User user = new User(
                170, 70, 50, 200, 150,
                2000, dob, "555-0199", "test@mail.com", "pass", "tester", 100L
        );

        String result = user.toString();

        assertTrue(result.contains("id=100"));
        assertTrue(result.contains("username='tester'"));
        assertTrue(result.contains("email='test@mail.com'"));
    }
}