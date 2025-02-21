package Q2_01_Remove_Dups;

import java.util.HashSet;
import CtCILibrary.LinkedListNode;

public class QuestionA {
	public static void deleteDups(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		while (n != null) {
			if (set.contains(n.data)) {
				previous.next = n.next;
			} else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}

	// educative.io solution
	public static void deleteDupsWasif(LinkedListNode n) {


		HashSet<Integer>  unique = new HashSet<Integer>();
		LinkedListNode runner = n;
		unique.add(runner.data);
		while (runner != null && runner.next != null) {
			if (!unique.contains(runner.next.data)) {
				unique.add(runner.next.data);
				runner = runner.next;
			} else {
				runner.next = runner.next.next;
			}
		}



	}
	
	public static void main(String[] args) {	
		LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		deleteDupsWasif(head);
		System.out.println(head.printForward());
	}
}
