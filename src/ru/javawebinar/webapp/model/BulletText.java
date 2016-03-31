package ru.javawebinar.webapp.model;

public class BulletText {
    private String description;

    public BulletText(String text) {description = text;}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
