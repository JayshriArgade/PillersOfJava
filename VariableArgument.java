package Polymorphism;

public class VariableArgument 
{

	public static void display(int... a)
	{
		System.out.println("Int parameters using Var argument");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println();
	}
	
	public static void display(String... s)
	{
		System.out.println("String parameters using Var argument");
		for (int i = 0; i < s.length; i++) 
		{
			System.out.print(s[i]+"  ");
		}
		System.out.println();
	}
	
	public static void display(float... f)
	{
		System.out.println("Float parameters using Var argument");
		for (int i = 0; i < f.length; i++) 
		{
			System.out.print(f[i]+"  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		display(2,4,5,7,6,3);
		
		display("gita", "sita", "34", "ram");
		
		display(1.2f , 3.3f , 2.3f);
	}

}
