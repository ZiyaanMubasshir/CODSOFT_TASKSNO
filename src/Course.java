public class Course {

    String courseName;
    String courseId;
    int availableSeats;

    public Course(String courseName, String courseId, int availableSeats) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.availableSeats = availableSeats;
    }

    public void displayCourse() {
        System.out.println(
                courseId + " - " + courseName +
                        " | Available Seats: " + availableSeats
        );
    }
}