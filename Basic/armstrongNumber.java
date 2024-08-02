//Java program to check given number is armstrong or not .
import java.util.Scanner;
public class armstrongNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int backup=num;
        int sum =0;
        while(num>0){
            sum=sum+(num%10)*(num%10)*(num%10);
            num= num/10;
        }

        if(sum==backup){
            System.out.println("armstrong number");
        }
        else
        {
            System.out.println("not armstrong number");
        }


    }
    
}
