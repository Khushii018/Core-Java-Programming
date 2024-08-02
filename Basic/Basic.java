//Java program to take user input from the user.
import java.util.Scanner;
public class Basic{
    public static void main(String args[]){
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter the age:");
        int age=scn.nextInt();
        System.out.println(age);
    }
}