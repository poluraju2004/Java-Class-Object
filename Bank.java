/*Static Method: Add a static method to the BankAccount class from the previous problem to calculate interest based on a given balance and interest rate. 
Also, implement a method to display the account details including balance and interest earned.*/
import java.util.Scanner;
 class BankAccount{
 	private String accno;
 	private String accType;
 	private double balance;
 
 	static {
 		double intRate = 0.02;
 	}

 	public BankAccount(String accno, String accType, double balance){
 		this.accno = accno;
 		this.accType = accType;
 		this.balance = balance;

 	}

 	public static void calInterest(){
 		int rate ;
 		rate =((balance*2.5)/100);

 	}

 	
 }

 class Bank{
 	public static void main(String[] args) {
 		BankAccount ba = new BankAccount("121384792", "Savings", 10000);
 		ba.calInterest();
 	}

 }