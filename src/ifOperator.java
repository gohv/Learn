import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class ifOperator {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a number from 1 to 10: ");
		int Number = keyboard.nextInt();
		int RandomNumber = new Random().nextInt(10) + 1;
		if (Number == RandomNumber) {
			out.println("*******");
			out.println("You win.");
			out.println("******");
		} else {
			out.println("You loose!");
			out.println("The Random Number was ");
			out.println(RandomNumber + ".");

			out.println("Thank you for playing!");
			keyboard.close();
		}

	}
}
