import java.util.Scanner;

public class Vacation {

	public static void main(String[] args) {

		// declare the 3 variables
		String vacationType;
		int groupSize;
		String result;

		// need Scanner for user to input response
		Scanner scnr = new Scanner(System.in);

		// user input for desired kind of trip
		System.out.println("What kind of trip would you like to go on, musical, tropical, or adventurous?");
		vacationType = scnr.nextLine();

		// convert to lower case
		vacationType.toLowerCase();

		// user input for group size
		System.out.println("How many are in your group?");
		groupSize = scnr.nextInt();

		// result output
		result = "Since you are a group of " + groupSize + " going on a " + vacationType
				+ " vacation, you should take a ";

		// add travel options based on group size
		if (groupSize >= 1 && groupSize <= 2) {
			result += "first class";
		} else if (groupSize >= 3 && groupSize <= 5) {
			result += "helicopter";
		} else if (groupSize >= 6) {
			result += "charter flight";
		}

		// add destination options
		if (vacationType.equals("musical")) {
			result += " to New Orleans.";
		} else if (vacationType.equals("tropical")) {
			result += " to a beach vacation in Mexico.";
		} else if (vacationType.equals("adventurous")) {
			result += " to white water rafting the Grand Canyon.";
		}

		// display result
		System.out.println(result);

		// close the scanner
		scnr.close();
	}
}
