package ar.com.jalmeyda.crakingcodeinterview.linkedlist;

/**
 * Sum Lists: You have two numbers represented by a linked list, where each node contains a single
 * digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
 * function that adds the two numbers and returns the sum as a linked list.
 * EXAMPLE
 * Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
 * Output: 2 -> 1 -> 9. That is, 912.
 */
public class Exercise25 {

	public static void main(String[] args) {
		LinkedListNode seven = new LinkedListNode(7);
		LinkedListNode one = new LinkedListNode(1);
		LinkedListNode six = new LinkedListNode(6);
		seven.next = one;
		one.next = six;

		LinkedListNode five = new LinkedListNode(5);
		LinkedListNode nine = new LinkedListNode(9);
		LinkedListNode two = new LinkedListNode(2);
		five.next = nine;
		nine.next = two;

		LinkedListNode result = sumLinkedListNodes(seven, five);
		String resultStr = "";
		while(result != null) {
			resultStr += result.data;
			result = result.next;
		}
		System.out.println(resultStr);
	}

	private static LinkedListNode sumLinkedListNodes(LinkedListNode node1, LinkedListNode node2) {
		int rest = 0;
		LinkedListNode result = null;
		while (node1 != null && node2 != null) {
			int sum = 0;
			if (node1 != null) {
				sum += node1.data;
				node1 = node1.next;
			}
			if (node2 != null) {
				sum += node2.data;
				node2 = node2.next;
			}
			sum += rest;
			if (sum >= 10) {
				rest = 1;
				sum -= 10;
			} else {
				rest = 0;
			}
			result = addToResult(result, sum);
		}
		if (rest > 0) {
			LinkedListNode currentResult = new LinkedListNode(rest);
			currentResult.next = result;
			return currentResult;
		}
		return result;
	}

	private static LinkedListNode addToResult(LinkedListNode result, int sum) {
		LinkedListNode currentResult = new LinkedListNode(sum);
		if (result != null) {
			currentResult.next = result;
		}
		return currentResult;
	}
}
