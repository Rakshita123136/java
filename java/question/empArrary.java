//define a class employee with data member employeeid with data member accept data for 5 obj using array of object and print it
import java.util.*;

class InnerempArrary {
    String name;
    int empid, sal;
    Scanner sc = new Scanner(System.in);

    void getdata() {
        System.out.println("Enter EmployeeId, name, salary:");
        empid = sc.nextInt();
        name = sc.next();
        String salaryStr = sc.next(); // Read salary as a string
        salaryStr = salaryStr.replace(",", ""); // Remove any commas
        sal = Integer.parseInt(salaryStr); // Convert to integer after removing commas
    }

    void display() {
        System.out.println("Employeeid: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + sal);
    }
}

public class empArrary {
    public static void main(String[] args) {
        int i;
        InnerempArrary[] obj = new InnerempArrary[5];

        for (i = 0; i < 5; i++) {
            obj[i] = new InnerempArrary(); // Initialize each object in the array
            obj[i].getdata(); // Get data for each employee
        }

        System.out.println("Employee records:");
        for (i = 0; i < 5; i++) {
            obj[i].display(); // Call display() method for each employee
        }
    }
}
