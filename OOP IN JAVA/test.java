import MyPackage1.myClass;
 class test {
    public static void main(String args[]){
            employee engineer=new employee();
            
            System.out.println(engineer.basicSal);
            System.out.println(engineer.incentive);
            myClass myclass=new myClass();
            myclass.print();
            System.out.println(engineer.getempID());
            engineer.setph(857892);
            
            engineer.countSalaries();
            employee student=new employee(3,"kiran");
            System.out.println(student.name);

            inheritance2 inherit=new inheritance2();
            System.out.print(inherit.name);
            System.out.println(" "+inherit.surName);
            admin bank=new admin();
            System.out.println(bank.name);
            bank.func();
            SBI mybank =new SBI();
            mybank.write();
    }
}

