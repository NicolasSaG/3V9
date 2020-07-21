package semanaOOP;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		do {
			try {
				Menu mn = new Menu();
				mn.llamarMenu();
				break;
			} catch (NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "Adios ?");
				System.exit(0);
			}
		} while (true);
	}
}
