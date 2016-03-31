package ru.javawebinar.webapp.model;

import java.util.List;

public class BulletSection extends Section {

    private List<BulletText> bullets;

    public BulletSection(Name sectionName) {
        super(sectionName);
    }

    public List<BulletText> getBullets() {
        return bullets;
    }

    public void setBullets(List<BulletText> bullets) {
        this.bullets = bullets;
    }
}
