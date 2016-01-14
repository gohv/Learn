import static java.lang.System.out;
import java.util.Scanner;

public class SwitchOperator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		out.print("Which verse?");
		int verse = keyboard.nextInt();
		switch (verse) {
		case 1:
			out.println("Ebasimo u picha");
			break;
		case 2:
			out.println("Ebegikus");
			break;
		case 3:
			out.println("are stiga tolko");
		break;
		default:
			out.println("KUR");
		}
out.println("Kacame");
keyboard.close();
	}

}
