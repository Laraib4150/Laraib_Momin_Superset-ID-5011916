// Main.java
public class Main {
    public static void main(String[] args) {
        TaskManagementSystem system = new TaskManagementSystem();

        // Adding Tasks
        system.addTask(new Task("T001", "Design Database", "Pending"));
        system.addTask(new Task("T002", "Implement Backend", "In Progress"));
        system.addTask(new Task("T003", "Develop Frontend", "Completed"));

        // Searching for a Task
        System.out.println("Search Result: " + system.searchTaskById("T002"));

        // Traversing All Tasks
        System.out.println("All Tasks:");
        system.traverseTasks();

        // Deleting a Task
        system.deleteTaskById("T001");
        System.out.println("Tasks After Deletion:");
        system.traverseTasks();
    }
}
