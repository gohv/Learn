
public class userAccount {

	public static void main(String[] args) {
		MyAccount myAccount = new MyAccount();
		MyAccount yourAccount = new MyAccount();
		myAccount.name = "George Hristov";
		myAccount.address = "Sofia, Krasna Polyana";
		myAccount.balance = 45.05;
		yourAccount.name = "Laure Bonnefoi";
		yourAccount.address = "Sofia";
		yourAccount.balance = 50.50;
		myAccount.display();
		System.out.println();
		yourAccount.display();

	}

}
