//Java program to compute simple interest. 
import java.util.Scanner;

public class simpleInterest {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("To check the simple interest:");
        System.out.print("Enter Amoount:");
        float p=sc.nextFloat();
        System.out.print("Enter Time:");
        float t=sc.nextFloat();
        System.out.print("Enter Rate:");
        float r=sc.nextFloat();
        float SI= (p*t*r)/100;
        System.out.println("Simple Interest:"+SI);
    }
    
}
