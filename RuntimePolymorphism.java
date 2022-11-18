import java.util.*;
class Shape
{
	void draw()
	{
		System.out.println("I am Shape");
	}
	void erase()
	{
		System.out.println("Shape has been erased");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("I am Circle");
	}
	void erase()
	{
		System.out.println("Circle has been erased");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("I am Triangle");
	}
	void erase()
	{
		System.out.println("Triangle has been erased");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("I am Square");
	}
	void erase()
	{
		System.out.println("Square has been erased");
	}
}
class RuntimePolymorphism
{
	public static void main(String args[])
	{
		Shape ref=new Circle();//Upcasting
		ref.draw();
		ref.erase();
		Circle ref1=(Circle)ref;//Downcasting
		ref1.draw();
		ref1.erase();
		Shape ref2=new Triangle();//Upcasting
		ref2.draw();
		ref2.erase();
		Triangle ref3=(Triangle)ref2;//Downcasting
		ref3.draw();
		ref3.erase();
		Shape ref4=new Square();//Upcasting
		ref4.draw();
		ref4.erase();
		Square ref5=(Square)ref4;//Downcasting
		ref5.draw();
		ref5.erase();
	}
}
