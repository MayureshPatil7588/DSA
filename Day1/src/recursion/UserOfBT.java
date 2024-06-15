package recursion;

public class UserOfBT {
	public static void main(String[] args) {
		BinaryTree obj = new BinaryTree();
		obj.setRoot(obj.createNode(10));
		obj.getRoot().setLeft(obj.createNode(20));
		obj.getRoot().setright(obj.createNode(30));
		obj.getRoot().getLeft().setLeft(obj.createNode(40));
		obj.preOrder();
	}
}
