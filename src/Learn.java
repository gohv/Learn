import static java.lang.System.out;
public class Learn {

	public static void main(String[] args) {
		double total = 2.48;
		double quarters = total / 25;
		double whatsleft = total % 25;
		double dimes = whatsleft / 10;
		whatsleft = whatsleft % 10;
		double nickels = whatsleft / 5;
		whatsleft = whatsleft % 5;
		double cents = whatsleft;
		
		out.println	("From " + total + " cents you get ");
		out.println	(quarters + " quaters");
		out.println	(dimes + " dimes");
		out.println	(nickels + " nickels");
			out.println	(cents + " cents");
	}
	
	
	}


