import java.util.Scanner;

public class GradeCalculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Type the passing grade : ") ;
        int PassingGrade = input.nextInt() ;
        System.out.println("Enter quiz note : ") ;
        int quiz = input.nextInt() ;
        System.out.println("Enter midterm note : ") ;
        int midterm = input.nextInt() ;
        System.out.println("Enter final note : ") ;
        int ffinal = input.nextInt() ; 
        double average = (quiz*0.2) + (midterm*0.3) + (ffinal*0.6) ;
        String result = (average < PassingGrade) ? "You failed" : "You passed" ;
        System.out.println("Your average is " + average ) ;
        System.out.println(result) ;
    }
}