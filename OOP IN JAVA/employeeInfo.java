//Java program to create a class called "Employee" with a name, jobTitle ,and salary attributes ,and methods to calculate and update salary.
class Employee{
    private String Name ;
    private String jobTitle;
    private double Salary;
    public Employee(String Name,String jobTitle,double Salary){
        this.jobTitle=jobTitle;
        this.Name=Name;
        this.Salary=Salary;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getjobTitle(){
        return jobTitle;
    }
    public void setjobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }
    public double getSalary(){
        return Salary;
    }
    public void setSalary(double Salary){
        this.Salary=Salary;
    }
    public void raiseSalary(double percentage){
        Salary=Salary+Salary*percentage/100;
    }
    public void printEmployeeDetails()
    {
        System.out.println("Name:"+ Name);
        System.out.println("Job Title :"+ jobTitle);
        System.out.println("Salary:"+Salary);
    }
}
public class employeeInfo {
        public static void main(String args[]){
            Employee employee1=new Employee("Kiran", "HR", 500000);
            Employee employee2=new Employee("Khushi", "Java Developer", 500000);
            System.out.println("\nEmployees Details:\n");
            employee1.printEmployeeDetails();
            employee2.printEmployeeDetails();
            employee1.raiseSalary(8);
            employee2.raiseSalary(9);
            System.out.println("\n After raising salary:");
            System.out.println("\n 8% for kiran :");
            employee1.printEmployeeDetails();
            System.out.println("\n 9% for khushi:");
            employee2.printEmployeeDetails();


        }
}
