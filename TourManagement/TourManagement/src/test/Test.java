package test;

import javax.swing.UIManager;

import view.Init;
import view.Login;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new Login();
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
}
