public class DemoTwtySix extends Thread
{
	public void run()
	{
		for(int count = 0; count <=10; count++)
		{
			System.out.println(this.getName());
		}
	}
	
	// MAIN THREAD
	public static void main(String[] args)
	{
		DemoTwtySix thread1 = new DemoTwtySix();   
		DemoTwtySix thread2 = new DemoTwtySix();
		DemoTwtySix thread3 = new DemoTwtySix();
		
		
		thread1.start();
		thread1.setName("threadOne");
		
		
		thread2.start();
		thread2.setName("threadTwo");
		
		try 
		{
			thread2.join();
		}
		catch (InterruptedException e)
		{
			System.out.println(e);
		}
		
		thread3.start();
		thread3.setName("threadThree");
	}

}
