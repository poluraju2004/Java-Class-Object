package PracaticeOOPS_Programs;

/*. Write a Java program to create a class called "Dog" with a name and breed attribute.
 *  Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the 
 *  setter methods and print the updated values.*/

class Dog{
	private String name;
	private String breed;
	static String college = "Raghu"; 
	Dog(String name,String breed){
		this.name = name;
		this.breed = breed;
	}
	
	public String getDog() {
		return name + breed + college;
	}
	
	
}

public class MainDog {

	public static void main(String[] args) {
		Dog d = new Dog("chitu ","chicken ");
		System.out.println(d.getDog());
		
		Dog d1 = new Dog("vishnu ","Laddu ");
		System.out.println(d1.getDog());

	}

}
