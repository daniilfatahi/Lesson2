package Lesson2;
import java.util.Scanner;

public class TasksTwo {
    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);
System.out.println("What time is it now?");
        int time = inScanner.nextInt();


        if (time > 18)
        {
            System.out.println("It's evening");
        }
        else
        {
            System.out.println("It's day");
        }



    }
}
