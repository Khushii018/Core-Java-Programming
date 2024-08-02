//Java program to find the perimeter of the rectangle.
import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("To find the Perimeter of the Rectangle");
        System.out.print("Enter the Length:");
        int length=sc.nextInt();
        System.out.print("Enter the Breadth:");
        int breadth =sc.nextInt();
       int perimeter=2*(length+breadth);
       System.out.println("Perimeter of Rectangle is :"+perimeter);
    }
    
}
