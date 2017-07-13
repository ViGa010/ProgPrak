package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class StartPanel extends JPanel implements ActionListener {

	private Frame frame;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton login;
	private JButton register;
	private JLabel labelUsername;
	private JLabel labelPassword;
	private Image backgroundImage;
	

	public StartPanel(Frame frame) {
		super(null);
		
		this.frame = frame;
		
		try {
			backgroundImage = ImageIO.read(new File("img//wood.png"));
			
		} catch (IOException e) {
			System.err.println("Ein Bild konnte nicht geladen werden.");
		}
		
		usernameField = new JTextField();
		passwordField = new JPasswordField();
		login = new JButton("Login");
		register = new JButton("Register");
		labelUsername = new JLabel("Username");
		labelPassword = new JLabel("Password");

		labelUsername.setBounds(311, 200, 70, 25);
		labelPassword.setBounds(311, 230, 70, 25);
		usernameField.setBounds(381, 200, 210, 25);
		passwordField.setBounds(381, 230, 210, 25);
		register.setBounds(381, 260, 100, 25);
		login.setBounds(491, 260, 100, 25);

		add(labelUsername);
		add(labelPassword);
		add(usernameField);
		add(passwordField);
		add(login);
		add(register);

		login.addActionListener(this);
		register.addActionListener(this);

		setPreferredSize(new Dimension(912, 535));

	}

	public String getUsername() {
		return usernameField.getText();
	}

	public char[] getPassword() {
		return passwordField.getPassword();
	}
	
	public void paint(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, this);
		super.paintComponents(g);
	}
 
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == login) {
			
			// send to server
			if (usernameField.getText().equals("user") && Arrays.equals(passwordField.getPassword(), new char[]{'p','a','s','s','w','o','r','d'})) {
				usernameField.setText("");
				passwordField.setText("");
				frame.switchToSpielPanel();
			}
		} else if (e.getSource() == register) {
			// send to server
		}
	}
	
	public void focus() {
		usernameField.requestFocusInWindow();
	}
}
