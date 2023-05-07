package models;

import domain.Project;

public interface ProjectBridge {
    public void addTask(Project project);
    public void assignTask(String task, String assignee);
    public void completeTask(String task);
}