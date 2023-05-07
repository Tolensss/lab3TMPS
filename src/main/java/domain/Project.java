package domain;

import java.util.ArrayList;
import java.util.List;

// Create a composite component for a project that contains tasks and milestones
public class Project implements ProjectItem {
    private String name;
    private List<ProjectItem> items;

    public Project(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void add(ProjectItem item) {
        this.items.add(item);
    }

    public void remove(ProjectItem item) {
        this.items.remove(item);
    }

    public List<ProjectItem> getItems() {
        return this.items;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
