package models;

// Define the component interface for a project management tool
public interface ProjectManagementTool {
    public void addTask(String task);
    public void assignTask(String task, String assignee);
    public void completeTask(String task);
}