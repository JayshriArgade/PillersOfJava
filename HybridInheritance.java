package Inheritance;

// Parent Interface
interface parentBase
{
	abstract void display1();
}

// Child-Parent interface1
interface ChildBase1 extends parentBase
{
	abstract void display2();
}

//Child-Parent interface2
interface ChildBase2 extends parentBase
{
	abstract void display3();
}

// Child class
public class HybridInheritance implements ChildBase1, ChildBase2
{
	public void display1()
	{
		System.out.println("Method of ParentBase interface");
	}
	
    public void display2()
    {
    	System.out.println("Method of Child-Parent base-1");
    }
    
    public void display3()
    {
    	System.out.println("Method of Child-Parent base-2");
    }
	public static void main(String[] args) 
	{
		HybridInheritance h = new HybridInheritance();
		h.display1();
		h.display2();
		h.display3();
	}

}
