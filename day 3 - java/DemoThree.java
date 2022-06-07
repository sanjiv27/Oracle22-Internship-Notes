// Vriables
class DemoThree
{
   
   // member variables, instance variables, property
   // Defination
   int num = 100;
   String name = "Manav";
   float fVal = 3.14f;
   
   
   // Declare 
   int num2;
   String name2;
   float fVal2;
   
   
   public static void main(String args[])
	{
	    DemoThree obj = new DemoThree();
		
		System.out.println(obj.num);
		System.out.println(obj.name);
		System.out.println(obj.fVal);
		
		// default values are assigned by JVM
		System.out.println(obj.num2);
		System.out.println(obj.name2);
		System.out.println(obj.fVal2);
    }
}  