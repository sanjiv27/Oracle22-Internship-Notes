// Final Keyword 
// 1. variable ->  constant 
// 2. method   ->  can't override it
// 3. class    ->  can't inherit it

// final class ParentIs
class ParentIs
{
	// final void pMethodIS()
    void pMethodIS()
    {
    	System.out.println("Parent Method");
    }
}
public class DemoSevent extends ParentIs
{
	// final int numberIs = 500;
     int numberIs = 500;
    
    void changeNumberValue()
    {
    	numberIs = 99;
    }
    
    void pMethodIS()
    {
    	System.out.println("Parent Method is overriden");
    }
    
	public static void main(String[] args)
	{
		DemoSevent obj = new DemoSevent();
        System.out.println(obj.numberIs);
        obj.changeNumberValue();
        System.out.println(obj.numberIs);
        
        obj.pMethodIS();
	}

}
