//Java calculator program using switch case.
import java.util.Scanner;

public class calculator {
    public static void main (String args[]){
        Scanner scn =new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("Enter number first:");
        int a=scn.nextInt();
        System.out.println("Enter number second:");
        int b=scn.nextInt();
        System.out.println("Choose 1. Addition 2.Subtraction 3.Multiplication 4. Division");
        int number=scn.nextInt();

        switch(number)
        {
            case 1:System.out.println("addition :"+(a+b));
            break;
            case 2:System.out.println("Subtraction:"+(a-b));
            break;
            case 3: System.out.println("Multplication:"+(a*b));
            break;
            case 4:System.out.println("Division:"+(a/b));
            break;
            default:System.out.println("Enter between 1 to 4");
        }
    }
    
}
