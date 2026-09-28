import java.util.ArrayList;

public class Student {

    String studentName;
    String studentId;
    ArrayList<Course> registeredCourses;

    public Student(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.registeredCourses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
        course.availableSeats--;
    }

    public void dropCourse(Course course) {
        registeredCourses.remove(course);
        course.availableSeats++;
    }

    public void displayRegisteredCourses() {
        if (registeredCourses.isEmpty()) {
            System.out.println("No courses registered.");
            return;
        }

        System.out.println("\nRegistered Courses:");

        for (Course course : registeredCourses) {
            course.displayCourse();
        }
    }
}