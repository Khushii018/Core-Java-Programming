class Rectangle{
    double width=67.78;
    double height=89.36;

}

public class calculate {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println("rectangle has "+rectangle.width+" and "+rectangle.height);
        double area=rectangle.width*rectangle.height;
        double perimeter=2*(rectangle.width+rectangle.height);
        System.out.println(area);
        System.out.println(perimeter);
    }
    
}
