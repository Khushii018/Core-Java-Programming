//Java program to swap the two values using third variable temp.
import java.util.Scanner;
public class swap {
    public static void main (String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number first:");
        int number1=sc.nextInt();
        System.out.println("Enter number second:");
        int number2=sc.nextInt();
        System.out.println("Before Swapping:");
        System.out.print(number1);
        System.out.print(" "+number2);
        int temp=number1;
        number1=number2;
        number2=temp;
        System.out.println();
        System.out.println("After Swapping:");
        System.out.print(number1);
        System.out.print(" "+number2);


    }
    
}
