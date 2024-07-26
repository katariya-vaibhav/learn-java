import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of rows: ");
        // int n = sc.nextInt(); // nextFloat , nextLong , next , nextLine ,nextDouble ,
        // nextBoolean
        // System.err.println(n);

        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        System.out.println("Enter Your Salary");
        int Salary = sc.nextInt();
        System.out.println("Married / Not Married");
        Boolean yes = sc.nextBoolean();

        System.out.println("name" + name);
        System.out.println("age" + age);
        System.out.println("salary" + Salary);
        System.out.println("married or not" + yes);
    }
}
