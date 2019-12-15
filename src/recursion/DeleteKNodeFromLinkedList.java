package recursion;

class Node {
	Node next;
	int data;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class DeleteKNodeFromLinkedList {
	static Node head;

	public static void main(String[] args) {
		head = new Node(2);
		head.next = new Node(3);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);

		DeleteKNodeFromLinkedList obj = new DeleteKNodeFromLinkedList();
		obj.printLinkedList();
		int index = 2;
		head = obj.deleteKNode(head, index);
		obj.printLinkedList();
	}

	public void printLinkedList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public Node deleteKNode(Node curr, int index) {
		if (index < 1)
			return curr;
		
		if (index == 1) {
			Node res = curr.next;
			return res;
		}
		
		curr.next = deleteKNode(curr.next, index - 1);
		return curr;
	}

}
