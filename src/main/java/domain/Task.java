package domain;

import domain.ProjectItem;

// Create a leaf component for a task
public class Task implements ProjectItem {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
