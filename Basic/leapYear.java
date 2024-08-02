//Java program to find the leap year.
import java.util.Scanner;

public class leapYear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER CENTURY YEAR:");
        int year=sc.nextInt();
        if((year%400==0)||((year%4==0)&&(year%100!=0)))
        {
            System.out.println(year+" is Leap Year");
        }
        else{
            System.out.println(year+" is  Non-Leap Year");
        }


    }
    
}
