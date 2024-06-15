package dsa1;

public class LinkedList {

	intListNode head;
	
	public LinkedList()
	{
		head = null;
	}
	
	public void insertFirst(int d)
	{
		intListNode new_node = new intListNode(d);
		if(head == null)
		{
			head = new_node;
			return;
		}
		new_node.setNext(head);
		head = new_node;
		return;
	}
	
	public String toString()
	{
		String str = new String(" ");
		if(head == null)
		{
			return "List is empty...";
		}
		
		intListNode iter = head;
		str = "List : ";
		while(iter != null)
		{
			str = str+" -> "+iter.getData();
			iter = iter.getNext();
		}
		return str;
	}
	
	public void insert_last(int d)
	{
		intListNode new_node = new intListNode(d);
		if(head == null)
		{
			head = new_node;
			return;
		}
		intListNode iter = head;
		while(iter.getNext() != null)
			iter = iter.getNext();
		
		iter.setNext(new_node);
		return;
	}
	
	public void insert_by_pos(int data, int pos)
	{
		intListNode new_node = new intListNode(data);
		if(head == null)
		{
			head = new_node;
			return;
		}
		if(pos == 1)
		{
			new_node.setNext(head);
			head = new_node;
			return;
		}
		int i;
		intListNode iter = head;
		for(i=1;i<pos-1 && iter.getNext()!=null;i++)
			iter = iter.getNext();
		
		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}
	
	public int deleteFirst()
	{
		int d = -999;
		intListNode deletable;
		
		if(head == null)
		{
			return d;
		}
		if(head.getNext() == null)
		{
			d = head.getData();
			head = null;
			return d;
		}
		deletable = head;
		d = head.getData();
		head = head.getNext();
		deletable = null;
		return d;
	}
	
	public int deleteLast()
	{
		int d = -999;
		intListNode deletable;
		if(head == null)
		{
			return d;
		}
		if(head.getNext() == null)
		{
			d = head.getData();
			head = null;
			return d;
		}
		intListNode iter = head;
		while(iter.getNext().getNext() != null)
			iter = iter.getNext();
		
		deletable = iter.getNext();
		d = deletable.getData();
		iter.setNext(null);
		deletable = null;
		return d;
	}
	
	public int delete_by_pos(int pos)
	{
		int d = -999;
		intListNode deletable;
		if(head == null)
		{
			return d;
		}
		if(pos == 1)
		{
			d = head.getData();
			deletable = head;
			head = head.getNext();
			deletable = null;
			return d;
		}
		
		int i;
		intListNode iter = head;
		for(i=1; i<pos-1 && iter.getNext() != null; i++)
			iter = iter.getNext();
		
		if(iter.getNext() != null)
		{
			deletable = iter.getNext();
			d = deletable.getData();
			iter.setNext(iter.getNext().getNext());
			deletable = null;
		}
		else
		{
			System.out.println("Invalid position..");
			return d;
		}
		return d;
	}
	
	public void insert_before(int d, int before)
	{
		intListNode new_node = new intListNode(d);
		if(head == null)
		{
			return;
		}
		if(head.getData() == before)
		{
			new_node.setNext(head);
			head = new_node;
			return;
		}
		intListNode iter = head;
		while((iter.getNext() != null) && (iter.getNext().getData() != before))
			iter = iter.getNext();
		if(iter.getNext() != null)
		{
			new_node.setNext(iter.getNext());
			iter.setNext(new_node);
		}
		return;
	}
	
	public void insertAfter(int d, int after)
	{
		intListNode new_node = new intListNode(d);
		intListNode iter = head;
		if(head.getData() == after)
		{
			new_node.setNext(iter.getNext());
			iter.setNext(new_node);
			return;
		}
		while((iter.getNext() != null) && (iter.getNext().getData() != after))
		{
			iter = iter.getNext();
			new_node.setNext(iter.getNext());
			iter.setNext(new_node);
			return;
		}
	}
	
	public void insertSorted(int d)
	{
		intListNode new_node = new intListNode(d);
		if((head == null) || (d<head.getData()))
		{
			new_node.setNext(head);
			head = new_node;
			return;
		}
		intListNode iter = head;
		while((iter.getNext() != null) && (d>iter.getNext().getData()))
			iter = iter.getNext();
		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}
	
	public int count()
	{
		int cnt = 0;
		intListNode iter = head;
		if(head == null)
			return 0;
		
		while(iter != null)
		{
			cnt++;
			iter = iter.getNext();
		}
		return cnt;
	}
	
	public void displayAlternateNode()
	{
		if(head == null)
		{
			System.out.println("List Empty...");
			return;
		}
		intListNode iter = head;
		while(iter != null)
		{
			System.out.println(iter.getData()+" ");
			if(iter.getNext() != null)
				iter = iter.getNext().getNext();
			else
				iter = iter.getNext();
		}
	}
	
	public void reverseLL()
	{
		intListNode prev,next,iter;
		iter = head;
		prev = null;
		while(iter != null)
		{
			next = iter.getNext();
			iter.setNext(prev);
			prev = iter;
			iter = next;
		}
		head = prev;
	}
}
