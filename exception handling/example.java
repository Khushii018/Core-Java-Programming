import java.util.Scanner;

public class example{
    public static void main(String[] args) {
        System.out.println("Started....");
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the two numbers :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("We have got two numbers");
        int result=n1/n2;
        System.out.println("Division is : "+result);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }
        finally{
            System.out.println("finally block");
            System.out.println("closing all the resources");
        }
        
        System.out.println("Terminated....");
        sc.close();


    }
}