import java.util.Scanner;

public class pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        try {
            System.out.println("Enter the number");

            if (sc.hasNextFloat() && !sc.hasNextInt()) {
                throw new Exception("Input is a float, not an integer.");
            }
            a = sc.nextInt();
            System.out.println("You entered: " + a);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
