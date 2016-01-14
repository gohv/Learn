import static java.lang.System.out;
import java.util.Scanner;
public class GrosseriesForNewYearsEve {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	out.println("Type in the producs, sepparated by comma: ");	
	String groceries = keyboard.nextLine();
	out.println("Your list is below: ");	
	out.println(groceries);	
	}

}
