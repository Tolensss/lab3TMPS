package models;

import models.ProjectManagementTool;

public class ProjectTemplateDecorator implements ProjectManagementTool {
    private ProjectManagementTool tool;

    public ProjectTemplateDecorator(ProjectManagementTool tool) {
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

    public void createProjectFromTemplate(String template) {
        System.out.println("Creating project from template: " + template);
    }
}