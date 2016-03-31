package ru.javawebinar.webapp.model;

public class BulletTextWithName extends BulletText {
    private String bulletName;

    public BulletTextWithName(String bulletName, String text) {
        super(text);
        this.bulletName = bulletName;
    }

    public String getBulletName() {
        return bulletName;
    }

    public void setBulletName(String bulletName) {
        this.bulletName = bulletName;
    }
}
