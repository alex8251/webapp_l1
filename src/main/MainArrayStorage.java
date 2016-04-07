package main;

import ru.javawebinar.webapp.model.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * GKislin
 * 05.04.2016
 */
public class MainArrayStorage {
    // TODO add OrganizationSection
    public static void main(String[] args) {
        Resume r1 = new Resume("Полное Имя1", "About1");
        r1.addContact(ContactType.MAIL, "mail1@ya.ru");
        r1.addContact(ContactType.PHONE, "11111");
        r1.addSection(new TextSection(SectionType.OBJECTIVE, "Objective1"));
        r1.addSection(new ListSection(SectionType.ACHIEVEMENT, "Achivment11", "Achivment12", "Achivment12"));
        r1.addSection(new ListSection(SectionType.QUALIFICATIONS, "Java", "SQL"));
        r1.addSection(new OrganizationSection(SectionType.EXPERIENCE, createExpirience()));
        r1.addSection(new OrganizationSection(SectionType.EDUCATION, createEducation()));
        System.out.println();
        System.out.println(printResume(r1));
        //System.out.println("\n" + r1);

        // TODO test ArrayStorageImpl
    }

    public static List<Organization> createExpirience() {
        Link l1 = new Link("Company1", "www.company1.ru");
        Link l2 = new Link("Company2", "www.2.ru");

        Position p1 = new Position(new Date(2010,1,1), new Date(2011,2,2), "Java Developer", "Description");
        Position p2 = new Position(new Date(2011,2,2), new Date(2013,2,2), "Java Developer", "Description");
        Position p3 = new Position(new Date(2013,2,2), new Date(), "Senior Java Developer", "Description");

        Organization o1 = new Organization(l1, Arrays.asList(p1));
        Organization o2 = new Organization(l2, Arrays.asList(p2,p3));

        return Arrays.asList(o1,o2);
    }

    public static List<Organization> createEducation() {
        Link l1 = new Link("University", "www.uni1.ru");
        Position p1 = new Position(new Date(2006,1,1), new Date(2011,1,1), "Инженер-программист", "Description");
        Organization o1 = new Organization(l1, Arrays.asList(p1));
        return Arrays.asList(o1);
    }

    public static String printResume(Resume resume) {
        StringBuilder sb = new StringBuilder();
        sb.append(resume.getFullName() + "\n");
        sb.append(resume.getAbout()+ "\n");
        sb.append(resume.getContacts()+ "\n");
        sb.append(resume.getSections()+ "\n" + "-----");
        return sb.toString();
    }



}
