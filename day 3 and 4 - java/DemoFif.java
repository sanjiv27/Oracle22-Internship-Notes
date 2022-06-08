// Abstraction -> Data Hiding + only useful information
// Abstract Keyword, Interface

// Abstract use -> class, method

// 1. abstract class -> you can't create object
// 2. inside abstract class only you can have abstract method 
// 3. abstract method -> method declaration (without body)
// 4. inside abstract class -> constructor, static method, private methods(11)
// 5. abstract class -> can inherit abstract class
// 6. abstract class -> contains abstract method 
//                              -> in inherited class it implement(provide body) it

abstract class Abs
{	
	int num = 20;
	static String nameOfLang = "Java";
	
	void simpleMethod()
	{
		System.out.println("this is body");
	}
	
	abstract void absMethod();
	
	static void staticMethod()
	{
		System.out.println("This is static method");
	}
	
	Abs()
	{
		System.out.println("this is constrctor");
	}
	
}

public class DemoFif extends Abs
{
	void absMethod()
	{
		System.out.println("abstract method implemented");
	}
	
	public static void main(String[] args)
	{
		// Cannot instantiate the type Abs
		// Abs obj = new Abs();
		// obj.absMethod();
		
		DemoFif chObj = new DemoFif();
		chObj.absMethod();
		chObj.simpleMethod();

		Abs.staticMethod();
		System.out.println(Abs.nameOfLang);
		System.out.println(chObj.num);
	}

}
