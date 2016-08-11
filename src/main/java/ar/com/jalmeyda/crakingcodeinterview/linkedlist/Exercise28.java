package ar.com.jalmeyda.crakingcodeinterview.linkedlist;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.HashSet;
import java.util.Set;

/**
 * Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the
 * beginning of the loop.
 * DEFINITION
 * Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so
 * as to make a loop in the linked list.
 * EXAMPLE
 * Input: A -> B -> C - > D -> E -> C [the same C as earlier]
 * Output: C
 */
public class Exercise28 {

	public static void main(String[] args) {
		LinkedListNode a = new LinkedListNode(1);
		LinkedListNode b = new LinkedListNode(2);
		LinkedListNode c = new LinkedListNode(3);
		LinkedListNode d = new LinkedListNode(4);
		LinkedListNode e = new LinkedListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = c;

		LinkedListNode result = detectLoop(a);
		System.out.println(result.data);
	}

	private static LinkedListNode detectLoop(LinkedListNode a) {
		Set<LinkedListNode> nodes = new HashSet<>();
		while (a != null) {
			if (nodes.contains(a))
				return a;
			nodes.add(a);
			a = a.next;
		}
		return null;
	}

}
