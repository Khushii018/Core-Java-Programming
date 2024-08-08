
public class employee {
    String  name= "khushi";
     private   int empID=2;
          int basicSal=20000;
        int incentive=200;
       int ph=0;
        employee(){
            empID=56;
            name="hello";
        }
        employee(int empNumber,String Name){
            empID=empNumber;
            name=Name;
        }
         void countSalaries(){
            System.out.println(basicSal+incentive);
        }
    
        int getempID(){

            return empID;
        }
        String getname(){
            return name;
        }
        void setph(int phone){
            ph=phone;
        }
    }
