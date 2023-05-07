package data;

import java.util.*;

public class WaterfallProjectManagement {
    private List<String> tasks;
    private Map<String, String> assignees;
    private Set<String> completedTasks;

    public WaterfallProjectManagement() {
        this.tasks = new ArrayList<>();
        this.assignees = new HashMap<>();
        this.completedTasks = new HashSet<>();
    }

    public void createTask(String task) {
        this.tasks.add(task);
    }

    public void assignTask(String task, String assignee) {
        this.assignees.put(task, assignee);
    }

    public void completeTask(String task) {
        this.completedTasks.add(task);
    }

    public List<String> getTasks() {
        return this.tasks;
    }

    public Map<String, String> getAssignees() {
        return this.assignees;
    }

    public Set<String> getCompletedTasks() {
        return this.completedTasks;
    }
}
