package repository;

import model.Set;
import exception.RepositoryException;

public class SetRepository extends AbstractRepository<Set> {

    public SetRepository(){
        super("Set");
    }

    @Override
    public void update(int index, Set newSetData) {
        if (index < 1 || index > items.size()) {
            throw new RepositoryException("Set " + index + " does not exist.");
        }

        Set existingSet = items.get(index - 1);

        existingSet.setReps(newSetData.getReps());
        existingSet.setWeight(newSetData.getWeight());
    }
}