//Java program to find whether the given number is prime or not.
import java.util.Scanner;

public class primeNumber {
    public static void main (String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=scn.nextInt();
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0)
            {
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not prime");
        }
    }
    
}
