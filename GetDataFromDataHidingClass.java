package Encapsulation;

public class GetDataFromDataHidingClass 
{

	public static void main(String[] args)
	{
		DataHidingClass.setNameValue("Jayshri");
		
		String s1 = DataHidingClass.getNameValue();
		
		System.out.println(s1);
	}

}
