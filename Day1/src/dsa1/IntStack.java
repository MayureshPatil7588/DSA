package dsa1;


public class IntStack {

	private int top ;
	private int arr[];
	
	public IntStack() {
		top=-1;
		arr=new int [10];
	}
	
	public IntStack(int s)
	{
		top = -1;
		arr= new int [s];
	}
	
	public Boolean isFull()
	{
		if(top == arr.length - 1)
			return true;
		else
			return false;
	}
	
	public Boolean isEmpty()
	{
		if(top == - 1)
			return true;
		else
			return false;
	} 
	
	public void push(int d)
	{
		if(isFull())
		{
			System.out.println("\n Stack Over Flow......");
			return;
		}
		top = top + 1;
		arr[top] = d;
		return;
	}
	
	public int pop()
	{
		int d = -999;
		if(isEmpty())
		{
			System.out.println("\n UnderFlow .....");
			return d;
		}
		d = arr[top];
		top = top - 1;
		return d;
	}
	
	public int Peak()
	{
		int d = -999;
		if(isEmpty())
		{
			System.out.println("\n UnderFlow .....");
			return d;
		}
		d = arr[top];
		return d;
	}
	
	
	
}
