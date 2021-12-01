package Inheritance;

class circle 
{
   public void circle1(float radius)
   {
	   float area = (float)(3.14)*(radius*radius);
	   System.out.println("Circle area = "+area);
   }
   
   public void square(float side)
   {
	   float area = (float)(3.14)*(side*side);
	   System.out.println("Square area = "+area);
   }
}

class shape extends circle
{
	public void angleOfShape()
	{
		System.out.println("Shapes of Angle");
	}
}


class MultilevelInheritance extends shape
{
	public void findRadius(float area)
	{
		float radius = (float) Math.sqrt(area/3.14);
		System.out.println("Radius = "+radius);
	}
	public static void main(String[] args)
	{
		circle m1 = new circle();
		m1.circle1(3.2f);
		m1.square(4);
		
		circle m2 = new shape();
		m2.circle1(3.2f);
		m2.square(4);
		
		circle m3 = new MultilevelInheritance();
		m3.circle1(4.3f);
		m3.square(5);
		
		shape s1 = new shape();
		s1.angleOfShape();
		s1.circle1(2.2f);
		s1.square(2);
		
		shape s2 = new MultilevelInheritance();
		s2.angleOfShape();
		s2.circle1(2.1f);
		s2.square(2);
		
		MultilevelInheritance c1 = new MultilevelInheritance();
		c1.angleOfShape();
		c1.circle1(3.2f);
		c1.square(2);
		c1.findRadius(625);
	}
}