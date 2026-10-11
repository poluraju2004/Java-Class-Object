/*
1.Define a class of type Student that has rollno, name and age as privatedata members. Define SetData() and GetData() as public member functions
with appropriate functionality. Write a program that declares 2 studentobjects, initializes the first at run-time and second by reading from the
console, and then displays both student’s data.*/

import java.util.Scanner;
class Student{
	private int rollno;
	private String name;
	private int age;

	public void setStudent(int r,String n,int a){
		rollno = r;
		name = n;
		age = a;
	}
	public void getStudent(){
		System.out.println(rollno + "  "+ name + " "+ age);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudent(35,"Adavance Computing",22);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a roll no: ");
		int rollno = sc.nextInt();
		System.out.print("Enter a name: ");
		String name = sc.next();
		System.out.print("Enter age: ");
		int age = sc.nextInt();

		Student s2 = new Student();
		s2.setStudent(rollno,name,age);
		s1.getStudent();
		s2.getStudent();
	}

}