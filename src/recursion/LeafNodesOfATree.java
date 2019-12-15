package recursion;

class Tree1 {
	Tree1 left;
	Tree1 right;
	int data;

	Tree1(int d) {
		left = null;
		right = null;
		data = d;
	}
}

public class LeafNodesOfATree {
	static Tree1 root;

	public static void main(String[] args) {
		root = new Tree1(1);
		root.left = new Tree1(2);
		root.right = new Tree1(3);
		root.left.left = new Tree1(4);
		root.left.right = new Tree1(5);
		root.right.left = new Tree1(6);
		root.right.left.left = new Tree1(7);
		root.right.right = new Tree1(8);
		root.right.right.left = new Tree1(9);
		root.right.right.left.right = new Tree1(10);

		LeafNodesOfATree obj = new LeafNodesOfATree();
		obj.leafNode();
	}

	public void leafNode() {
		leafNodeHelper(root);
	}

	public void leafNodeHelper(Tree1 node) {
		if (node == null)
			return;
		if (node.left == null && node.right == null)
			System.out.println(node.data);
		else {
			leafNodeHelper(node.left);
			leafNodeHelper(node.right);
		}
	}

}
