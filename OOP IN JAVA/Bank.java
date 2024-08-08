public  abstract class Bank {
    int name;
    abstract void func();

    
    
}

class admin extends Bank{
    void func(){
        System.out.println("Abstraction abstract");
    }
}

class marketing extends Bank{
    void func(){
        System.out.println("Abstraction abstract2");
        
    }
}
