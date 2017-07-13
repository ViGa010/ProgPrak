package GUI;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Highscore extends JPanel implements KeyListener, MouseListener {

	private Frame frame;
	private Image backgroundImage;
	private JLabel label1, label2, label3, label4, label5, label6, label7;
	
	public Highscore(Frame frame) {	
		super(null);
		this.frame = frame;
		
		label1 = new JLabel("1. ");
		label1.setFont(new Font(label1.getFont().getName(), Font.PLAIN, 32));
		label1.setBounds(10, 0, 300, 300);
		add(label1);
		
		label2 = new JLabel("2. ");
		label2.setFont(new Font(label2.getFont().getName(), Font.PLAIN, 32));
		label2.setBounds(10, 50, 300, 300);
		add(label2);
		
		label3 = new JLabel("3. ");
		label3.setFont(new Font(label3.getFont().getName(), Font.PLAIN, 32));
		label3.setBounds(10, 100, 300, 300);
		add(label3);
		
		label4 = new JLabel("4. ");
		label4.setFont(new Font(label4.getFont().getName(), Font.PLAIN, 32));
		label4.setBounds(10, 150, 300, 300);
		add(label4);
		
		label5 = new JLabel("5. ");
		label5.setFont(new Font(label5.getFont().getName(), Font.PLAIN, 32));
		label5.setBounds(10, 200, 300, 300);
		add(label5);
		
		label6 = new JLabel("6. ");
		label6.setFont(new Font(label6.getFont().getName(), Font.PLAIN, 32));
		label6.setBounds(10, 250, 300, 300);
		add(label6);
		
		label7 = new JLabel("7. ");
		label7.setFont(new Font(label7.getFont().getName(), Font.PLAIN, 32));
		label7.setBounds(10, 300, 300, 300);
		add(label7);
		
		addMouseListener(this);
		addKeyListener(this);
		
		setPreferredSize(new Dimension(912, 535));
		
		try {
			backgroundImage = ImageIO.read(new File("img//water.png"));
			
		} catch (IOException e) {
			System.err.println("Ein Bild konnte nicht geladen werden.");
		}
	}
	
	public void focus() {
		this.requestFocusInWindow();
	}	
	
	public void paint(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, this);
		super.paintComponents(g);
	}
	
	public void updateLabel(String s, int i) {
		switch(i) {
		case 1:
			label1.setText("1. " + s);
			break;
		case 2:
			label2.setText("1. " + s);
			break;
		case 3:
			label3.setText("1. " + s);
			break;
		case 4:
			label4.setText("1. " + s);
			break;
		case 5:
			label5.setText("1. " + s);
			break;
		case 6:
			label6.setText("1. " + s);
			break;
		case 7:
			label7.setText("1. " + s);
			break;
		}
	}


	// Mouse Events
	@Override
	public void mouseClicked(MouseEvent arg0) {this.requestFocus();	}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {
		focus();		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {}

	
	// Key Events
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
			frame.switchToSpielPanel();	
	}
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}


}
