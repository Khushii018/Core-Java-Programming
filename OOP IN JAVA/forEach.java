import java.util.Scanner;

class forEach
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for (int  i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}