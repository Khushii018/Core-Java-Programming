abstract class xyz{
    abstract void learning();
    abstract void teaching();
}
abstract class A extends xyz{
    @Override
    public void learning(){
        System.out.println("learning");
    }
}
class B extends A {
    @Override
    public void teaching(){
        System.out.println("teaching");
    }
}

public class abst2 {
    public static void main(String[] args) {
        B hi=new B();
        hi.learning();
        hi.teaching();
    }
    
}
