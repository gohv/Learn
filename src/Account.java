import static java.lang.System.out;
public class Account {
	String name;
	String address;
	double balance;

	public static void main(String[] args) {
		
		Account myAccount;
		Account yourAccount;
		myAccount = new Account();
		yourAccount = new Account();
		myAccount.name = "George";
		myAccount.address = "Sofia";
		myAccount.balance = 30.05;
		yourAccount.name = "Pesho";
		yourAccount.address ="Kur";
		yourAccount.balance = 44.44;
		
		out.print(myAccount.name);
		out.print(" (");
		out.print(myAccount.address);
		out.print(")has $ ");
		out.print(myAccount.balance);
		out.println();
		out.print(yourAccount.name);
		out.print(" (");
		out.print(yourAccount.address);
		out.print(")has $ ");
		out.print(yourAccount.balance);
	}
}
