import java.util.ArrayList;
import java.util.Scanner;

public class CourseRegistrationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student("Ziyaan", "ST101");

        ArrayList<Course> courses = new ArrayList<>();

        courses.add(new Course("Java", "CS101", 30));
        courses.add(new Course("Database Management", "CS102", 25));
        courses.add(new Course("Operating Systems", "CS103", 20));
        courses.add(new Course("Data Structures", "CS104", 35));

        while (true) {

            System.out.println("\n===== COURSE REGISTRATION SYSTEM =====");
            System.out.println("1. View Available Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Drop a Course");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Courses:");

                    for (Course course : courses) {
                        course.displayCourse();
                    }
                    break;

                case 2:
                    System.out.print("Enter Course ID to register: ");
                    String registerId = sc.next();

                    for (Course course : courses) {

                        if (course.courseId.equals(registerId)) {

                            if (course.availableSeats > 0) {
                                student.registerCourse(course);
                                System.out.println("Course registered successfully.");
                            } else {
                                System.out.println("No seats available.");
                            }

                            break;
                        }
                    }
                    break;

                case 3:
                    student.displayRegisteredCourses();
                    break;

                case 4:
                    System.out.print("Enter Course ID to drop: ");
                    String dropId = sc.next();

                    for (Course course : courses) {

                        if (course.courseId.equals(dropId)) {
                            student.dropCourse(course);
                            System.out.println("Course dropped successfully.");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}