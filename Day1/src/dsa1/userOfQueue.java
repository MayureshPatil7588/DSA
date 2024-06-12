package dsa1;

import java.util.Scanner;

public class userOfQueue {
	public static void main(String[] args) {
		
			intQueue st = new intQueue();
			
			int ch,data;
			do {
				System.out.println("\n 1.insert");
				System.out.println("\n 2.remove");
				System.out.println("\n 3.Peak");
				System.out.println("\n 4.Exit");
				System.out.println("\n Enter Your Choice (1/2/3/4)");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			switch (ch) {
			case 1: {
			 System.out.println("\n Enter an value ");
			 data =sc.nextInt();
			 st.insert(data);
			 break;
			
			}
			case 2: {
				 data =st.remove();
				 if(data!= -999)
				 System.out.println(data+ " Popped ");
				 break;
			}
				
			case 3: {
				data =st.peak();
				 if(data!= -999)
				 System.out.println(data+ " Peaked ");
				 break;
				  
			}
			
			case 4 : {
				
				System.out.println(st);
			}
				 
			
			default:
			throw new IllegalArgumentException("Unexpected Value : " + ch);
			}
			
			} while (ch!=5);
			
		}
	}

