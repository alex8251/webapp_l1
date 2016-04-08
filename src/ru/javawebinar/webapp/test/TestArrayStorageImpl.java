package ru.javawebinar.webapp.test;

import main.Util;
import ru.javawebinar.webapp.model.Resume;
import ru.javawebinar.webapp.storage.ArrayStorageImpl;


public class TestArrayStorageImpl {

    public static void main(String[] args) {
        ArrayStorageImpl resumeArray = new ArrayStorageImpl();
        fillResumeArray(resumeArray);
        testClear(resumeArray);

        testUpdate(resumeArray);
        testDelete(resumeArray);
        for (Resume resume : resumeArray.getAllSorted()) {
            System.out.println(resume.getFullName() + " , uuid: " + resume.getUuid());
        }


    }

    public static void fillResumeArray(ArrayStorageImpl resumeArray) {
        resumeArray.save(Util.createResume("First Resume"));
        resumeArray.save(Util.createResume("Aaaa Resume"));
        resumeArray.save(Util.createResume("Zzzz Resume"));
        resumeArray.save(Util.createResume("kkkkk Resume"));
        resumeArray.save(Util.createResume("Aaaa Resume"));
        System.out.println("fill ResumeArray with 5 resume, size = " + resumeArray.size());
    }

    public static void testUpdate(ArrayStorageImpl resumeArray) {
        System.out.println("\nTest update()");
        String beforeUpdate = "beforeUpdate";
        Resume resume = Util.createResume(beforeUpdate);
        String uuid = resume.getUuid();
        resumeArray.clear();
        resumeArray.save(resume);
        resume = null;
        resume = resumeArray.get(uuid);
        System.out.println("fullName before update = " + resume.getFullName());
        resume.setFullName("afterUpdate");
        resumeArray.update(resume);
        resume = null;
        resume = resumeArray.get(uuid);
        System.out.println("fullName after update = " + resume.getFullName());
    }

    public static void testDelete(ArrayStorageImpl resumeArray) {
        System.out.println("\nTest delete()");
        Resume resume = Util.createResume("testDelete");
        String uuid = resume.getUuid();
        resumeArray.clear();
        resumeArray.save(resume);
        resume = null;
        resume = resumeArray.get(uuid);
        System.out.println("resume from storage: " + resume.getFullName());
        resumeArray.delete(uuid);
        resume = resumeArray.get(uuid);
        System.out.println("resume after delete: " + resume);
    }

    public static void testClear(ArrayStorageImpl resumeArray) {
        System.out.println("\nTest clear()");
        System.out.println("storage size before clear = " + resumeArray.size());
        resumeArray.clear();
        System.out.println("storage size after clear = " + resumeArray.size());
    }
}
