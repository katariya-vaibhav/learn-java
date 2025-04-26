import java.util.Scanner;

public class main {

    // Class to find and print vowels
    public static class FindVowel {
        FindVowel(String str) {
            System.out.println("Original String: " + str);
            printVowels(str);
        }

        void printVowels(String str) {
            System.out.print("Vowels in the string: ");
            for (char ch : str.toLowerCase().toCharArray()) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }

    // Class to reverse the string
    public static class ReverseStr {
        ReverseStr(String str) {
            System.out.println("Original String (before reversing): " + str);
            reverseString(str);
        }

        void reverseString(String str) {
            StringBuffer sb = new StringBuffer(str);
            System.out.println("Reversed String: " + sb.reverse());
            String splitStr[] = str.split(" ");
            StringBuffer s = new StringBuffer();
	    for (String word : splitStr) {
	    	System.out.println(word);
            	if (word.length() > 0) {
                	s.append(Character.toUpperCase(word.charAt(0))) // First letter uppercase
                           .append(word.substring(1).toLowerCase())       // Rest letters lowercase
                           .append(" ");
            	}
             }
		System.out.println(s.toString().trim());

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your String:");
        String userStr = sc.nextLine();

        System.out.println("Length of String: " + userStr.length());
        System.out.println("UpperCase of String: " + userStr.toUpperCase());

        FindVowel fv = new FindVowel(userStr);
        ReverseStr rv = new ReverseStr(userStr);

        sc.close(); // Close the scanner
    }
}
