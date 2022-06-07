public class DemoSeven 
{
    DemoSeven()
    {
	  System.out.println("this is default constrcutor");
    }
    
    {
    	System.out.println("this is instance block");
    }
    
	public static void main(String[] args) 
	{
	  DemoSeven obj1 = new DemoSeven();	
	  DemoSeven obj2 = new DemoSeven();
	}

}
