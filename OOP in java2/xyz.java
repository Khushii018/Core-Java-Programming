interface BBIT{
    int ID=10;
    void roomNo();
    void toatlSeats();


}
class Students implements BBIT{

    @Override
    public void roomNo() {
        System.out.println("456");
        
    }

    @Override
    public void toatlSeats() {
    System.out.println("180");
        
    }

    
    
}

public class xyz{
    public static void main(String[] args) {
        Students s=new Students();
        s.roomNo();
        s.toatlSeats();
        System.out.println(BBIT.ID);
        System.out.println(s.ID);
    }
}