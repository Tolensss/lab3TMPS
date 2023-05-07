package models;

import models.ProjectManagementTool;

public class TeamCollaborationDecorator implements ProjectManagementTool {
    private ProjectManagementTool tool;

    public TeamCollaborationDecorator(ProjectManagementTool tool) {
        this.tool = tool;
    }

    public void addTask(String task) {
        this.tool.addTask(task);
    }

    public void assignTask(String task, String assignee) {
        this.tool.assignTask(task, assignee);
    }

    public void completeTask(String task) {
        this.tool.completeTask(task);
    }

    public void startTeamChat() {
        System.out.println("Starting team chat...");
    }

    public void shareFiles() {
        System.out.println("Sharing files...");
    }
}