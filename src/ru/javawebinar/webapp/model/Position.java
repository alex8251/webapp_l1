package ru.javawebinar.webapp.model;

import java.util.List;

public class Position extends Section{
    private List<String> positions;

    public Position(Type type, List<String> positions) {
        super(type);
        this.positions = positions;
    }

    public List<String> getPositions() {
        return positions;
    }

    public void setPositions(List<String> positions) {
        this.positions = positions;
    }
}
