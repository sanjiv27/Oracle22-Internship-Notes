class ParentItIs
{
	int num = 100;
	
	void pMethodItIs()
	{
		System.out.println("Parent");
	}
}

public class Demo28 extends ParentItIs
{
   int num = 200;
   
   void pMethodItIs()
	{
		System.out.println("Child");
	}
   
    /*Upcasting it will print 100 and child only methods will get overridden not the properties */  
	public static void main(String[] args)
	{
		ParentItIs rv = new Demo28(); 
        System.out.println(rv.num);
        
        rv.pMethodItIs();
	}

}
