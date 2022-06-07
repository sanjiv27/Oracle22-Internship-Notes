// Global, Local

class DemoFive
{
	// Global Variable
	String nameIs = "Java";
	
	int num = 50;
	
	void instanceMethod()
	{
	 // local variable
	  String nameIs = "Python";
	  System.out.println(nameIs);	
	}
	
	void instanceMethodOther()
	{
	     nameIs = "Rust";
	  // System.out.println(nameIs);	
	}
	
	
	void myNumberAccessMethod()
	{
	    num = 100;
		System.out.println(num);
	}
	
	public static void main(String args[])
	{
		DemoFive obj = new DemoFive();
		obj.instanceMethod();
		System.out.println(obj.nameIs);
		
		obj.instanceMethodOther();
		System.out.println(obj.nameIs);
		
		obj.myNumberAccessMethod();
		System.out.println(obj.num);
	}
	
}