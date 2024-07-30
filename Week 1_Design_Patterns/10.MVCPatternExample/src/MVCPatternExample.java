// MVCPatternExample.java
public class MVCPatternExample {
    public static void main(String[] args) {
        // Create a student model
        Student model = new Student("1", "John Doe", "A");

        // Create a student view
        StudentView view = new StudentView();

        // Create a student controller
        StudentController controller = new StudentController(model, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B+");

        // Display updated student details
        controller.updateView();
    }
}
