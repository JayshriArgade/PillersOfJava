package Polymorphism;

public class methodOverloading
{
	static void addition()
	{
		System.out.println("Addition method without parameter");
	}

	static void addition(int a)
	{
		System.out.println("Addition method with int parameter");
		System.out.println("int a = "+a);
	}

	static void addition(float a, float b)
	{
		System.out.println("Addition method with 2 float parameter");
		System.out.println("float a = "+a+"  and  float b = "+b);
	}

	static void addition(int a, int b)
	{
		System.out.println("Addition method with 2 int parameter");
		System.out.println("int a = "+a+"  and  int b = "+b);
	}

	public static void main(String[] args) 
	{
	   addition();
	   
	   addition(4);
	   
	   addition(1.2f, 2.2f);
	   
	   addition(11, 45);
	}

}
