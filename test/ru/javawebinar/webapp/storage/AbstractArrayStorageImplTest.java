package ru.javawebinar.webapp.storage;

import org.junit.*;
import org.junit.rules.ExpectedException;
import ru.javawebinar.webapp.ResumeTestData;
import ru.javawebinar.webapp.model.Resume;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static ru.javawebinar.webapp.ResumeTestData.*;

public class AbstractArrayStorageImplTest {
    protected static Storage storage;

    public AbstractArrayStorageImplTest() {

    }

    @Before
    public void before() {
        ResumeTestData.init();
        storage.clear();
        storage.save(R2);
        storage.save(R1);
        storage.save(R3);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }

    @Test(expected = IllegalArgumentException.class)
    public void save() throws Exception {
        storage.save(R3);
    }

    @Test
    public void update() throws Exception {
        Resume updated = storage.get(UUID1);
        updated.setFullName("name1");
        storage.update(updated);
        Assert.assertEquals("name1",storage.get(UUID1).getFullName());
    }

    @Test
    public void get() throws Exception {
        Assert.assertEquals(R1, storage.get(UUID1));
    }

    @Test
    public void delete() throws Exception {
        storage.delete(UUID1);
        Assert.assertEquals(2, storage.size());
    }

    @Test
    public void getAllSorted() throws Exception {
        List<Resume> sortedList =new ArrayList<>(storage.getAllSorted());
        Assert.assertEquals(R1, sortedList.get(0));
    }

    @Test
    public void size() throws Exception {
        Assert.assertEquals(3, storage.size());
    }

}