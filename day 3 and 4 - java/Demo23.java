import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class DemoTwtyTh 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hashmap =new HashMap<Integer, String>();
		
		hashmap.put(1, "Value1");
		hashmap.put(2, "Value2");
		hashmap.put(3, "Value3");
		hashmap.put(4, "Value4");
		hashmap.put(5, "Value5");
		
		Iterator itr = hashmap.keySet().iterator();

		while(itr.hasNext())
		{
			Integer myKey = (Integer) itr.next();
			System.out.println(myKey + "  " + hashmap.get(myKey));
		}
	}

}
