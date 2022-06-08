// Interface
// class -> class => extends
// class -> interface => implements
// interface -> interface => extends
// class -> can inherit multi interface 
interface IntraOther
{
	void absMeth();
	abstract void absMeth2();
	public abstract void absMeth3();
	
	
	int num = 100;
	public final static int num2 = 200;
	
	default void thisIsDefaultMethod()
	{
		System.out.println("this is defult method");
	}
	
}


public class DemoSixt implements IntraOther
{
	public void absMeth()
	{
		System.out.println("Implemented Method 1");
	}
	
	public void absMeth2()
	{
		System.out.println("Implemented Method 2");
	}
	
	public void absMeth3()
	{
		System.out.println("Implemented Method 3");
	}
	public static void main(String[] args)
	{
		System.out.println(IntraOther.num);
		System.out.println(IntraOther.num2);
		
		DemoSixt obj = new DemoSixt();
		obj.absMeth();
		obj.absMeth2();
		obj.absMeth3();
		
		obj.thisIsDefaultMethod();
	}

}
