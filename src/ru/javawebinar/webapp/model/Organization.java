package ru.javawebinar.webapp.model;

import java.util.List;

public class Organization extends ResumeSection {

    private String organizationName;
    private List<Contact> contacts;
    private List<Period> periods;

    public Organization(Name sectionName, String organizationName, List<Contact> contacts, List<Period> periods) {
        super(sectionName);
    }

}
