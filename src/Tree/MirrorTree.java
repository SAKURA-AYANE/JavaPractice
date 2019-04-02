package Tree;

public class MirrorTree {

	public static void main(String[] args) {

	}
	
	public static void mirror(BalancedNodeTree root) {
		if (root!=null) {
			BalancedNodeTree temp = root.left;
			root.left = root.right;
			root.right = temp;
			mirror(root.left);
			mirror(root.right);
		}
	}
}
