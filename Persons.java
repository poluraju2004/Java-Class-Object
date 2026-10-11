/* 2.Create a class Person with attributes name, age and country. Implement methods to set and get these attributes. 
Create an object of this class, set its attributes, and print out the details.*/

class Persons{

	private String name;
	private int age;
	private String country;

	void setPerson(String name,int age,String country){
		this.name = name;
		this.age = age;
		this.country = country;
	}

	void getPerson(){
		System.out.println(name + " " + age + " " + country);
	}
	public static void main(String[] args) {
		Persons p = new Persons();
		p.setPerson("ABC",22,"India");
		p.getPerson();
		Persons p2 = new Persons();
		p2.setPerson("Srinu",22,"USA");
		p2.getPerson();
	}
}