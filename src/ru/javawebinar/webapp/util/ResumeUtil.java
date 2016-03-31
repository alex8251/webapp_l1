//package ru.javawebinar.webapp.util;
//
//import ru.javawebinar.webapp.model.*;
//
//import java.util.*;
//
//
// draft, don't review
//

//public class ResumeUtil {
//
//    public static List<Contact> createContacts() {
//        List<Contact> contacts = Arrays.asList(
//        new Contact(Contact.ContactType.EMAIL, "ivanov@gmail.com"),
//        new Contact(Contact.ContactType.PHONE, "+7 777 7777-777"),
//        new Contact(Contact.ContactType.SKYPE, "ivanov"),
//        new Contact(Contact.ContactType.LINK, "www.ivanov.com")
//        );
//        return contacts;
//    }
//
//    public static Section createAchievement() {
//        BulletSection secAch = new BulletSection(Section.Name.ACHIEVEMENT);
//        List<String> achievements = Arrays.asList(
//                "1 ach", "2 ach", "3 ach", "4 ach", "5 ach"
//        );
//        secAch.setBullets(createBullets(achievements));
//        return secAch;
//    }
//
//    public static Section createQualification() {
//        BulletSection section = new BulletSection(Section.Name.QUALIFICATIONS);
//        List<String> achievements = Arrays.asList(
//                "1 ach", "2 ach", "3 ach", "4 ach", "5 ach"
//        );
//        section.setBullets(createBullets(achievements));
//        return section;
//    }
//
//    public static List<BulletText> createBullets(List<String> text) {
//        List<BulletText> bullets = new ArrayList<>();
//        for (String bullet:text) {
//            bullets.add(createBulletText(bullet));
//        }
//        return bullets;
//    }
//
//
//
//    public static BulletText createBulletText(String text) {
//        return new BulletText(text);
//    }
//    public static BulletTextWithName createBulletTextWithName(String bulletName, String text) {
//        return new BulletTextWithName(bulletName, text);
//    }

//    public static BulletSection createBulletSection(Section.Name sectionName, List<BulletText> bullets) {
//        BulletSection bulletsSection = new BulletSection(sectionName);
//        bulletsSection.setBullets(bullets);
//        return bulletsSection;
//    }

//}
