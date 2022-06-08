// MuliLev. Inheritance
class GrParent
{
   String gname = "GrandParent Class it is";
	
   void grParentMethod()
   {
	   System.out.println("this is Grandparent method");
   }
}

class ParentOne extends GrParent
{
   String name = "Parent Class it is";
	
   void parentMethod()
   {
	   System.out.println("this is parent method");
   }

}
public class DemoEleven extends ParentOne
{
	public static void main(String[] args) 
	{
		DemoEleven obj = new DemoEleven();
		
		System.out.println(obj.gname);
        obj.grParentMethod();
        
        System.out.println(obj.name);
        obj.parentMethod();
	}

}
