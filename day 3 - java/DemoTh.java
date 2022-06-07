// String Classes
public class DemoTh
{
	public static void main(String[] args)
	{
	   // STRING POOL
       String s1 = "java";
       
       // HEAP
       String s2 = new String("python");
       
       System.out.println(s1);
       System.out.println(s2);
       
       // only single memory allocation
       String s3 = "ruby";
       String s4 = "ruby";
       
      // == operator
       
      System.out.println(s3 == s4); 
      
      // only single memory allocation
      String s31 = "ruby";
      String s41 = "Ruby";
      
     // == operator
      
     System.out.println(s31 == s41);
     
     
     
     // only diffe memory allocation
     String s32 = new String("rust");
     String s42 = new String("rust");
     
    // == operator  
    System.out.println(s32 == s42);
    
    
    System.out.println(s1.equals(s2));
    System.out.println(s32.equals(s42));
	}

}
