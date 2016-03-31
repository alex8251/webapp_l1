package ru.javawebinar.webapp.model;

import java.util.List;

public class Section {

    public enum Name{
        ACHIEVEMENT, QUALIFICATIONS, EXPERIENCE, EDUCATION
    }

    private Name sectionName;

    public Section(Name sectionName) {
        this.sectionName = sectionName;
    }
}
