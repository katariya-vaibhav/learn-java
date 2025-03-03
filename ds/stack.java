import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // Creating a stack
        
        stack.push(10); // Push (Insertion)
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack: " + stack);
        
        System.out.println("Top element: " + stack.peek()); // Peek (Top element)
        
        stack.pop(); // Pop (Deletion)
        System.out.println("After Pop: " + stack);
    }
}