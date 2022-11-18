import java.util.Scanner;
import java.util.*;
class GrandParent
{
	String grandFatherName;
	String grandMotherName;
	void GrandParent(String gFN,String gMN)
	{
		this.grandFatherName=gFN;
		this.grandMotherName=gMN;
		System.out.println("GrandPa's name is ="+grandFatherName);
		System.out.println("Granny's name is ="+grandMotherName);
	}
}
class Parent extends GrandParent
{
	String fatherName;
	String motherName;
	void Parent(String gFN,String gMN,String fN,String mN)
	{
		this.fatherName=fN;
		this.motherName=mN;
		gFN=gFN;
		gMN=gMN;
		super.GrandParent(gFN,gMN);
		System.out.println("Papa's name is ="+fatherName);
		System.out.println("mummy's name is ="+motherName);
	}
	void Parent(String gFN,String gMN)
	{
		
	}
}
class Child extends Parent
{
	public static void main(String args[])
	{
		Child obj =new Child();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Grandpa,granny,papa,mummy name");
		String gFN=sc.nextLine();
		String gMN=sc.nextLine();
		String fN=sc.nextLine();
		String mN=sc.nextLine();
		obj.Parent(gFN,gMN,fN,mN);
	}
}