class Dog{
    private String Name;
    private String Breed;

    public Dog(String name,String breed)
    {
        this.Name=name;
        this.Breed=breed;

    }

    String getName(){
        return Name;
    }
    String getBreed(){
        return Breed;
    }
    void setName(String name) {
        this.Name=name;


    }
    void setBreed(String Breed){
        this.Breed=Breed;
    }
}

public class setter {
    public static void main(String[] args) {
        Dog dog1=new Dog("cuttu","pug");
        Dog dog2=new Dog("sheru", "German Shephard");
        System.out.println("My dog "+dog1.getName()+" is a breed of "+dog1.getBreed());
        System.out.println("My dog "+dog2.getName()+" is a breed of "+dog2.getBreed());
        dog1.setName("lovely");
        dog2.setBreed("bulldog");
        System.out.println("My dog "+dog1.getName()+" is a breed of "+dog1.getBreed());
        System.out.println("My dog "+dog2.getName()+" is a breed of "+dog2.getBreed());
        
    
    }
    
}
