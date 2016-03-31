package ru.javawebinar.webapp.model;

public class Contact {

    public enum ContactType{
       PHONE, EMAIL, SKYPE, LINK;
    }

    private ContactType type;
    private String value;

    public Contact(ContactType type, String value) {
        this.type = type;
        this.value = value;
    }

}
