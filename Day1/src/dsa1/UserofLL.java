package dsa1;

import java.util.Scanner;

public class UserofLL {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		/*
		 * obj.insertFirst(10); obj.insertFirst(70); obj.insertFirst(50);
		 * System.out.println(obj);
		 */
		Scanner sc = new Scanner(System.in);
		
		int choice,data,pos;
		do {
			System.out.println("1. Insert First ");
			System.out.println("2. Insert Last ");
			System.out.println("3. Insert By Position ");
			System.out.println("4. Delete First ");
			System.out.println("5. Delete Last ");
			System.out.println("6. Delete By Position ");
			System.out.println("7. Insert Before ");
			System.out.println("8. Insert After ");
			System.out.println("9. Insert Sorted ");
			System.out.println("10. Count Nodes ");
			System.out.println("11. Display the List ");
			System.out.println("12. Display in reverse");
			System.out.println("13. Display Alternate Node ");
			System.out.println("14. Exit ");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 : System.out.println("Enter the value to be inserted : ");
					 data = sc.nextInt();
					 ll.insertFirst(data);
					 break;
					 
			case 2 : System.out.println("Enter the value to be inserted : ");
			 		 data = sc.nextInt();
			 		 ll.insert_last(data);
			 		 break;
			 		 
			case 3 : System.out.println("Enter the value to be inserted : ");
			 		 data = sc.nextInt();
			 		 System.out.println("Enter the position where the value needs to be inserted : ");
			 		 pos = sc.nextInt();
			 		 ll.insert_by_pos(data, pos);
			 		 break;
			 		 
			case 4 : data = ll.deleteFirst();
					 if(data != -999)
						 System.out.println(data+" First element deleted...");
					 break;
					 
			case 5 : data = ll.deleteLast();
					 if(data != -999)
						 System.out.println(data+" Last element deleted...");
					 break;
					 
			case 6 : System.out.println("Enter the position to delete the element :");
					 pos = sc.nextInt();
					 data = ll.delete_by_pos(pos);
					 if(data != -999)
						 System.out.println(data+" Element deleted from position "+pos);
					 break;
					 
			case 7 : System.out.println("Enter the value to be inserted : ");
					 data = sc.nextInt();
					 System.out.println("Enter the position :");
					 pos = sc.nextInt();
					 ll.insert_before(data, pos);
					 break;
					 
			case 8 : System.out.println("Enter the value to be inserted : ");
					 data = sc.nextInt();
					 System.out.println("Enter the position : ");
					 pos = sc.nextInt();
					 ll.insertAfter(data, pos);
					 break;
					 
			case 9 : System.out.println("Enter values to inserted in sorted list : ");
					 data = sc.nextInt();
					 ll.insertSorted(data);
					 break;
					 
			case 10 : data = ll.count();
					  System.out.println("There are "+data+" Nodes in the current List...");
					  break;
					  
			case 11 : System.out.println(ll);
					  break;
					  
			case 12 : ll.reverseLL(); 
					  System.out.println(ll);
					  break;
					  
			case 13 : ll.displayAlternateNode();
					  break;
					  
			case 14 : System.out.println("Exitting...");
					  break;
					  
			default : System.out.println("Invalid Choice!!!");
			
			}
		}while(choice != 14);
		System.out.println("Finished...");
	}
}
