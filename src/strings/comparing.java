package strings;

public class comparing {

	public static void main(String[] args) {
		String romanNumber = "VIII";
		int number = 0;

		for (int index = 0; index < romanNumber.length(); index++) {
			System.out.println("index = " + index);// index = 3
			if (romanNumber.charAt(index) == 'I') {
				number = number + 1;
			}
			if (romanNumber.charAt(index) == 'V') {
				number = number + 5;
			}

			if (romanNumber.charAt(index) == 'X') {
				number = number + 10;
			}

			if (romanNumber.charAt(index) == 'L') {
				number = number + 10;

			}

		}

		System.out.println(number);

	}

}