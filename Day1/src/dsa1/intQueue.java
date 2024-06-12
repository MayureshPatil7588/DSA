package dsa1;

public class intQueue {
	int front,rear;
	int arr[];
	
	public intQueue() 
	{
		front = rear=-1 ;
		arr = new int[10];
	}
	
	public intQueue(int s) 
	{
		front = rear=-1;
		arr = new int[s];
	}
	
	public boolean isFull()
	{
		if(rear == arr.length - 1)
			return true;
		else 
			return false;
	}
	
	public boolean isEmpty()
	{
		if((front == -1) || (front == rear + 1))
			return true;
		else
			return false;
	}
	
	public void insert(int d) 
	{
		if(isFull())
		{
			System.out.println(" Queue is full ");
		}
		if (front == -1)
			front =0;
		
		rear = rear +1;
		arr[rear]  = d;
		return;
	}
	
	public int remove()
	{
		int d = -999;
		if(isEmpty())
		{
			System.out.println("\n Empty...");
			return d;
		}
		
		d = arr[front];
		front = front + 1;
		return d;
	}
	
	public int peak()
	{
		int d = -999;
		if(isEmpty())
		{
			System.out.println("\n Empty...");
			return d;
		}
		
		d = arr[front];
		
		return d;
	}
}
