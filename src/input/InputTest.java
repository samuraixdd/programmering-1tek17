package input;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in); 
		
		System.out.print("Enter Name: ");
		
		String name = inputScanner.nextLine();
		System.out.println("Hello" + name);
		System.out.print("Enter your age: ");
		
		int age = inputScanner.nextInt();
		
		if (age > 120) {
			System.out.println("Liar Liar Pants On Fire");
			System.exit(0);
	    } else if(age < 5) {
	        System.out.println("You must be older!");
	        System.exit(0);
	    }else {
	        System.out.println("So your age is:" + age);
	    }	
	    
		
	    
		System.out.print("Enter your weight: ");
		double weight = inputScanner.nextDouble();
		if (weight > 140) {
		System.out.println("Fatass");
		System.exit(0);
		} else if (weight < 20) {
			System.out.println("You're Too Skinny");
			System.exit(0);
		}
		System.out.println("So your weight is: " + weight);

	    }

}





