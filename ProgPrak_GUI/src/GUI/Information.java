package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

@SuppressWarnings("serial")
public class Information extends JPanel {
	
	private SpielPanel spielPanel;
	private Image backgroundImage;
	private JProgressBar progressBar;
	private JLabel name, drink, key;
	
	public Information(SpielPanel spielPanel) {

		this.spielPanel = spielPanel;
		
		setLayout(null);
		setPreferredSize(new Dimension(200, 510));
		
		progressBar = new JProgressBar();
		progressBar.setBounds(10, 40, 150, 25);
		progressBar.setBorder(BorderFactory.createLineBorder(Color.darkGray));
		add(progressBar);
		
		name = new JLabel("Name");
		name.setBounds(50, 10, 50, 25);
		add(name);
		
		drink = new JLabel("0");
		drink.setBounds(50, 90, 30, 25);
		add(drink);
		
		key = new JLabel("0");
		key.setBounds(50, 127, 30, 25);
		add(key);
		
		try {
			backgroundImage = ImageIO.read(new File("img//wood2.png"));
			
		} catch (IOException e) {
			System.err.println("Ein Bild konnte nicht geladen werden.");
		}
	}
	
	public void paint(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, this);
		super.paintComponents(g);
	}
	
	public void setHealth(int n) {
		progressBar.setValue(n);
	}
	
	public void setName(String name) {
		this.name.setText(name);
	}
	
	public void setDrink(int n) {
		this.drink.setText(String.valueOf(n));
	}
	
	public void setKey(int n) {
		this.key.setText(String.valueOf(n));
	}
 

}
