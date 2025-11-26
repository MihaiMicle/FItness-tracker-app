package model;

import exception.RepositoryException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class    ExerciseTest {
    @Test
    void testConstructorAndGetters(){
        long id=1;
        String name="Bench Press";
        String targetedMuscle="Chest";


        Exercise exercise = new Exercise(id,name,targetedMuscle);

        assertEquals(id, exercise.getId());
        assertEquals(name, exercise.getName());
        assertEquals(targetedMuscle,exercise.getTargetedMuscle());
    }

    @Test
    void testSetters(){
        Exercise exercise =new Exercise(0,"1","1");

        exercise.setId(1);
        exercise.setName("Bench Press");
        exercise.setTargetedMuscle("Chest");

        assertEquals(1,exercise.getId());
        assertEquals("Bench Press", exercise.getName());
        assertEquals("Chest", exercise.getTargetedMuscle());

    }

    @Test
    void testAddSet() {
        Exercise exercise = new Exercise(1, "Squat", "Legs");

        Set set1 = new Set(1, 10, 100.0);
        exercise.addSet(set1);

        assertEquals(1, exercise.getSets().size());
        assertEquals(set1, exercise.getSets().get(0));

        Set set2 = new Set(2, 8, 105.0);
        exercise.addSet(set2);

        assertEquals(2, exercise.getSets().size());
        assertEquals(set1, exercise.getSets().get(0));
        assertEquals(set2, exercise.getSets().get(1));

        List<Set> sets = new ArrayList<>(Arrays.asList(set1, set2));

        assertEquals(sets, exercise.getSets());
    }

    @Test
    void testRemoveSet() {
        Exercise exercise = new Exercise(1, "Deadlift", "Back");
        Set set1 = new Set(1, 5, 120.0);
        Set set2 = new Set(2, 5, 125.0);

        exercise.addSet(set1);
        exercise.addSet(set2);

        exercise.removeSet(1);

        assertEquals(1, exercise.getSets().size());
        assertEquals(set2, exercise.getSets().get(0));
        Exception exception = assertThrows(RepositoryException.class, () -> {
            exercise.removeSet(99);
        });

        assertEquals("Set 99 does not exist.", exception.getMessage());
    }


    @Test
    void testUpdateSet() {
        Exercise exercise = new Exercise(1, "Bench Press", "Chest");
        Set originalSet = new Set(1, 10, 60.0);
        exercise.addSet(originalSet);

        Set newSetData = new Set(1, 8, 65.0);

        exercise.updateSet(1, newSetData);

        Set updatedSet = exercise.getSets().get(0);
        assertEquals(8, updatedSet.getReps());
        assertEquals(65.0, updatedSet.getWeight());

        assertThrows(RepositoryException.class, () -> {
            exercise.updateSet(5, newSetData);
        });
    }


    @Test
    void testToString() {
        Exercise exercise = new Exercise(1, "Pull Up", "Back");
        Set set1 = new Set(1, 12, 0.0);

        exercise.addSet(set1);

        String result = exercise.toString();

        assertTrue(result.contains("name='Pull Up'"));
        assertTrue(result.contains("targeted muscle='Back'"));
        assertTrue(result.contains("id=1"));
        assertTrue(result.contains("reps=12"));
    }





}
