
public class DemoTwtyFive implements Runnable  
{
     public void run()
     {
    	 for(int count = 0; count <=15; count++)
 		{
 			System.out.println(count);
 		}
	 }

	public static void main(String[] args)
	{
		DemoTwtyFive threadOne = new DemoTwtyFive();
		Thread th = new Thread(threadOne);
		th.start();
		
		for(int count = 0; count <=15; count++)
 		{
 			System.out.println(count);
 		}
	}

}
