package recursion;

public class BinaryTree {
	private BTNode root;
	
	public BinaryTree()
	{
		root = null;
	}
	
	public void setRoot(BTNode r)
	{
		root = r;
	}
	
	public BTNode getRoot()
	{
		return root;
	}
	
	public BTNode createNode(int d)
	{
		return new BTNode(d);
	}
	
	public void preOrder()
	{
		preOrderTransversal(root);
	}
	
	private void preOrderTransversal(BTNode r)
	{
		if(r==null)
			return;
		System.out.println(r.getData());
		preOrderTransversal(r.getLeft());
		preOrderTransversal(r.getRight());
	}
}
