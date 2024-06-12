package dsa1;

public class intListNode {
		private int data;
		private intListNode next;
		
		public intListNode()
		{
			data=0;
			next=null;
		}
		
		public intListNode(int d)
		{
			data=d;
			next=null;
		}
		
		public void setData(int d) {
			data = d;
		}
		
		public void setNext(intListNode n) {
			next = n;
		}
		
		public int getData() {
			return data;
		}

		public intListNode getNext() {
			return next;
		}

		
		
		
		
		
}
