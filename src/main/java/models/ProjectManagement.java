package models;

public interface ProjectManagement {
    public void addTask(String task);
    public void assignTask(String task, String assignee);
    public void completeTask(String task);
}