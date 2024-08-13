//using switch statements print current day and month
package casestudy;

import java.util.Scanner;

public class TestCase2 {

	public static void main(String[] args) {
		
		int month = 8;
		int day = 3;
		
		switch(month)
		{
		case(01): 
				System.out.println("Jan");
				break;
		case(02): 
			System.out.println("Feb");
			break;
		case(03): 
			System.out.println("Mar");
			break;
		case(04): 
			System.out.println("April");
			break;			
		case(05): 
			System.out.println("May");
			break;
		case(06): 
			System.out.println("Jun");
			break;
		case(07): 
			System.out.println("July");
			break;
		case(8): 
			System.out.println("Aug");
			break;
		case(9): 
			System.out.println("Sept");
			break;
		case (10):
			System.out.println("Oct");
			break;
		case (11):
			System.out.println("Nov");
			break;
		case (12):
			System.out.println("Dec");
			break;
		}

	}

}
