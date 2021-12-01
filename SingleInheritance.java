package Inheritance;

public class SingleInheritance extends ParentClass
{

	public void multiplication(int a, int b)
	{
		int mult = a*b;
		System.out.println("Multiplication = "+mult);
	}
	
	public static void main(String[] args) 
	{
	   ParentClass p = new ParentClass();
	   p.addition(23, 60);
	   p.subtraction(45, 20);
	   
	   System.out.println();
	   
	   SingleInheritance s = new SingleInheritance();
	   s.addition(21, 21);
	   s.subtraction(50, 30);
	   s.multiplication(12, 10);
	   
	}

}


class ParentClass
{
	public void addition(int a, int b)
	{
		int add = a+b;
		System.out.println("Addition = "+add);
	}
	
	public void subtraction(int a, int b)
	{
		int sub = a-b;
		System.out.println("Subtraction = "+sub);
	}
}