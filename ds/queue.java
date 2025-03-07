import java.util.*;

public class queue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // Creating a queue

        queue.add(10); // Enqueue (Insertion)
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        System.out.println("Front element: " + queue.peek()); // Peek (Front element)

        queue.remove(); // Dequeue (Deletion)
        System.out.println("After Dequeue: " + queue);
    }

}
