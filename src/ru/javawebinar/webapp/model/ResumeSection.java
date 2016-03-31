package ru.javawebinar.webapp.model;

import java.util.List;

public class ResumeSection {

    public enum Name{
        ACHIEVEMENT, QUALIFICATIONS, EXPERIENCE, EDUCATION
    }

    private Name sectionName;

    public ResumeSection(Name sectionName) {
        this.sectionName = sectionName;
    }
}
