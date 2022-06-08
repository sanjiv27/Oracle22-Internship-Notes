public class DemoEight
{
	String name;
	int age;
	
    DemoEight(String name, int age)
    {
      // x = x
     //obj1.name
     //obj2.name
	  this.name = name;
	  this.age = age;
	}
    
    void accessProps()
    {
    	System.out.println(this.name + this.age);
    }
    
    static int numIs = 500;
    
	public static void main(String[] args)
	{
	   DemoEight obj1 = new DemoEight("Manav", 28);	
       System.out.println(obj1.age);
       System.out.println(obj1.name);
       
       DemoEight obj2 = new DemoEight("Anjali", 20);	
       System.out.println(obj2.age);
       System.out.println(obj2.name);
       
       obj1.accessProps();
       obj2.accessProps();
       
       System.out.println(DemoEight.numIs);
	}
	

}
