package ru.javawebinar.webapp.model;

import java.util.List;

public class Organization extends Section {

    private String organizationName;
    private Link contacts;
    private List<Period> periods;

    public Organization(Name sectionName, String organizationName, List<Contact> contacts, List<Period> periods) {
        super(sectionName);
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Link getContacts() {
        return contacts;
    }

    public void setContacts(Link contacts) {
        this.contacts = contacts;
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }

}
