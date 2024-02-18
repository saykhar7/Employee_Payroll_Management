abstract class Employee {


    private String fName;
   private String lName;

   private int empId;

   Employee(String fName, String lName, int empId)
   {
       this.fName = fName;
       this.lName = lName;
       this.empId = empId;
   }

   public String getfName(){
       return fName;
   }

   public String getlName(){
       return lName;
   }

   public int getEmpId()
   {
       return empId;
   }
   public abstract double calculateSalary();





}
