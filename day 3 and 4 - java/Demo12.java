// Inheritance with constructors 
// you can't inherit constructor
// Constructor call must be the first statement in a constructor
class GrandParentOther
{
	GrandParentOther()
	{
		System.out.println("this is grandParent constrctor");
	}
	
   void gMethod()
   {
	   System.out.println("this is gMethod");
   }
}

class ParentOther extends GrandParentOther
{
	String pName = "Parent";
	
	void pMethod()
	{
		System.out.println("this is parent method");
	}
	
    ParentOther() 
    {
	   System.out.println("Parent Constructor");
    }	
    
    {
    	System.out.println("This is Parent Block");
    }
}

public class DemoTw extends ParentOther 
{
	DemoTw() 
	{
       super();
	   System.out.println("Child Constructor");
	   System.out.println(super.pName);
	   super.pMethod();
	   
	}
	
	public static void main(String[] args)
	{
	 	DemoTw obj = new DemoTw();

	}

}
