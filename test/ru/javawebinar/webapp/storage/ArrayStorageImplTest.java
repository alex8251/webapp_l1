package ru.javawebinar.webapp.storage;

import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class ArrayStorageImplTest extends ru.javawebinar.webapp.storage.AbstractArrayStorageImplTest {

    public ArrayStorageImplTest() {}

    @BeforeClass
    public static void beforeClass() {
        storage = new ArrayStorageImpl();
        System.out.println("beforeClass");
    }
}