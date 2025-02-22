import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        String[] arr = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a string: " + i);
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            if (arr[i].toString().startsWith("B") || arr[i].toString().startsWith("b")) {
                System.out.println("String: " + arr[i].toUpperCase());
                sc.close();
            }
        }
    }
}
