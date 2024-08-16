package casestudy;

class SBI{
	
	public void homeLoan()
	{
		System.out.println("Home loan - SBI");
	}
	
	public void vehicleLoan()
	{
		System.out.println("Vehicle loan - SBI");
	}
	
	public void personalLoan()
	{
		System.out.println("Personal loan - SBI");
	}
	
	public void creditCardLoan()
	{
		System.out.println("Credit card loan - SBI");
	}
	
	public void propertyLoan()
	{
		System.out.println("Property loan - SBI");
	}
}

class SBI_Branch extends SBI
{
	public void vehicleLoan()
	{
		System.out.println("Vehicle loan - SBI_Branch");
	}
	
	public void creditCardLoan()
	{
		System.out.println("Credit card loan - SBI_Branch");
	}
	
	
}
public class methodOverridingBANK {

	public static void main(String[] args)
	{
		SBI cust = new SBI();
		cust.homeLoan();
		cust.vehicleLoan();
		cust.personalLoan();
		cust.propertyLoan();
		cust.creditCardLoan();
		System.out.println("parent class obj , instance of child class");
		SBI branch_cust = new SBI_Branch();
		branch_cust.homeLoan();
		branch_cust.vehicleLoan();
		branch_cust.personalLoan();
		branch_cust.propertyLoan();
		branch_cust.creditCardLoan();
		System.out.println("child class obj , instance of child class");
		SBI_Branch branch_custt = new SBI_Branch();
		branch_custt.homeLoan();
		branch_custt.vehicleLoan();
		branch_custt.personalLoan();
		branch_custt.propertyLoan();
		branch_custt.creditCardLoan();
		
		
	}

	
}
