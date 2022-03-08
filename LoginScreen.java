import java.util.Scanner;
public class LoginScreen {

    public static void main(String[] args) {
        // the ID is 'admin' and the password is 'password'
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your ID : ");
        String ID = input.nextLine();
        System.out.println("Enter your password : ");
        String password = input.nextLine();
        if (ID.equals("admin") && password.equals("password")){
            System.out.println("You have logged in successfully");

        }
        else {
            System.out.println("ID and/or password is wrong");
        }
    }
}