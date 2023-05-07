package client;

import data.WaterfallProjectManagement;
import domain.Milestone;
import domain.Project;
import domain.Task;
import models.*;

public class Main {
    public static void main(String[] args) {
        // Create a Waterfall project management adapter
        WaterfallProjectManagement waterfall = new WaterfallProjectManagement();
        ProjectManagement waterfallAdapter = new WaterfallProjectManagementAdapter(waterfall);

        // Create a Bridge implementation that uses the Waterfall adapter
        ProjectBridge bridge = new WaterfallProjectBridge(waterfallAdapter);

        // Create a composite project that contains tasks and milestones
        Project project = new Project("My domain.Project");
        Task task1 = new Task("domain.Task 1");
        Task task2 = new Task("domain.Task 2");
        Milestone milestone1 = new Milestone("domain.Milestone 1");
        project.add(task1);
        project.add(task2);
        project.add(milestone1);

        // Add the project to the bridge implementation
        bridge.addTask(project);

        // Create a Decorator that adds project templates to the project management tool
        ProjectManagementTool tool = new BasicProjectManagementTool();
        tool = new ProjectTemplateDecorator(tool);

        // Create another Decorator that adds team collaboration tools to the project management tool
        tool = new TeamCollaborationDecorator(tool);

        // Use the Decorator to add tasks and assignees to the project management tool
        tool.addTask("domain.Task 3");
        tool.assignTask("domain.Task 3", "John");

        // Add more tasks and assignees to the project management tool
        tool.addTask("domain.Task 4");
        tool.addTask("domain.Task 5");
        tool.assignTask("domain.Task 4", "Alice");
        tool.assignTask("domain.Task 5", "Bob");

        // Use the Decorator to create a project from a template and start a team chat
        if (tool instanceof ProjectTemplateDecorator) {
            ((ProjectTemplateDecorator) tool).createProjectFromTemplate("Scrum");
        }
        if (tool instanceof TeamCollaborationDecorator) {
            ((TeamCollaborationDecorator) tool).startTeamChat();
        }
    }
}
