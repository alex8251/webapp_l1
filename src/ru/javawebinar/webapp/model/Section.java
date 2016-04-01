package ru.javawebinar.webapp.model;

import java.util.List;

public class Section {

    public enum Type{
        OBJECTIVE, ACHIEVEMENT, QUALIFICATIONS, EXPERIENCE, EDUCATION
    }

    private Type type;

    public Section(Type type) {
        this.type = type;
    }
}
