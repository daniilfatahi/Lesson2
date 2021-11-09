package Lesson2;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
Scanner inScanner = new Scanner(System.in);

System.out.println("Enter the number of the day");
int day = inScanner.nextInt();
switch(day)
{
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Default in t is 1");

}



    }
}
