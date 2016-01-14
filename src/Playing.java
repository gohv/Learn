import java.util.*;

public class Playing {

	public static void main(String[] args) {
		
		try {
			Scanner Year = new Scanner(System.in);
			System.out.print("Please enter your birth YEAR: ");
			String Year2 = Year.next();

			System.out.print("Please enter you month of birth: ");
			String Month3 = Year.next();

			System.out.println(" ");
			System.out.println("You were born during: " + Year2);
			System.out.println("Month of Birth: " + Month3);
			Year.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
