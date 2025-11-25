package repository;

import model.Exercise;
import exception.RepositoryException;

public class ExerciseRepository extends AbstractRepository<Exercise> {

    public ExerciseRepository(){
        super("Exercise");
    }

    @Override
    public void update(int index, Exercise newExerciseData) {
        if (index < 1 || index > items.size()) {
            throw new RepositoryException("Exercise " + index + " does not exist.");
        }

        Exercise existingExercise = items.get(index - 1);

        existingExercise.setName(newExerciseData.getName());
        existingExercise.setTargetedMuscle(newExerciseData.getTargetedMuscle());
    }
}