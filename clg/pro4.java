import java.util.Scanner;

class Employee {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            int salary = sc.nextInt();
            employees[i] = new Employee(id, name, salary);
        }

        Employee maxSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].salary > maxSalaryEmployee.salary) {
                maxSalaryEmployee = employees[i];
            }
        }
        
        System.out.println("Employee with maximum salary:");
        maxSalaryEmployee.display();
        sc.close();
    }
}