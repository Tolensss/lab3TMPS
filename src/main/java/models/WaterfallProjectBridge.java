package models;

import domain.Project;
import domain.ProjectItem;
import domain.Task;
import models.ProjectBridge;
import models.ProjectManagement;

public class WaterfallProjectBridge implements ProjectBridge {
    private ProjectManagement projectManagement;

    public WaterfallProjectBridge(ProjectManagement projectManagement) {
        this.projectManagement = projectManagement;
    }

    public void addTask(Project project) {
        projectManagement.addTask(project.getName());
        for (ProjectItem item : project.getItems()) {
            if (item instanceof Task) {
                addTask((Task) item);
            }
        }
    }

    private void addTask(Task task) {
        projectManagement.addTask(task.getName());
    }

    public void assignTask(String task, String assignee) {
        projectManagement.assignTask(task, assignee);
    }

    public void completeTask(String task) {
        projectManagement.completeTask(task);
    }
}