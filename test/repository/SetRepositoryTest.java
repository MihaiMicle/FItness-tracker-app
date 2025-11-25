package repository;

import model.*;
import exception.RepositoryException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SetRepositoryTest {

    private SetRepository repository;

    @BeforeEach
    void setUp() {
        repository = new SetRepository();
    }

    @Test
    void testAddAndGetSets() {
        Set set1 = new Set(1, 10, 50.0);
        repository.add(set1);

        List<Set> sets = repository.getAll();

        assertEquals(1, sets.size());
        assertEquals(set1, sets.get(0));
    }

    @Test
    void testRemoveSetSuccess() {
        Set set1 = new Set(1, 10, 50.0);
        Set set2 = new Set(2, 8, 60.0);
        repository.add(set1);
        repository.add(set2);

        repository.remove(1);

        List<Set> sets = repository.getAll();
        assertEquals(1, sets.size());
        assertEquals(set2, sets.get(0), "The remaining set should be set2");
    }

    @Test
    void testRemoveSetFailure() {
        Set set1 = new Set(1, 10, 50.0);
        repository.add(set1);

        Exception exception = assertThrows(RepositoryException.class, () -> {
            repository.remove(2);
        });

        assertEquals("Set 2 does not exist.", exception.getMessage());

        assertThrows(RepositoryException.class, () -> {
            repository.remove(0);
        });
    }

    @Test
    void testUpdateSetSuccess() {
        Set originalSet = new Set(1, 10, 50.0);
        repository.add(originalSet);

        Set newSetData = new Set(1, 12, 55.0);

        repository.update(1, newSetData);

        Set updatedSet = repository.getAll().get(0);
        assertEquals(12, updatedSet.getReps());
        assertEquals(55.0, updatedSet.getWeight());
    }

    @Test
    void testUpdateSetFailure() {
        repository.add(new Set(1, 10, 50.0));
        Set newSetData = new Set(1, 12, 55.0);

        Exception exception = assertThrows(RepositoryException.class, () -> {
            repository.update(5, newSetData);
        });

        assertEquals("Set 5 does not exist.", exception.getMessage());
    }
}