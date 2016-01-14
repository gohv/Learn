import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

// huge bug !!!! 3rd guess always win! - resolved
// fix Start and Instructions commands!
public class DunkLaureIntoTheTank {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String start;
		String name;
		int number;
		int Guess = 0;
		int random;
		out.println("-------------------------------");
		out.println("!!Welome to the DUNK TANK!!");
		out.println("-------------------------------");
		out.print("Please type the name of the Person you would like to play with: ");
		name = keyboard.next();
		out.println("To see intructions, please type in: Instructions");
		out.println("To Start, please type in: Start");
		out.print("DUNK TANK is expecting your answer: ");
		start = keyboard.next();
		if (start.equalsIgnoreCase("instructions")) {
			out.print("To play the game type in a number from 1 to 5. ");
			out.println("If you select the correct number " + name + " will be sent into the water! ");
			out.println("You have only 3 trows");
			out.print("Type Start to continue: ");
			start = keyboard.next();
		} else if (start.equalsIgnoreCase("start")) {
			boolean isAnswer = false;

			random = new Random().nextInt(5) + 1;
			out.print("Please enter a number from 1 to 5: ");
			number = keyboard.nextInt();
			Guess++;
			while (Guess < 3) {
				if (number == random) {
					isAnswer = true;
					break;
				}

				out.println("Try again..");
				out.print("Please enter a Number from 1 to 5: ");
				number = keyboard.nextInt();
				Guess++;
			}
			if (isAnswer) {
				out.println("!!!!SPLASH!!!!! " + name + " Was sent to the TANK and is now SOAKING WET!!! ");
				out.println("You win after " + Guess + " trows!");
				keyboard.close();
			} else {
				out.println("Better luck next time :(");
				keyboard.close();
			}

		}

	}
}
