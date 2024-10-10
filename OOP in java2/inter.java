interface BBIT{
    void library();
}
interface CSE{
    void strength();
}

class A implements BBIT,CSE{

    @Override
    public void library() {
        System.out.println("learning");
        
    }

    @Override
    public void strength() {
        System.out.println("890");
        
    }
    
 }

public class inter {
    public static void main(String[] args) {
        A hi=new A();
        hi.library();
        hi.strength();
    }
    
}
