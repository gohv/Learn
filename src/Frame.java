import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {
		JFrame MyFrame = new JFrame();
		String MyTitle = "Blank Frame";
		MyFrame.setTitle(MyTitle);
		MyFrame.setSize(300, 200);
		MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyFrame.setVisible(true);

	}

}
