import static java.lang.System.out;

public class MyAccount {
	String name;
	String address;
	double balance;

	public void display() {
		out.print(name);
		out.print(" (");
		out.print(address);
		out.print(")has $");
		out.print(balance);

	}

}
