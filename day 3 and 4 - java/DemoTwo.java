// functions -> outside of classes, call ir by name
// methods   -> inside of classes , object.methodName, class.methodName, interface.methodName


class DemoTwo
{
	// method, instance(object) method
	// default method -> which do not have parameters
	void show()
	{
	   System.out.println("This is instance Method");
	}
	
	// para method
	void add(int numOne, int numTwo)
	{
		System.out.println("Sum Is - " + (numOne+numTwo));
	}
	
	// return type
	int sub(int numOne, int numTwo)
	{
		return numOne - numTwo;
	}
	
	public static void main(String args[])
	{
	    DemoTwo obj = new DemoTwo();
		obj.show();
		
		obj.add(10, 20);
		
		System.out.println(obj.sub(50, 30));
	}
	
}


/*void show()
{
	
}

show();



returnType methodName(para)
{
	method body LOGIC
}

methodName(args);

*/


