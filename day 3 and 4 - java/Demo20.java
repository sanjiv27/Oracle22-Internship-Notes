// Collection Framework
// List(arraylist, vector), Set(hashset, set), Queue(priority, deque),   MAP(HashMap)

import java.util.ArrayList;
import java.util.Iterator;
public class DemoTwty
{   
	public static void main(String[] args)
	{
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		ar1.add(40);
		ar1.add(50);
		
		System.out.println(ar1);
		ar1.remove(2);
		System.out.println(ar1);
		
		for(Integer box: ar1)
		{
			System.out.println(box);
		}
		
		Iterator<Integer> itr = ar1.iterator();
		
		// System.out.println(itr.next());
		// System.out.println(itr.next());
		
		System.out.println("Properly using iterator");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(ar1.size());
	}

}
