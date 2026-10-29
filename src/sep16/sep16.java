import java.util.ArrayList;

abstract class Employee {
    int id;
    String name;
    double basicSalary;

    Employee() {
        id = 0;
        name = "Unknown";
        basicSalary = 0;
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.basicSalary = 0;
    }

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    double calculateSalary() {
        return basicSalary + (basicSalary * 0.20);
    }
}

public class sep16 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee(101, "Rahul", 30000));
        employees.add(new FullTimeEmployee(102, "Aman", 40000));
        employees.add(new FullTimeEmployee(103, "Priya", 35000));

        for (Employee emp : employees) {
            emp.display();
        }
    }
}