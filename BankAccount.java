/*5.Static Variable: Create a class BankAccount with accno, accType, Balance and static variable interestRate. Initialize it using a static block. Implement
methods to deposit and withdraw funds. Create objects and display details.*/

import java.util.Scanner;
public class BankAccount{
	private int accno;
	private String accType;
	private double balance;

	static{
		double interestRate;
	}
	public BankAccount(int accno,String accType,double balance){
		this.accno = accno;
		this.accType = accType;
		this.balance = balance;
	}

	public void deposit(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a deposit: ");
		int deposit = sc.nextInt();
		balance = balance + deposit;
		System.out.println("Balance = "+ balance);
	}

	public void withdraw(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a withdraw: ");
		double withd = sc.nextInt();
		balance = (balance - withd);
		System.out.println("withdraw balance " + balance);
	}
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(25485698,"Saving",58000);
		ba.deposit();
		ba.withdraw();
	}
}