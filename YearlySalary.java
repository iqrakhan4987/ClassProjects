//Employee.java
//CET 3640 Software for Computer Control Lab 4 
// This program calculates the yearly salary. It also applies a raise to the salary.
package SalaryChange;

public class Employee {
    
    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    //Constructor - has no data type
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    } 
    // Get method for first name
    public String getFirstName() {
        return firstName;
    }
     
    // set method for first name
    public void setFirstName(String first) {
        firstName = first;
    }
    
    //Get method for last name
    public String getLastName() {
        return lastName;
    }
    
    //Set method for last name
    public void setLastName(String last) {
        lastName = last;
    }
    
    //Get method for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
        
    }
    
    //Set method for monthly Salary
    public void setMonthlySalary(double monSalary) {
        if (monthlySalary > 0) {
            monthlySalary = monSalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }
    
    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give a 10% raise
    public void Raise(float percentage ) {
        monthlySalary *= (1+(percentage/100)); // 10% raise
    }
}


//EmployeeTest.java
//This is to test the Employee class
package SalaryChange;
//Test class for Employee

public class EmployeeTest {
 public static void main(String[] args) {
     // Creating four Employee objects with first name, last name and current salary
     Employee employee1 = new Employee("Iqra", "Khan", 5000);
     Employee employee2 = new Employee("Tom", "Holland", 6000);
     Employee employee3 = new Employee("Robert", "Downy", 7000);
     Employee employee4 = new Employee("Chris", "Evans", 8000);

     // Displaying yearly salary for each Employee
     System.out.println("Yearly Salary Before Raise:");
     printYearlySalary(employee1);
     printYearlySalary(employee2);
     printYearlySalary(employee3);
     printYearlySalary(employee4);

     // Giving each Employee a 10% raise
     employee1.Raise(10);
     employee2.Raise(10);
     employee3.Raise(10);
     employee4.Raise(10);

     // Displaying yearly salary after raise
     System.out.println("\nYearly Salary After 10% Raise:");
     printYearlySalary(employee1);
     printYearlySalary(employee2);
     printYearlySalary(employee3);
     printYearlySalary(employee4);
 }
// Helper method to display yearly salary
 public static void printYearlySalary(Employee employee) {
     String message = String.format("%s %s's yearly salary: $%.2f", employee.getFirstName(), employee.getLastName(), employee.getYearlySalary());
     System.out.println(message);
 }


}

