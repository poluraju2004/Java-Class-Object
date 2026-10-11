package PracaticeOOPS_Programs;

/* 1. Write a Java program to create a class called "Person" with a name and age attribute. 
 * Create two instances of the "Person" class, set their attributes using the constructor, 
 * and print their name and age*/

class MainPerson{
	private String name;
	private int age;
	
	MainPerson(String name,int age){
			this.name = name;
			this.age = age;
	}
	public void GetPerson() {
		System.out.println(" Name "+name + " Age "+age);
	}
}
public class Person {

	public static void main(String[] args) {
		MainPerson mp1  = new MainPerson("ABC",25);
		mp1.GetPerson();
		MainPerson mp2  = new MainPerson("XYZ",22);
		mp2.GetPerson();
		
		
	}

}
