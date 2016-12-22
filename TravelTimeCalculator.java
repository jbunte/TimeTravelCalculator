import java.util.Scanner;

public class TravelTimeCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println();

		Scanner keyboard = new Scanner(System.in);
		float miles;
		float mph;
		int hours;
		int minutes;

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles: ");
			miles = keyboard.nextFloat();

			System.out.print("Enter miles per hour: ");
			mph = keyboard.nextFloat();

			hours = (int)(miles / mph);
			minutes = (int)(((miles % mph)*60)/mph);
			
			String message = "\nEstimated travel time" + "\n" + "\n"
					+ "Hours: " + hours + "\n" 
					+ "Minutes: " + minutes + "\n";
			System.out.println(message);
			
			System.out.print("Continue? (y/n): ");
            choice = keyboard.next();
            System.out.println();
		}
	}
}
