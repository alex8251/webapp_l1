package ru.javawebinar.webapp.model;

import java.util.List;

public class BulletSection extends Section {

    private List<String> bullets;

    public BulletSection(Type type) {
        super(type);
    }

    public List<String> getBullets() {
        return bullets;
    }

    public void setBullets(List<String> bullets) {
        this.bullets = bullets;
    }
}
