package Q2_03_Delete_Middle_Node;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class Question {

	public static boolean deleteNode(LinkedListNode n) {
		if (n == null || n.next == null) {
			return false; // Failure
		} 
		LinkedListNode next = n.next; 
		n.data = next.data; 
		n.next = next.next; 
		return true;
	}

	public static void deleted(LinkedListNode n) {
		if (n != null || n.next != null) {
			LinkedListNode next = n.next;
			n.data = next.data;
			n.next = next.next;
		}

	}
	
	public static void main(String[] args) {
		LinkedListNode head = AssortedMethods.randomLinkedList(20, 0, 10);
		System.out.println(head.printForward());
		deleted(head.next.next.next.next); // delete node 4
		System.out.println(head.printForward());
	}

}
