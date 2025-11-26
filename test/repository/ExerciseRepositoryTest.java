package repository;

import model.*;
import exception.RepositoryException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ExerciseRepositoryTest {
    private ExerciseRepository repository;

    @BeforeEach
    public void setup(){
        repository = new ExerciseRepository();
    }

    @Test
    public void testAddAndGetAll(){
        Set set1 = new Set(1,4,90);
        Set set2 = new Set(2,3,90);
        Set set3 = new Set(3,7,80);

        Exercise ex1 = new Exercise(1, "Bench Press", "Chest");

        ex1.addSet(set1);
        ex1.addSet(set2);
        ex1.addSet(set3);

        repository.add(ex1);

        List<Exercise> exs = repository.getAll();

        assertEquals(1,exs.size());
        assertEquals(ex1,exs.get(0));

    }

    @Test
    void testRemoveExerciseSuccess(){
        Exercise ex1 = new Exercise(1, "Bench Press", "Chest");
        Exercise ex2 = new Exercise(1, "Incline Bench Press", "Chest");

        repository.add(ex1);
        repository.add(ex2);

        repository.remove(1);

        List<Exercise> exs = repository.getAll();
        assertEquals(1,exs.size());
        assertEquals(ex2,exs.get(0), "The remaining exercise should be execise2");
    }

    @Test
    void testRemoveExerciseFailure(){
        Exercise ex1 = new Exercise(1, "Bench Press", "Chest");
        repository.add(ex1);

        Exception exception = assertThrows(RepositoryException.class, () -> {repository.remove(2);
    });

        assertEquals("Exercise 2 does not exist.", exception.getMessage());

        assertThrows(RepositoryException.class, () -> {
            repository.remove(0);
        });
    }

    @Test
    void testUpdateExerciseSuccess(){
        Exercise originalEx = new Exercise(1, "Bench Press", "Chest");
        repository.add(originalEx);

        Exercise newEx = new Exercise(1, "Leg Press", "Quads");
        repository.update(1, newEx);

        Exercise updatedEx = repository.getAll().get(0);
        assertEquals("Leg Press", updatedEx.getName());
        assertEquals("Quads", updatedEx.getTargetedMuscle());
    }

    @Test
    void testUpdateExerciseFailure(){
        Exercise originalEx = new Exercise(1, "Bench Press", "Chest");
        repository.add(originalEx);

        Exercise newEx = new Exercise(1, "Leg Press", "Quads");

        Exception exception = assertThrows(RepositoryException.class, () -> {repository.update(6, newEx);});

        assertEquals("Exercise 6 does not exist.", exception.getMessage());
    }
}
