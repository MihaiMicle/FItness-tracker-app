package model;

import exception.RepositoryException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class WorkoutTest {

    @Test
    public void testConstructorAndGetters() {
        long id=1;
        String name = "Push";
        String notes = "It went well";

        Workout workout = new Workout(id, name, notes);

        assertEquals(id, workout.getId());
        assertEquals(name, workout.getName());
        assertEquals(notes, workout.getNotes());
    }

    @Test
    public void testSetters(){
        Workout workout = new Workout(0,"Mush", "ok");

        workout.setId(1);
        workout.setName("Push");
        workout.setNotes("It went well");

        assertEquals(1, workout.getId());
        assertEquals("Push", workout.getName());
        assertEquals("It went well", workout.getNotes());
    }

    @Test
    public void testAddExercise(){
        Workout workout = new Workout(0,"Push", "It went well");

        Exercise exercise1 = new Exercise(1,"Bench Press","Chest");

        workout.addExercise(exercise1);

        assertEquals(1,workout.getExercises().size());
        assertEquals(exercise1,workout.getExercises().get(0));

        Exercise exercise2 = new Exercise(2,"Leg Press","Quads");

        workout.addExercise(exercise2);

        assertEquals(2,workout.getExercises().size());
        assertEquals(exercise1,workout.getExercises().get(0));
        assertEquals(exercise2,workout.getExercises().get(1));

        List<Exercise> exercises = new ArrayList<>(Arrays.asList(exercise1,exercise2));

        assertEquals(exercises, workout.getExercises());
    }

    @Test
    public void testRemoveExercise(){
        Workout workout = new Workout(0,"Push", "It went well");

        Exercise exercise1 = new Exercise(1,"Bench Press","Chest");
        workout.addExercise(exercise1);
        Exercise exercise2 = new Exercise(2,"Leg Press","Quads");
        workout.addExercise(exercise2);

        workout.removeExercise(1);

        assertEquals(1,workout.getExercises().size());
        assertEquals(exercise2,workout.getExercises().get(0));
        Exception exception = assertThrows(RepositoryException.class, ()->{
            workout.removeExercise(99);
        });

        assertEquals("Exercise 99 does not exist.",exception.getMessage());
    }

    @Test
    public void testUpdateExercise(){
        Workout workout = new Workout(1,"Push", "It went well");
        Exercise originalExercise = new Exercise(1,"Bench Press","Chest");
        workout.addExercise(originalExercise);

        Exercise newExercise = new Exercise(2,"Leg Press","Quads");
        workout.updateExercise(1, newExercise);

        Exercise updatedExercise = workout.getExercises().get(0);
        assertEquals("Leg Press", updatedExercise.getName());
        assertEquals("Quads", updatedExercise.getTargetedMuscle());

        assertThrows(RepositoryException.class, ()->{workout.updateExercise(99, newExercise);});

    }

    @Test
    public void testToString(){
        Workout workout = new Workout(1,"Push", "It went well");
        Exercise exercise = new Exercise(1,"Bench Press","Chest");

        workout.addExercise(exercise);

        String result = workout.toString();

        assertTrue(result.contains("name='Push'"));
        assertTrue(result.contains("notes='It went well'"));
        assertTrue(result.contains("name='Bench Press'"));
        assertTrue(result.contains("targeted muscle='Chest'"));
    }
}
