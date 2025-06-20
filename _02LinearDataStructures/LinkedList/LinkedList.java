package _02LinearDataStructures.LinkedList;

public class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void delete(int data) {
        if(head == null) return;

        if(head.data == data) {
            head = head.next;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null) {
            if(currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    public void display() {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void findMiddle() {
        if(head == null) {
            System.out.println("This list is empty");
            return;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle is:" + slow.data);
    }


    public boolean hasCycle() {
        if(head == null || head.next == null) {
            return false;
        } 

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;

    }

    // public boolean createCycle() {

    // }

    public void reverseLinkedList() {
        Node prev = null;
        Node currentNode = head;

        while(currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
        }

        head = prev;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(8);
        l.add(2);
        l.add(7);
        l.add(8);
        l.add(3);
        l.delete(2);
        l.display();
    }


}
