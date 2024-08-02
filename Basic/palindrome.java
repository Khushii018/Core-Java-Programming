//Java program to check the given number is  palindrome or not.
import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=scn.nextInt();
        int backup=num;
        int rev=0;
        while(num>0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
    
        if(backup==rev){
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

    }
    
}
