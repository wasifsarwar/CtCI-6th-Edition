package Q2_02_special_Nth_from_Last;

/*
    Description
    Given a singly linked list, return the nth node from last. Return null if 'n' is out-of-bounds.

    From educative.io :)
    https://www.educative.io/courses/coderust-hacking-the-coding-interview/mryR

 */


import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;
import Q7_07_Chat_Server.System;

public class Question {



    public static LinkedListNode nthFromLast(LinkedListNode head, int n) {

        if (head == null || n < 1) {
            return null;
        }

        LinkedListNode tail = head;

        while (tail.next != null && n > 0) {
            tail = tail.next;
            n--;
        }

        if (n != 0) {
            return null;
        }

        while (tail != null) {
            head = head.next;
            tail = tail.next;
        }

        return head;

    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
//        for (int i = 0; i <= array.length + 1; i++) {
//            LinkedListNode node = nthFromLast(head, i);
//            String nodeValue = node == null ? "null" : "" + node.data;
//            System.out.println(i + ": " + nodeValue);
//        }
        head = nthFromLast(head,7);
        System.out.println(head.printForward());

    }

}
