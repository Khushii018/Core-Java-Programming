//write a java program to create class called "TrafficLight" with attributes for color and duration , and methods to change the color and check for red or green.
class TrafficLight{
    private String color;
    private int duration;
    public TrafficLight(String color, int duration){
        this.color=color;
        this.duration=duration;
    }
    public String getColor() {
        return color;
    }
    public int getDuration() {
        return duration;
    }
    
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void change(String newColor){
        color=newColor;
    }
    public boolean isRed(){
        return color.equals("red");

    }
    public boolean isGreen(){
        return color.equals("green");
    }

}
public class traffic {
    public static void main(String[] args) {
        TrafficLight light=new TrafficLight("red", 34);
    System.out.println("light is red "+light.isRed());
    light.change("green");
    System.out.println("light is now green "+light.isGreen());
    light.setDuration(89);
    System.out.println("duration of light is "+light.getDuration());
    }
    
}
