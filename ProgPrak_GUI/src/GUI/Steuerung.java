package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Steuerung extends JPanel implements KeyListener, MouseListener {

	private Frame frame;
	private Image backgroundImage;
	
	public Steuerung(Frame frame) {	
		super(null);
		this.frame = frame;
		
		addMouseListener(this);
		addKeyListener(this);
		
		setPreferredSize(new Dimension(912, 535));
		
		try {
			backgroundImage = ImageIO.read(new File("img//bamboo.png"));
			
		} catch (IOException e) {
			System.err.println("Ein Bild konnte nicht geladen werden.");
		}
	}
	
	public void focus() {
		this.requestFocusInWindow();
	}	
	
	public void paint(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, this);
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
