package ru.javawebinar.webapp.model;

import javafx.geometry.Pos;

import java.util.List;

/**
 * GKislin
 * 01.04.2016
 */
public class Organization {
    private Link homePage;
    private List<Position> positions;

    public Organization(Link homePage, List<Position> positions) {
        this.homePage = homePage;
        this.positions = positions;
    }
}
