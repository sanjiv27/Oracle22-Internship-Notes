import java.util.Iterator;
import java.util.Vector;

public class DemoTwtyOne
{
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();
        
		v.add("num1");
		v.add("num2");
		v.add("num3");
		v.add("num4");
		v.add("num5");
		
		v.add("num1");
		v.add("num2");
		v.add("num3");
		v.add("num4");
		v.add("num5");
		
		v.add("num5");
		
       Iterator<String> itr = v.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(v.size());
		v.trimToSize();
		System.out.println(v.capacity());
	}

}
