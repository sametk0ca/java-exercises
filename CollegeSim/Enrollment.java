import java.util.Random;

public class Enrollment {
    private Student student;
    private int midtermScore;
    private int finalScore;
    
    public Enrollment(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setMidtermScore(){
        this.midtermScore = new Random().nextInt(61) + 30; // Random score between 30-90
    }

    public void setFinalScore(){
        this.finalScore = new Random().nextInt(61) + 30; // Random score between 30-90
    }

    public int getMidtermScore() {
        return midtermScore;
    }

    public int getFinalScore() {
        return finalScore;
    }
}
//Samet Koca 210717021