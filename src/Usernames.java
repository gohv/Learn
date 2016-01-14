import javax.swing.JOptionPane;

public class Usernames {

	public static void main(String[] args) {
		String username = JOptionPane.showInputDialog("Username");
		String password = JOptionPane.showInputDialog("Password");
		if (username != null &&
			password != null &&
			(
			(username.equals("gohv")&&
			password.equals("applet")) ||
			(username.equals("george"))&&
			password.equals("aplet"))
			)
{
JOptionPane.showMessageDialog(null, "Welcome!");
}
else {
	JOptionPane.showMessageDialog(null, "Dont Try to Break in!!!");
}
					
	

	}

}
