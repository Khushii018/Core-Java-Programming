//method overloading polymorphism.
class Features{
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void add(double a,double b,double c){
        System.out.println(a+b+c);

    }
}


public class polymorphism {
    public static void main(String[] args) {
        Features.add(2,3);
        Features.add(34.43,34.5,8477.389);
        Features.add(34,56,89);
    }
}
