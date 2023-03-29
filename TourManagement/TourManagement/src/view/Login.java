package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends Init {
	private JLabel lbl_title, lbl_forgetPassword, lbl_register;
	private JButton btn_login;
	private JTextField txt_username;
	private JPasswordField txt_password;

	public Login() {
		super("Login");
		super.setSize(800, 500);
		this.gui();
	}

	public void gui() {
		JPanel jp_main = new JPanel();
		jp_main.setLayout(null);

		// logo
		JPanel jp_logo = new JPanel();
		int x, y, height, width;
		x = 20;
		y = 20;
		width = 380;
		height = 460;
		jp_logo.setBounds(x, y, width, height);
		jp_logo.setBackground(new Color(214, 228, 229));
		// Lấy hình
		BufferedImage logo = null;
		try {
			logo = ImageIO.read(new File("images\\logo\\logo.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Set size
		Image img = logo.getScaledInstance(300, 400, Image.SCALE_DEFAULT);
		ImageIcon logoIcon = new ImageIcon(img);
		JLabel logoPic = new JLabel(logoIcon);
		jp_logo.add(logoPic);
		jp_main.add(jp_logo, BorderLayout.WEST);
		this.add(jp_main, BorderLayout.CENTER);

		// Form login
		this.lbl_title = new JLabel("Login");
		this.lbl_title.setFont(new Font("Arial", Font.BOLD, 24));
		this.txt_username = new JTextField("Username");
		this.txt_password = new JPasswordField("Password");
		this.lbl_forgetPassword = new JLabel("Forget password!");
		this.lbl_register = new JLabel("Register");
		this.btn_login = new JButton("Login");
		this.btn_login.setBounds(100, 200, 150, 50);

		JPanel jp_login = new JPanel();
		jp_login.setBounds(x + 380, y, width, height);
		jp_login.setLayout(new BoxLayout(jp_login, BoxLayout.Y_AXIS));
		Box b = Box.createVerticalBox();
		Box b1 = Box.createHorizontalBox();
		Box b2 = Box.createHorizontalBox();
		Box b3 = Box.createHorizontalBox();
		Box b4 = Box.createHorizontalBox();
		Box b5 = Box.createHorizontalBox();

		b1.add(lbl_title);
		b2.add(txt_username);
		b3.add(txt_password);
		b4.add(lbl_forgetPassword);
		b4.add(new JLabel(" / "));
		b4.add(lbl_register);

		JPanel jp_btn_login = new JPanel();
		jp_btn_login.setBackground(new Color(214, 228, 229));
		jp_btn_login.setLayout(new GridLayout(1, 3));
		jp_btn_login.add(btn_login);

		b5.add(jp_btn_login);

		b.add(Box.createVerticalStrut(50));
		b.add(b1);
		b.add(Box.createVerticalStrut(30));
		b.add(b2);
		b.add(Box.createVerticalStrut(10));
		b.add(b3);
		b.add(Box.createVerticalStrut(10));
		b.add(b4);
		b.add(Box.createVerticalStrut(30));
		b.add(b5);
		b.add(Box.createVerticalStrut(50));
		jp_login.add(b);
		jp_login.setBackground(new Color(214, 228, 229));
		jp_main.add(jp_login, BorderLayout.CENTER);
		jp_main.setBackground(new Color(214, 228, 229));

		this.add(jp_main, BorderLayout.CENTER);
	}
}
