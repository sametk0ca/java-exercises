import java.util.ArrayList;
import java.util.List;

public class Semester {
    private String semesterName;
    private String year;
    private List<Course> courses;
    private List<Student> students;

    public Semester(String semesterName, String year) {
        this.semesterName = semesterName;
        this.year = year;
        this.courses = new ArrayList<Course>();
        this.students = new ArrayList<Student>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getYear() {
        return year;
    }
}
//Samet Koca 210717021