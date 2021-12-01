package Encapsulation;

public class DataHidingClass
{
   private static String name;
   
   public static String getNameValue()
   {
	   return name;
   }
   
   public static void setNameValue(String s)
   {
	   name = s;
   }
}
