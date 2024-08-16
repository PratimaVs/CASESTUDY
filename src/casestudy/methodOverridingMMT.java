package casestudy;



	class Parent{
		
		public void toCity()
		{
			System.out.println("To city - VNS");
		}
		
		public void fromCity()
		{
			System.out.println("From city - HYD");
		}
		
		public void singleTrip()
		{
			System.out.println("Single trip");
		}
		
		public void roundTrip()
		{
			System.out.println("Round trip");
		}

	}

	class child extends Parent
	{
		public void singleTrip()
		{
			System.out.println("Single trip -child");
		}
		
		public void roundTrip()
		{
			System.out.println("Round trip - child");
		}		
		
	}
	public class methodOverridingMMT {
		
	public static void main(String[] args) {
		Parent cust = new Parent();
		cust.toCity();
		cust.fromCity();
		cust.roundTrip();
		cust.singleTrip();
		System.out.println("parent class obj , instance of child class");
		Parent branch_cust = new child();
		branch_cust.roundTrip();
		branch_cust.singleTrip();
		
	}

}
