//Java program to check the given number is positive,negative or zero.
import java.util.Scanner;

public class pnzNumber {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=scn.nextInt();
        if(number>0)
        {
            System.out.println("Number is positive");
        }
        else if(number<0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
    
}
