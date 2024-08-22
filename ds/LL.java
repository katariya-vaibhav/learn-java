import java.util.*;

public class LL {
    // Node head;
    // private int size;

    // LL(){
    //     this.size = 0;
    // }

    // class Node {
    //     String data;
    //     Node next;

    //     Node(String data) {
    //         this.data = data;
    //         this.next = null;
    //         size++;
    //     }
    // }
    // // add / add first

    // public void addFirst(String data) {
    //     Node newNode = new Node(data);
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }
    //     newNode.next = head;
    //     head = newNode;
    // }

    // public void addLast(String data) {
    //     Node newNode = new Node(data);
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }
    //     Node current = head;
    //     while (current.next != null) {
    //         current = current.next;
    //     }
    //     current.next = newNode;
    // }

    // public void printList() {
    //     Node current = head;
    //     if (head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }
    //     while (current != null) {
    //         System.out.print(current.data + "--");
    //         current = current.next;
    //     }
    //     System.out.println("null");
    // }

    // public void deleteFirst() {
    //     if (head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }
    //     size--;
    //     head = head.next;

    // }

    // public void deleteLast() {
    //     if (head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }
    //     size--;
    //     if (head.next == null) {
    //         head = null;
    //         return;
    //     }
    //     Node secondLast = head;
    //     Node lastNode = head.next;
    //     while (lastNode.next != null) {
    //         secondLast = secondLast.next;
    //         lastNode = lastNode.next;
    //     }
    //     secondLast.next = null;
    // }

    // public int size() {
    //     return size;
    // }

    public static void main(String[] args) {
        // LL list = new LL();
        // list.addFirst("hello");
        // list.addFirst("world");
        // list.printList();

        // list.addLast("java");
        // list.addLast("developer");
        // list.printList();

        // list.deleteFirst();
        // list.printList();

        // list.deleteLast();
        // list.printList();

        // list.size();
        // System.out.println("Size: " + list.size());


        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("hello");
        list.addFirst("world");
        System.out.println(list);
        list.addLast("java");
        list.addLast("developer");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ "--");
        }

    }
}