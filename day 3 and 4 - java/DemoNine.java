public class DemoNine
{
	int num = 100;
	
	
	void methodOne()
	{
		System.out.println("this is method one");
	}
	
	void methodTwo()
	{
		System.out.println(this.num);
		this.methodOne();
		System.out.println("this is method two");
	}
	
	public static void main(String[] args)
	{
	  DemoNine obj = new DemoNine();
	  obj.methodTwo();
	}

}
