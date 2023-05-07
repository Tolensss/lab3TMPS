package models;

import data.WaterfallProjectManagement;
import models.ProjectManagement;

// Create an adapter class for the Waterfall project management methodology
public class WaterfallProjectManagementAdapter implements ProjectManagement {
    private WaterfallProjectManagement waterfall;

    public WaterfallProjectManagementAdapter(WaterfallProjectManagement waterfall) {
        this.waterfall = waterfall;
    }

    public void addTask(String task) {
        waterfall.createTask(task);
    }

    public void assignTask(String task, String assignee) {
        waterfall.assignTask(task, assignee);
    }

    public void completeTask(String task) {
        waterfall.completeTask(task);
    }
}