public class DemoSix 
{
   int priceOfHouse;
   
   // Constructor ->
   // 1. object creation
   // 2. don't have return type 
   // 3. auto calling while object creation
   DemoSix(int price)
   {
	  priceOfHouse = price;   
   }
   
   
	public static void main(String[] args)
	{
	  DemoSix sanjiv = new DemoSix(60);
	  DemoSix virendra = new DemoSix(99);
      
	  System.out.println(sanjiv.priceOfHouse);
	  System.out.println(virendra.priceOfHouse);
	}

}
