package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Init extends JFrame {
	public Init(String title) {
		this.setTitle("SETourist - " + title);
//		this.setSize(1920, 1080);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Set logo
		ImageIcon logo = new ImageIcon("images\\logo\\logo01.png");
		this.setIconImage(logo.getImage());
		
		// Set background
		this.getContentPane().setBackground(new Color(214, 228, 229));

		this.setVisible(true);

	}
}
