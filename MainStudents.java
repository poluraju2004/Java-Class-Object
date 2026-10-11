/*Demonstrate how to use com Write a Java class representing a Student. 
Encapsulate the student's name, age, and grade point average (GPA) with private access modifiers. 
Provide getter and setter methods to access and modify these attributes position to model the relationship between a person and their address*/

class Students{
	private String name;
	private int age;
	private double gpa;

	void setName(String name){
		this.name = name;
	}
	void setAge(int age){
		this.age = age;
	}
	void setgpa(double gpa){
		this.gpa = gpa;
	}

	void getTotal(){
		System.out.println("Name " + name);
		System.out.println("Age " + age);
		System.out.println("GPA " + gpa);
	}

}

public class MainStudents{
	public static void main(String[] args) {
		Students s = new Students();
		s.setName("Raju");
		s.setAge(25);
		s.setgpa(8.25);

		s.getTotal();
	}
}