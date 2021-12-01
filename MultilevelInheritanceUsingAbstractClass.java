package Inheritance;

import java.util.Scanner;

// Parent abstract class
abstract class ParentAbstract
{
	abstract void add();
	abstract void sub();
}


// child class
class MultilevelInheritanceUsingAbstractClass extends ParentAbstract
{
	Scanner sc = new Scanner(System.in);
	
	void add()
	{
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Addition = "+(a+b));
	}
	
	void sub()
	{
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Substraction = "+(a-b));
	}

	public static void main(String[] args)
	{	
		ParentAbstract p = new MultilevelInheritanceUsingAbstractClass();
		p.add();
		p.sub();
		
	}

}
