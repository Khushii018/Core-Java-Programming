class Person{
    private String name;
    private int age;
    Person(String name, int age)
    {
        this.name=name;
        this.age=age;

    }
    String getname()
    {
        return name;
    }
    int getage()
    {
        return age;
    }
}
public class java {
    public static void main(String args[]){
        Person person1=new Person("Khushi",21);
        Person person2=new Person("Priyanka", 28);

        System.out.println(person1.getname()+" is "+person1.getage()+" years old");
        
        System.out.println(person2.getname()+" is "+person2.getage()+" years old");
    }
}
