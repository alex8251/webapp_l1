package ru.javawebinar.webapp.model;

import java.util.List;

public class Position {
    private List<String> positions;

    public Position(List<String> positions) {
        this.positions = positions;
    }

    public List<String> getPositions() {
        return positions;
    }

    public void setPositions(List<String> positions) {
        this.positions = positions;
    }
}
