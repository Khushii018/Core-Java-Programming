//Java program to swap two values without the use of third variable.
import java.util.Scanner;
public class swapWithoutTemp {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int number1=scn.nextInt();
        System.out.print("Enter the second number:");
        int number2=scn.nextInt();
        System.out.println("Before swapping:");
        System.out.println("number1:"+number1);
        System.out.println(" "+"number2:"+number2);
        number1=number1-number2;
        number2=number1+number2;
        number1=number2-number1;
        System.out.println();
        System.out.println("After swapping :");
        System.out.println("number1:"+number1);
        System.out.println(" "+"number2:"+number2);

    }
    
}
