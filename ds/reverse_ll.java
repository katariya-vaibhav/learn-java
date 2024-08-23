public class reverse_ll {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }


    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
    public void printList() {
        Node current = head;
        while (current!= null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse_iterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currentNode = head.next;

        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverse_recursive(Node head) {

        if (head == null || head.next == null){
            return head;  // Base case: when the list has only one node or is empty
        }

        Node newHead = reverse_recursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        reverse_ll list = new reverse_ll();
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.printList();
        //list.reverse_iterate();
        list.head = list.reverse_recursive(list.head);
        list.printList();
    }
}
