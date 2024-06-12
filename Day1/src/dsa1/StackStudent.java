package dsa1;

public class StackStudent {

  private int top ;
  private Student[] stu;
  
  public StackStudent () {
	  top= -1;
	  stu =new Student[10];
  }
  
  public StackStudent (int s) {
	  top= -1;
	  stu =new Student[s];
  }

  public boolean isFull() {
	  if (top==stu.length-1)
		  return true ;
	  else
	  
	  return false;
	  
 }
  
  public boolean isEmpty() {
	if (top == -1)
		 return true;
	else
	    return false;
	 }  
  
 
  public void push(Student s) {
	 
	 if (isFull())
	 {
		 System.out.println("\n stack overflow");
	     return ;
	     
	 }
	 top = top +1;
	 stu[top]=s;
	 return ;
 }
 
  public Student pop() {
	  
	  Student d= new Student();
    if (isEmpty())
    {
    	System.out.println("underflow");
    	return d;
    }
    
    else {
    	
    	d= stu[top];
    	top-- ;
    	return d ;
    }
    }
	
	
    public Student peak() 
    {
  	  Student d= new Student();
      if (isEmpty())
      {
      	System.out.println("underflow");
      	return d;
      }
      else {	
      	d= stu[top];
      	return d ;
      }
    }
	  
	  
}
 
 

