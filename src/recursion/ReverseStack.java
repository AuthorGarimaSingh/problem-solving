package recursion;

import java.util.Stack;

public class ReverseStack {

	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) {
		ReverseStack obj = new ReverseStack();
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);

		System.out.println(stack);
		obj.reverseStack();
		System.out.println(stack);
	}

	public void reverseStack() {
		if (!stack.isEmpty()) {
			int value = stack.pop();
			reverseStack();
			insertAtBottom(value);
		}
	}

	public void insertAtBottom(int value) {
		if (stack.isEmpty())
			stack.push(value);
		else {
			int a=stack.pop();
			insertAtBottom(value);
			stack.push(a);
		}
	}

}
