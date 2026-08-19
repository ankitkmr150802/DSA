import java.util.*;

public class EmployeeDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String employeeType = sc.next();
        String name = sc.next();
        int id = sc.nextInt();

        Employee emp = null;

        if(employeeType.equalsIgnoreCase("FullTime")){
            double monthlySalary = sc.nextDouble();
            emp = new FullTimeEmployee(name, id, monthlySalary);

        }
        else if(employeeType.equalsIgnoreCase("Contractor" )){
            double hourlyRate = sc.nextDouble();
            int hoursWorked = sc.nextInt();
            emp = new Contractor(name, id, hourlyRate, hoursWorked);
            
        }

        if(emp != null){
            System.out.println(emp.getName()+" ID: "+ emp.getId()+ " Total salary: $"+ emp.calculateSalary());
        }

        sc.close();
    }
}
