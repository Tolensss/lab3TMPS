package models;

public class BasicProjectManagementTool implements ProjectManagementTool {
    public void addTask(String task) {
        System.out.println("Adding task: " + task);
    }

    public void assignTask(String task, String assignee) {
        System.out.println("Assigning task " + task + " to " + assignee);
    }

    public void completeTask(String task) {
        System.out.println("Completing task: " + task);
    }

}