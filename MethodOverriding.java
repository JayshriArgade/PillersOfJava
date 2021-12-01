package Polymorphism;

class ParentClass
{
   public void display()
   {
	   System.out.println("Parent class method");
	   double s = Math.sqrt(81);
	   System.out.println("Square root = "+s);
   }
}

public class MethodOverriding extends ParentClass
{
	public void display()
	{
		super.display();    // to call parent class overrider method
		System.out.println("Child class method");
		double d = Math.cbrt(27);
		System.out.println("Cube root = "+d);
	}

	public static void main(String[] args) 
	{
		ParentClass p = new ParentClass();
		p.display();
		
		ParentClass p1 = new MethodOverriding();  
		p1.display();              // child class method is overriding parent class method
		
		MethodOverriding m = new MethodOverriding();
		m.display();        // child class method is overriding parent class method
	}

}
