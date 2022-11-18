import java.util.*;
import java.util.Scanner;
class Question2 
{
	int accno;
	static double balance;
	Question2()
	{
		this.accno=1234;
		this.balance=10000;
	}
	void withdraw(int withd)
	{
		this.balance=balance-withd;
	}
	void deposit(int depos)
	{
		this.balance=balance+depos;
	}
	void showdata(double balance)
	{
		System.out.println("Remaining balance ="+balance);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Question2 q2=new Question2();
		System.out.println("Enter withd and deposit ammount");
		int withd=sc.nextInt();
		int depos=sc.nextInt();
		q2.withdraw(withd);
		q2.deposit(depos);
		try
		{
			if(balance<0)
				System.out.println("balance can't be -ve"+balance);
			else
				q2.showdata(balance);
		}	
		catch(Exception e)
		{
			System.out.println("balance was -ve"+e);
		}
	}
}
