import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class College {
    private Semester currentSemester;

    public College(String semesterName, String year) {
        // Create a new semester with the given name and year
        this.currentSemester = new Semester(semesterName, year);

        // Create the default courses and students
        Course se1004 = new Course("SE1004", "Introduction to Programming II");
        Course ceng1004 = new Course("CENG1004", "Introduction to Object Oriented Programming");
        Course yz5511 = new Course("YZ5511", "Deep Learning and Applications");

        Student thomas = new Student("Thomas Williams", 100);
        Student jacob = new Student("Jacob Taylor", 101);
        Student harry = new Student("Harry Davies", 102);
        Student jessica = new Student("Jessica Williams", 103);
        Student sophie = new Student("Sophie Smith", 104);
        Student emily = new Student("Emily Davies", 105);

        // Enroll the students in the courses
        se1004.enroll(thomas);
        se1004.enroll(jacob);
        ceng1004.enroll(harry);
        ceng1004.enroll(jacob);
        yz5511.enroll(sophie);
        yz5511.enroll(harry);

        // Add the courses to the current semester
        this.currentSemester.addCourse(se1004);
        this.currentSemester.addCourse(ceng1004);
        this.currentSemester.addCourse(yz5511);
    }

    public void generateExamScores() {
        Random rand = new Random();

        // Assign midterm and final exam scores between 30-90 for each enrollment
        for (Course course : this.currentSemester.getCourses()) {
            for (Enrollment enrollment : course.getEnrollments()) {

                enrollment.setMidtermScore();
                enrollment.setFinalScore();
            }
        }
    }

    public void printExamScores(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            // Iterate over courses and print out the exam scores
            for (Course course : this.currentSemester.getCourses()) {
                writer.write(course.getCode() + ": " + course.getName() + "\n");

                for (Enrollment enrollment : course.getEnrollments()) {
                    Student student = enrollment.getStudent();
                    int midtermScore = enrollment.getMidtermScore();
                    int finalScore = enrollment.getFinalScore();

                    writer.write(student.getName() + " -> Midterm Exam: " + midtermScore
                            + " Final Exam: " + finalScore + "\n");
                }

                writer.write("\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        College college = new College("Spring 2023", "2023");

        college.generateExamScores();
        college.printExamScores("C:\\code\\ex3\\examScores.txt");
    }
}
//Samet Koca 210717021