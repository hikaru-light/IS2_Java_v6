class TreeNode {
	String word;
	TreeNode left, right;
	TreeNode(String s) {
		word = s;
		left = null;
		right = null;
	}
}

class TreeNodeOps {
	TreeNode root = new TreeNode("one");

	TreeNodeOps() {
		printNode( root );
		System.out.println("");

		root.left = new TreeNode("two");
		printNode( root );
		System.out.println("");

		root.right = new TreeNode("three");
		printNode( root );
		System.out.println("");

		root.left.left = new TreeNode("four");
		printNode( root );
		System.out.println("");

		root.right.left = new TreeNode("five");
		printNode( root );
		System.out.println("");

		root.right.right = new TreeNode("six");
		printNode( root );
		System.out.println("");

		root.right.left.right = new TreeNode("seven");
		printNode( root );
		System.out.println("");
		System.out.println("");

		System.out.println(depth(root));

		preorder(root);
		System.out.println("");
	}

	void printNode( TreeNode p ) {
		System.out.print(p.word+" ");

		if(p.left != null){
			System.out.print("(");
			printNode(p.left);
		} else {
			System.out.print("(-- ");
		}

		if(p.right != null){
			printNode(p.right);
			System.out.print(")");
		} else {
			System.out.print(" --)");
		}
	}
	
	int depth(TreeNode root) {
		return depth(root, 0);
	}

	int depth(TreeNode root, int count) {
		if(root==null) {
			return count;
		} else {
			count++;
		}

		if(root.left==null && root.right==null) {
			return count;
		} else {
			return Math.max(depth(root.left, count), depth(root.right, count));
		}
	}

	void preorder(TreeNode root) {
		if(root==null) {
			return;
		} else {
			System.out.print(root.word+" ");
		}

		if(root.left==null && root.right==null) {
			return;
		} else {
			preorder(root.left);
			preorder(root.right);
		}
	}

	public static void main(String args[]) {
		new TreeNodeOps();
	}
}
