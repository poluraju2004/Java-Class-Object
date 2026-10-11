/*8.Class and methods: Create a class Calculator with relevant data membersand a constructor. Implement methods for basic arithmetic operations
(addition, subtraction, multiplication, division, modulus) and demonstrate their usage*/
import java.util.Scanner;
class Calculator{
	int a;
	int b;

	public Calculator(int a, int b){
		this.a = a;
		this.b = b;
	}

	public void addition(){
		System.out.println( "Addition = " + (a+b) );
	}

	public void subtraction(){
		System.out.println( "Subtraction = "+(a-b));
	}

	public void multiplication(){
		System.out.println( "Multiplication = "+(a*b));
	}

	public void division(){
		System.out.println( "Division = "+(a/b));
	}

	public void modulus(){
		System.out.println("Modulus = "+(a%b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		System.out.print("Enter b number: ");
		int b = sc.nextInt();
		Calculator c1 = new Calculator(a,b);
		c1.addition();
		c1.subtraction();
		c1.multiplication();
		c1.division();
		c1.modulus();

	}
}
