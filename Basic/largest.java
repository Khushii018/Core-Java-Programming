//Java program to find largest among 3 numbers.
import java.util.Scanner;
public class largest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER a:");
        int a=sc.nextInt();
        System.out.println("ENTER NUMBER b:");
        int b=sc.nextInt();
        System.out.println("ENTER NUMBER c:");
        int c=sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("a is greater");
        }
        else if(b>a&&b>c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }
    
}
