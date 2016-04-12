package ru.javawebinar.webapp.storage;

import ru.javawebinar.webapp.model.Resume;

import java.util.Arrays;
import java.util.Collection;

import static java.util.Objects.requireNonNull;

/**
 * GKislin
 * 05.04.2016
 */
public class ArrayStorageImpl extends AbstractArrayStorageImpl {

    @Override
    public void save(Resume r) {
        searchPlaceForSave(r);
        array[size++] = r;
    }

   @Override
    public void delete(String uuid) {
        requireNonNull(uuid);
        array[getExistedIndex(uuid)] = array[--size];
        array[size] = null; // clear to let GC do its work
    }

    @Override
    public Collection<Resume> getAllSorted() {
        Resume[] copy = Arrays.copyOf(array, size);
        Arrays.sort(copy);
        return Arrays.asList(copy);
    }

    @Override
    protected int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (array[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }
}
