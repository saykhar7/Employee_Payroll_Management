public class FullTimeEmployee extends  Employee {


    private double monthlySalary;

    public FullTimeEmployee(String fName, String lName, int empID, double monthlySalary ){
        super(fName, lName, empID);
        this.monthlySalary = monthlySalary;
    }





    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}
