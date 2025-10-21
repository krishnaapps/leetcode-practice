package com.leetcode.practice1;

// Link list node
class Node {
    int data;
    Node next;

    // Constructor to initialize a new node with data
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}


public class Solution3 {

    public static void main(String[] args){
//        Node head = new Node(1);
//        head.next = new Node(3);
//        head.next.next = new Node(1);
//        head.next.next.next = new Node(2);
//        head.next.next.next.next = new Node(1);
//        System.out.println(Solution3.countNodes(head));

        // Create first linked list: 3 -> 2 -> 1
//        Node head1 = new Node(3);
//        head1.next = new Node(2);
//        head1.next.next = new Node(1);
//
//        // Create second linked list: 3 -> 2 -> 1
//        Node head2 = new Node(3);
//        head2.next = new Node(2);
//        head2.next.next = new Node(1);
//        // Function call
//        if (areIdentical(head1, head2))
//            System.out.println("True");
//        else
//            System.out.println("False");
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        head = pairwiseSwap(head);
        printList(head);
    }

    public static Node pairwiseSwap(Node head) {
        // // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
        //2 -> 1 -> 4 -> 3 -> 6 -> 5 ->NULL
        Node curr = head;

        while(curr!=null && curr.next!=null){
            Node first = curr;
            Node second = curr.next;
            first.next = second.next;
            second.next= first;
            curr = curr.next.next;

        }
        return head;

    }

    public static Node removeDup(Node head){
        //2->2->4->5
        Node curr = head;

        // Traverse the list
        while (curr != null && curr.next != null) {

            // Check if next value is the same as curr
            if (curr.data == curr.next.data) {
                //Node nextNext = curr.next.next;
                //curr.next = nextNext;
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static Node reverseList(Node head){
        //1->2->3->4->5
        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null)
                System.out.print(" -> ");
            node = node.next;
        }
    }

    public static boolean isSorted(Node head) {
        if (head == null || head.next == null) return true;
        if (head.data < head.next.data) return false;
        return isSorted(head.next);
    }

    public static boolean areIdentical(Node head1, Node head2){

        while(head1!=null && head2!=null){
            if(head1.data!=head2.data) return false;
            head1= head1.next;
            head2= head2.next;
        }

        return (head1==null && head2==null);
    }


    public static int countNodes(Node head) {
        if(head==null) return 0;
        else return 1+countNodes(head.next);
    }
}
