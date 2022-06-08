import java.util.ArrayList;
import java.util.Iterator;

public class DemoTwtyT 
{
   String name;
   int age;
   
   DemoTwtyT( String name, int age)
   {
      this.name = name;
      this.age = age;
   }
   
   
   public String toString()
   {
	   return name + age;
   }
	public static void main(String[] args)
	{
	   DemoTwtyT p1 = new DemoTwtyT("Manav", 28);
	   DemoTwtyT p2 = new DemoTwtyT("Amar", 20);
	   DemoTwtyT p3 = new DemoTwtyT("Sanjiv", 22);
	   
	   ArrayList<DemoTwtyT> arrayList = new ArrayList<DemoTwtyT>();
	   arrayList.add(p1);
	   arrayList.add(p2);
	   arrayList.add(p3);
	   
	   Iterator<DemoTwtyT> itr = arrayList.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			   
	}

}
