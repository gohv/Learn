import java.util.Scanner;
import static java.lang.System.out;

public class Age {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int Age;
		out.print("What is your age? :");
		Age = keyboard.nextInt();

		if (Age == 24) {
			out.println("Good!");
		}
		if (Age > 24) {
			out.println("You dont know your age!");
		}

		if (Age < 24) {
			out.println("Dont make yourself younger!!!");
			keyboard.close();
		}}}
