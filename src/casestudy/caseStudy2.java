package casestudy;

import java.util.Scanner;
public class caseStudy2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int a =input.nextInt();
		if(a%2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");

	}

}
