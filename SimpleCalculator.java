import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("1-Addition \n2-Substraction \n3-Multiplication \n4-Divide \n5-Square");
        System.out.println("Please choose the process you want to do : ");
        int choose = input.nextInt();
        if (choose == 1) {
            System.out.println("Enter number 1 : ");  
            float  number1 = input.nextFloat();
            System.out.println("Enter number 2 : ");
            float   number2 = input.nextFloat();
            System.out.println("Result : " +(number1+number2));
        }        
        else if (choose == 2) {
            System.out.println("Enter number 1 : ");  
            float   number1 = input.nextFloat();
            System.out.println("Enter number 2 : ");
            float   number2 = input.nextFloat();
            System.out.println("Result : " +(number1-number2));
        }
        else if (choose == 3) {
            System.out.println("Enter number 1 : ");  
            Float   number1 = input.nextFloat();
            System.out.println("Enter number 2 : ");
            Float   number2 = input.nextFloat();
            System.out.println("Result : " +(number1*number2));
        }
        else if (choose == 4) {

            System.out.println("Enter number 1 : ");  
            float   number1 = input.nextFloat();
            System.out.println("Enter number 2 : ");
            float   number2 = input.nextFloat();
         
            if (number2 == 0) {
                System.out.println("ERROR : Divided by zero!  ");
            } 
            else {    
                
           
            System.out.println("Result : " + (number1/number2));
            }

        }
        else if (choose == 5) {
            System.out.println("Enter number  : ");  
            float   number1 = input.nextFloat();
            System.out.println("Result : " +(number1*number1));
        }
            
        else {
            System.out.println("Invalid Choose");
        }
    }
}
