// OOP -> 
// inheritance
// code reusability

// simple, multilevel, hybrid, hirech., mulitple

class Parent
{
   String name = "Parent Class it is";
	
   void parentMethod()
   {
	   System.out.println("this is parent method");
   }

}

public class DemoTen extends Parent
{   
	 public static void main(String[] args)
	{
	   DemoTen obj = new DemoTen();
	   System.out.println(obj.name);
	   obj.parentMethod();
    
	}
}
