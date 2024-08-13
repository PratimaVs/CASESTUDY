package casestudy;

import java.util.Scanner;
public class CaseStudy1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter a");
		int a = input.nextInt();
		System.out.println("enter b");
		int b = input.nextInt();
		System.out.println("enter c");
		int c = input.nextInt();
		System.out.print("the greatest number is: ");
		if((a > c) && (a > b))
			System.out.println(a);
		else if ( (c > a) && (c > b))
			System.out.println(c);
		else 
			System.out.println(b);
		}
			
	}

