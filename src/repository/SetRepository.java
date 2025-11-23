package repository;

import java.util.ArrayList;
import java.util.List;
import model.Set;
import exception.SetException;

public class SetRepository {
    private List<Set> sets = new ArrayList<>();

    public void add(Set set) {
        sets.add(set);
    }

    public void remove(int setNumber) throws SetException {
        if (setNumber < 1 || setNumber > sets.size()) {
            throw new SetException("Set " + setNumber + " does not exist.");
        }

        sets.remove(setNumber - 1);
    }

    public void update(int setNumber, Set newSetData) throws SetException {
        if (setNumber < 1 || setNumber > sets.size()) {
            throw new SetException("Set " + setNumber + " does not exist.");
        }

        Set existingSet = sets.get(setNumber - 1);

        existingSet.setReps(newSetData.getReps());
        existingSet.setWeight(newSetData.getWeight());
    }

    public List<Set> getSets() {
        return sets;
    }
}