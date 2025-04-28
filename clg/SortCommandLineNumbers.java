import java.util.Arrays;

public class SortCommandLineNumbers {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide numbers as command-line arguments.");
            return;
        }

        int[] numbers = new int[args.length];

        // Convert command-line arguments to integers
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + args[i] + " is not a number.");
                return;
            }
        }

        // Sort the array
        Arrays.sort(numbers);

        // Print the sorted numbers
        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
