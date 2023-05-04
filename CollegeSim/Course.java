import java.util.ArrayList;
import java.util.List;

public class Course {
    private String code;
    private String name;
    private List<Enrollment> enrollments;

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
        this.enrollments = new ArrayList<Enrollment>();
    }

    public void enroll(Student student) {
        if (enrollments.size() < 2) {
            enrollments.add(new Enrollment(student));
        }
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }
}
//Samet Koca 210717021