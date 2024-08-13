//to create a program to take username and password
package casestudy;

import java.util.Scanner;
public class TestCase1 {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		String name = input.nextLine();
		String password = input.nextLine();
		
		if((name.compareTo(password)) == 0)
			System.out.println("Both are same");
		else
			System.out.println("Different");

	}

}
