package casestudy;

class Superclass{
	
	int i,j;
	public void set()
	{
		i = 10;
		j = 20;
	}
	
	public void get()
	{
		System.out.println("Superclass i: "+ i);
		System.out.println("Superclass j: "+j);
	}
}

class Subclass extends Superclass{
	
	int k;
	public void set()
	{
		k = 30;
		i = 1;
	}
	
	public void get()
	{
		System.out.println("Subclass k: "+k);
		System.out.println("Subclass i: "+i);
		System.out.println("Sum of i,j and k: "+(i+j+k));
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		Superclass superr = new Superclass();
		superr.set();
		superr.get();
		
		Subclass subb = new Subclass();
		subb.set();
		subb.get();
	}

}
