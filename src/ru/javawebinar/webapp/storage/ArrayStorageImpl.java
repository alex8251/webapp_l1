package ru.javawebinar.webapp.storage;

import ru.javawebinar.webapp.model.Resume;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * GKislin
 * 05.04.2016
 */

public class ArrayStorageImpl implements Storage {
    private static final int ARRAY_LIMIT = 1000;

    private Resume[] array = new Resume[ARRAY_LIMIT];

    /**
     * return index of the first empty cell in array
     * return -1 if array is full
    */
    private int findFirstEmptyCell() {
        for (int index = 0; index < array.length; index++)  {
            if (array[index] == null) {
                return index;
            }
        }
        return -1;
    }

    /**
     * @return index of array's cell
     */
    private int findByUuid(String uuid) {
        for (int index = 0; index < findFirstEmptyCell(); index++)  {
            if (array[index].getUuid().equals(uuid)) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        array = new Resume[array.length];
    }

    @Override
    public void save(Resume r) {
        int index = findFirstEmptyCell();
        if(index >= 0) {
            array[index] = r;
        } else {
            throw new ArrayIndexOutOfBoundsException("Storage is full");
        }
    }

    @Override
    public void update(Resume r) {
        int index = findByUuid(r.getUuid());
        if(index >= 0) {
            array[index] = r;
        } else {
            throw new RuntimeException("Resume " + r + " not found");
        }
    }

    @Override
    public Resume get(String uuid) {
        int index = findByUuid(uuid);
        if(index >= 0) {
            return array[index];
        } else {
            return null;
        }
    }

    @Override
    public void delete(String uuid) {
        int index = findByUuid(uuid);
        int last = findFirstEmptyCell() - 1;
        if(index >= 0) {
            array[index] = array[last];
            array[last] = null;
        } else {
            throw new RuntimeException("Resume with uuid = " + uuid + " not found");
        }

    }

    @Override
    public Collection<Resume> getAllSorted() {
        int index = findFirstEmptyCell();
        Resume[] sortedArray;
        sortedArray = Arrays.copyOfRange(array,0,index);
        Arrays.sort(sortedArray);
        return Arrays.asList(sortedArray);
    }

    /*
    * return number of resume in storage
    */
    @Override
    public int size() {
        int index = findFirstEmptyCell();
        if (index >= 0) {
            return index;
        } else {
            return array.length;
        }
    }
}
