interface BBIT{
    void library();
}

interface CSE extends BBIT{
    void strength();
}

class Students implements CSE
{

    @Override
    public void strength() {
        System.out.println("678");
        
    }

    @Override
    public void library() {
    System.out.println("learning");
        
    }
    
}
public class inter2 {
    public static void main(String[] args) {
        Students s=new Students();
        s.library();
        s.strength();
    }
    
}
