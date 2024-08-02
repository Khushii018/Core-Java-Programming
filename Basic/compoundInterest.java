//Java program to find the compound interest.

import java.util.Scanner;
// import java.io.Math;

public class compoundInterest {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        double principleAmount=sc.nextDouble();
        double rate=sc.nextDouble();
        double time=sc.nextDouble();
        double result = principleAmount*(Math.pow(((1+rate)/100),time));
        System.out.println(result);
    }
    
}
