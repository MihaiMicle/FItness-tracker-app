package repository;

import java.util.*;
import exception.RepositoryException;
import model.Set;

public abstract class AbstractRepository<T> {
    protected List<T> items;
    String typeName;

    public AbstractRepository(String typeName) {
        this.items = new ArrayList<>();
        this.typeName = typeName;
    }

    public void add(T item) {
        items.add(item);
    }

    public void remove(int index) {
        if (index < 1 || index > items.size()) {
            throw new RepositoryException(typeName + " " + index + " does not exist.");
        }

        items.remove(index - 1);
    }

    public List<T> getAll() {
        return items;
    }

    public int size() {
        return items.size();
    }

    public abstract void update(int index, T newItem);
}