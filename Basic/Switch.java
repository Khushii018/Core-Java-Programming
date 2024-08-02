import java.util.*;
public class Switch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a=sc.nextInt();
        System.out.println("Enter the number b:");
        int b=sc.nextInt();
        System.out.println("1)ADDITION 2)SUBTRACTION 3)MULTIPLICATON 4)DIVISION");
        int button= sc.nextInt();
        switch(button)
        {
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:System.out.println(a/b);
            break;
            default:System.out.println("incorrect option");


        }
    }
    
}
