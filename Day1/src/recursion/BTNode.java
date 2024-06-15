package recursion;

public class BTNode {
	private int data;
	private BTNode left, right;
	
	public BTNode()
	{
		data = 0;
		left = right = null;
	}
	
	public BTNode (int d)
	{
		data = d;
		left = right = null;
	}
	
	public int getData()
	{
		return data;
	}
	
	public BTNode getLeft()
	{
		return left;
	}
	
	public BTNode getRight()
	{
		return right;
	}
	
	public void setData(int d)
	{
		data = d;
	}
	
	public void setLeft(BTNode l)
	{
		left = l;
	}
	
	public void setright(BTNode r)
	{
		right = r;
	}
	
}
