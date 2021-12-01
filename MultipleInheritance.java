package Inheritance;

// First parent Interface
interface NationalFlower
{
	abstract void displayFlower();
}

// Second parent interface
interface NationalFruit
{
	abstract void displayFruit();
}

// Child Class
public class MultipleInheritance implements NationalFlower, NationalFruit
{
	public void displayFlower()
	{
		System.out.println("National Flower = Lotus");
	}
	
	public void displayFruit()
	{
		System.out.println("National Fruit = Mango");
	}
	
	public static void main(String[] args) 
	{
		MultipleInheritance m = new MultipleInheritance();
		m.displayFlower();
		m.displayFruit();
	}

}
