import java.util.*;

public class function {

    public static void printMyName(String name) {
        System.out.println("my name is " + name);
        return;
    }

    public static int sumOfTwoNum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int findFacto(int n) {
        int val = 1;
        for (int i = n; i >= 1; i--) {
            val = val * i;
        }
        return val;
    }

    public static int calFibo(int n) {
        int a = 0, b = 1;
        int fibo = 0;

        for (int i = 0; i < n; ++i) {
            fibo = b + a;
            a = b;
            b = fibo;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your name");
        // String name = sc.nextLine();
        // printMyName(name);

        // System.out.println("Enter one number");
        // int num1 = sc.nextInt();
        // System.out.println("Enter another number");
        // int num2 = sc.nextInt();
        // int sum = sumOfTwoNum(num1, num2);
        // System.out.println("Sum of two numbers is " + sum);

        // System.out.println("Enter the number to get factorial");
        // int factorial = sc.nextInt();
        // int fact = findFacto(factorial);
        // System.out.println("Factorial of " + factorial + " is " + fact);

        System.out.println("Enter the number for print the fibo series");
        int num = sc.nextInt();
        int fibo = calFibo(num);
        System.out.println("Fibo series is " + fibo);

    }
}