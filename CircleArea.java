import java.util.Scanner ;
public class CircleArea {
    public static void main(String[] args) {
        Scanner typing = new Scanner(System.in) ;
        double pi = 3.14 ;
        System.out.println("Enter the radius value : ") ;
        double radius = typing.nextDouble() ; 
        double area = (radius*radius)*pi ;
        System.out.println("The area of that circle is : " + area) ;
        typing.close() ;
    }
}
    