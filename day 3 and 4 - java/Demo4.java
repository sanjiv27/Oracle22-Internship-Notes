// Static Properties
// memory alocated -> at class loading time
// every object -> share the static property
// static property -> single memory allocation
// static property -> variable, block, inner classes only, methods

class DemoFour
{
	// static variable
	static int numberIs = 100;
	
	// static methods
	static void display()
	{
        System.out.println("This is static Method");
	}
	
	// instance variable
	  float fValIs = 3.14f;
	 
    // instance block
    // auto invoked at obj creation time
	// seprately invoked for each object
     {
		System.out.println("This is Instance Block"); 
	 }	

	 
	 // static block
    // auto invoked at class loading time
	
     static{
		System.out.println("This is static Block"); 
	 }
	 
     public static void main(String args[])
	{
		System.out.println(DemoFour.numberIs);
		DemoFour.display();
		
		DemoFour obj1 = new DemoFour();
		DemoFour obj2 = new DemoFour();
		
		System.out.println(obj1.fValIs);
		System.out.println(obj2.fValIs);
		
		
		System.out.println("Manipulating instance property");
		obj1.fValIs = 6.12f;
		System.out.println(obj1.fValIs);
		System.out.println(obj2.fValIs);
		
		System.out.println("Manipulating static property");
		DemoFour.numberIs = 50;
		System.out.println(DemoFour.numberIs);
		
	}
	
}