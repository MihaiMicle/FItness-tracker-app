package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class ExerciseTest {
    @Test
    void TestConstructorAndGetters(){
        long id=1;
        String name="Bench Press";
        String targetedMuscle="Chest";


        Exercise exercise = new Exercise(id,name,targetedMuscle)
    }
}
