package dsa1;

import java.util.Scanner;

public class userOfStudent {

	public static void main(String[] args) {

		Student Stu = new Student();
		StackStudent sst = new StackStudent();

		int ch, data;
		do {
			System.out.println("\n 1.Push");
			System.out.println("\n 2.Pop");
			System.out.println("\n 3.Peak");
			System.out.println("\n 4.Exit");
			System.out.println("\n Enter Your Choice (1/2/3/4)");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("\n Enter an value name");
				String name = sc.next();
				System.out.println("\n Enter an rollNo ");
				int rollno = sc.nextInt();
				System.out.println("\n Enter an marks1 ");
				int mks1 = sc.nextInt();
				System.out.println("\n Enter an marks2 ");
				int mks2 = sc.nextInt();
				Student s1 = new Student(name, rollno, mks1, mks2);
				sst.push(s1);
				break;
			}
			case 2: {
				Stu = sst.pop();
				if (Stu.getRollno() == 0)
					System.out.println(Stu.getRollno() + " Popped ");
				break;
			}

			case 3: {
				Stu = sst.peak();
				if (Stu.getRollno() == 0)
					System.out.println(" Stack is Empty ");
				else
					System.out.println(Stu);
				break;
			}

			case 4: {
				System.out.println(sst);
			}

			default:
				throw new IllegalArgumentException("Unexpected Value : " + ch);
			}
		} while (ch != 5);

	}

}
