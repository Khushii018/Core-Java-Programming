

abstract class abs {
     abstract void learning();
     abstract void teaching();
    
}
 class A extends abs{

    @Override
    void learning() {
        System.out.println("learning");
        
    }

    @Override
    void teaching() {
        System.out.println("teaching");
        
    }
    
 }
public class abst{
    public static void main(String[] args) {
        abs me=new A();
        me.learning();
        me.teaching();
    }
}