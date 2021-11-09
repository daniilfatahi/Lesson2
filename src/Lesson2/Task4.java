package Lesson2;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {

Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter string you need");
        String word = inScanner.next();
if(word.length() > 20)
{
 System.out.println("Too long");
}
else
{
    System.out.println("Your word length is:" + word.length());
}






    }
}
