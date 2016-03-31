package ru.javawebinar.webapp.model;

public class BulletText {
    private String description;
    private String bulletName;

    public BulletText(String text) {description = text;}

    public String getBulletName() {
        return bulletName;
    }

    public void setBulletName(String bulletName) {
        this.bulletName = bulletName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
