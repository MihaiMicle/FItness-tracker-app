package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    @Test
    void testConstructorAndGetters(){
        long id=1;
        int reps=8;
        double weight=12;

        Set set= new Set(id,reps, weight);

        assertEquals(id,set.getId());
        assertEquals(reps,set.getReps());
        assertEquals(weight,set.getWeight());
    }

    @Test
    void testSetters(){
        Set set= new Set(1,2,3);

        set.setId(2);
        set.setReps(3);
        set.setWeight(4);

        assertEquals(2,set.getId());
        assertEquals(3,set.getReps());
        assertEquals(4,set.getWeight());
    }

    @Test
    void testToString(){
        Set set = new Set(1,1,1);

        String result=set.toString();

        assertTrue(result.contains("id=1"));
        assertTrue(result.contains("reps=1"));
        assertTrue(result.contains("weight=1"));
    }
}

