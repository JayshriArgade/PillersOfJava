package Inheritance;

// Parent class
abstract class ParentClassNational
{
	abstract void type();
}

// First child class
class HierarchicalInheritance extends ParentClassNational
{
	void type()
	{
		System.out.println("National Bird = Peacock");
	}

	public static void main(String[] args) 
	{
		ParentClassNational p = new HierarchicalInheritance();
		p.type();
		
		ParentClassNational p1 = new SecondChild();
		p1.type();
	}

}

// Second child class
class SecondChild extends ParentClassNational
{
	void type()
	{
		System.out.println("National Animal = Tiger");
	}
}
