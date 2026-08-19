public class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int Id){
        this.name = name;
        this.id = Id;
    }

    public double calculateSalary(){
        return 0.0;
    }
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}


class FullTimeEmployee extends Employee{

    private double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

}

class Contractor extends Employee{
    private double hourlyRate;
    private double hoursWorked;

    Contractor(String name, int id, double hourlyRate,double hoursWorked ){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }

}
