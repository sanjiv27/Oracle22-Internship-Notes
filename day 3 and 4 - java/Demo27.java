// Asynch MultiThreading
class Camera
{
	synchronized void click()
	{
		for(int count = 0; count <=5; count++)
		{
			System.out.println(count);
		}
	}
}

class PersonOne extends Thread
{
	Camera cm;
	
	PersonOne(Camera cm)
	{
		this.cm = cm;
	}
	public void run()
	{
		cm.click();
	}
}


class PersonTwo extends Thread
{
	Camera cm;
	
	PersonTwo(Camera cm)
	{
		this.cm = cm;
	}
	public void run()
	{
	  cm.click();	
	}
}

public class DemoTwtySeven 
{

	public static void main(String[] args) 
	{
		Camera cm = new Camera();
		
		PersonOne p1 = new PersonOne(cm);
		PersonTwo p2 = new PersonTwo(cm);
		
		p1.start();
		p2.start();

	}

}
public class Demo27 {
    
}
