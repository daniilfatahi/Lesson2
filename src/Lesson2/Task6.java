package Lesson2;
import java.util.Objects;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String userName = inScanner.nextLine();
        String expecteduserName = "Daniil";

        System.out.println("Enter your password: ");
        String password = inScanner.nextLine();
        String expectedpass = "Fatakhi";

        if(!Objects.equals(userName, expecteduserName))
        {
            System.out.println("It's a wrong username");
        } else
        {
            System.out.println("It's a right user");
        }

        if(password.length() == expectedpass.length())
        {
            System.out.println("This pass is correct");
        }
        else
        {
            System.out.println("This pass is wrong ");
        }


    }
}
