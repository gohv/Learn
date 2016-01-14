import static java.lang.System.out;
import java.util.Scanner;

public class LoopsExample {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int count = 1;
		// int test = 30; testing!
		
		out.print("Enter a Random Two Digit Number: ");
		count = keyboard.nextInt();
		while (count < 20) {

			out.println(count);
			count++;
		}
		while (count > 20) {
			out.println(count);
			count--;
		}
		keyboard.close();
	}

}
