// Process -> Eclipse
// Thread  -> Grammar

// Thread -> Thread class, Runnable Interface
public class DemoTwtyF extends Thread
{
	public void run()
	{
		for(int count = 0; count <=50; count++)
		{
			System.out.println(count);
		}
	}
	
	// MAIN THREAD
	public static void main(String[] args)
	{
		DemoTwtyF thread1 = new DemoTwtyF();   
		
		thread1.start();   // --------> 2 therads
		
		for(int count = 0; count <=50; count++) // --> main therad
		{
			System.out.println(count);
		}
    
	}

}
