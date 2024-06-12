package dsa1;

public class Student {
 
	 private String name ;
	 private int rollno ;
	 private int marks1;
	 private int marks2;
	 
	 public Student() {}
	 
	 
	public Student(String name, int rollno, int marks1, int marks2) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks1 = marks1;
		this.marks2 = marks2;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", marks1=" + marks1 + ", marks2=" + marks2 + "]";
	}
	 
}
