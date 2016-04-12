package ru.javawebinar.webapp.storage;

import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class SortedArrayStorageImplTest extends AbstractArrayStorageImplTest {

    public SortedArrayStorageImplTest() {}

    @BeforeClass
    public static void beforeClass() {
        storage = new SortedArrayStorageImpl();
        System.out.println("beforeClass");
    }
}