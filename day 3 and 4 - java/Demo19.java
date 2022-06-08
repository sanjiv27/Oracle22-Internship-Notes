// Wrapper Classes

public class DemoNineT
{
	String nameIs; 
     
	DemoNineT(String nameIs) 
     {
		this.nameIs = nameIs;
	 }
	
	public String toString()
	{
		return nameIs;
	}
	
	public static void main(String[] args)
	{
		
      DemoNineT obj = new DemoNineT("Manav");
	
      System.out.println(obj);
      int numOne = 100;
      
      // Boxing or AutoBoxing
      Integer i1 = numOne;

      System.out.println(numOne);
      System.out.println(i1.toString());
     
      // // UnBoxing or AutoUnBoxing
     int numConvertedVal = i1;
     System.out.println(numConvertedVal);
     System.out.println(i1);
	}

}
