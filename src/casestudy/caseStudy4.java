package casestudy;

import java.util.Scanner;
public class caseStudy4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//double
		System.out.println("enter the double value");
		double d = input.nextDouble();
		System.out.println("you entered "+ d);
		//boolean
		System.out.println("enter boolean");
		boolean b = input.nextBoolean();
		System.out.println("you entered "+ b);
		
		//hasNext()
		System.out.println("enter some text(type 'exit' to stop)");
		
		while(input.hasNext())
		{
			String word = input.next();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("You entered: " + word);
		}
		//hasNextInt()		
		System.out.println("enter some text");
		while(input.hasNextInt())
		{
			boolean word = input.hasNextInt();
            if (word == false) {
            	System.out.println("it is not integer");
                break;
            }
            System.out.println("You entered an integer");
            break;
		}
		//hasNextLine()
		System.out.println("Enter lines of text (type 'exit' to stop):");

        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.equalsIgnoreCase("exit")) {
            	System.out.println("No next line");
                break;
            }
            System.out.println("You entered: " + line);
        }

        input.close();
	}

}
