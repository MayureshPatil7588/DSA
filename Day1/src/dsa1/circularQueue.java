package dsa1;

public class circularQueue {
	int front,rear;
	int []arr;
	
	public circularQueue() 
	{
		front = rear = -1;
		arr = new int [10];
	}
	
	public circularQueue(int s) 
	{
		front = rear = -1;
		arr = new int [s];
	}
	
	public boolean isEmpty()
	{
		if(front == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if (((front == 0) && (rear == arr.length-1)) || (front == rear+1))
			return true;
		else
			return false;
	}
	
	public void insert (int d)
	{
		if(isFull())
		{
			System.out.println("\n full...");
			return;
		}
		if (front == -1)
			front = 0;
		if(rear == arr.length-1)
			rear = 0;
		else
			rear = rear+1;
		
		arr[rear] = d;
		return;
	}
	
	public int remove()
	{
		int d = -999;
		if(isEmpty())
		{
			System.out.println("Empty...");
			return d;
		}
		d = arr[front];
		if(front == rear)
		{
			front = -1;rear=-1;;
		}
		else if (front == arr.length-1) 
			front = 0;
		else
			front = front +1;
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
