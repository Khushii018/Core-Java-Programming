interface MyBank {
    void write();
    
}

class SBI implements MyBank{
//method overriding polymorphism.
    @Override
    public void write() {
        
        System.out.println("Abstraction Interface ");
    }
    
}
