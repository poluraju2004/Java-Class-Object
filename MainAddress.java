/*
9.	Composition and Aggregation: Create a class Address with attributes street, city, and state. 
Then create a class Person with attributes name and an Address object. 
Demonstrate how to use com Write a Java class representing a Student. 

Encapsulate the student's name, age, and grade point average (GPA) with private access modifiers. 
Provide getter and setter methods to access and modify these attributes position to model the relationship between a person and their address*/
class Address{
	private String street;
	private String city;
	private String state;

	Address(String s,String c,String st){
		street = s;
		city = c;
		state = st;
	}

	void displayAddress(){
		System.out.println(street + " "+ city + " "+ state);
	}
}

class Person{
	private String name;
	private Address address;

	Person(String n,Address a){
		name = n;
		address = a; 
	}
	void getPerson(){
		System.out.println(name);
		System.out.print("Address: ");
		address.displayAddress();
	}
}

public class MainAddress{
	public static void main(String[] args) {
		Address address  = new Address("Balkampet" , "S.R.Nagar" , "Telengana");
		


		Person p = new Person("Name",address);

		p.getPerson();
		

	}
	
}