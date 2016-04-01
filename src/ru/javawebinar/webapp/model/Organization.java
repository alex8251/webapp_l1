package ru.javawebinar.webapp.model;

import java.util.List;

public class Organization extends Section {
    private Link contact;
    private List<Period> periods;

    public Organization(Type type, Link contact, List<Period> periods) {
        super(type);
    }

    public String getName() {
        return contact.getName();
    }

    public void setName(String name) {
        contact.setName(name);
    }

    public Link getContact() {
        return contact;
    }

    public void setContact(Link contact) {
        this.contact = contact;
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }

}
