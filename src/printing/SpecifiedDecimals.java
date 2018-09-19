package printing;

public class SpecifiedDecimals {

	public static void main(String[] args) {
		
		float floatNumber = 1.9f; 
		int numberOfDecimals = 2; 
		
		double rounder = floatNumber * Math.pow(10, numberOfDecimals);
		
		double round = Math.round(floatNumber * rounder )/rounder; 
		System.out.println(round);

	}

}
