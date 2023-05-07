package domain;

import domain.ProjectItem;

// Create a leaf component for a milestone
public class Milestone implements ProjectItem {
    private String name;

    public Milestone(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}