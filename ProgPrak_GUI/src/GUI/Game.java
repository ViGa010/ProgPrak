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
public class Game extends JPanel implements KeyListener, MouseListener {
	
	private SpielPanel spielPanel;
	private Image boden, wand, tuerOffen, tuerZu, schluessel, monster,heiltrank, feuerball;

	public Game(SpielPanel spielPanel) {
		
		try {
			boden = ImageIO.read(new File("img//boden.png"));
			wand = ImageIO.read(new File("img//wand.png"));
			tuerZu = ImageIO.read(new File("img//tuer.png"));
			tuerOffen = ImageIO.read(new File("img//tueroffen.png"));
			schluessel = ImageIO.read(new File("img//schluessel.png"));
			heiltrank = ImageIO.read(new File("img//heiltrank.png"));
			feuerball = ImageIO.read(new File("img//feuerball.png"));
			monster = ImageIO.read(new File("img//drache1.png"));
		} catch (IOException e) {
			System.err.println("Ein Bild konnte nicht geladen werden.");
		}
		
		this.spielPanel = spielPanel;
		setPreferredSize(new Dimension(512,512));	
		addMouseListener(this);
		addKeyListener(this);
	
	}


	public void paint(Graphics g) {
		
		// Draw map
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 16; j++) {
				if(spielPanel.getMap()[i][j] == 0) {
					g.drawImage(wand, j*32, i*32, null);
				} else if (spielPanel.getMap()[i][j] == 0) {
					g.drawImage(wand, j*32, i*32, null);
				} else if (spielPanel.getMap()[i][j] == 1) {
					g.drawImage(boden, j*32, i*32, null);
				} else if (spielPanel.getMap()[i][j] == 2) {
					g.drawImage(boden, j*32, i*32, null);
					g.drawImage(schluessel, j*32, i*32, null);
				} else if (spielPanel.getMap()[i][j] == 3) {
					g.drawImage(tuerZu, j*32, i*32, null);
				} else if (spielPanel.getMap()[i][j] == 4) {
					g.drawImage(tuerOffen, j*32, i*32, null);
				} else if (spielPanel.getMap()[i][j] == 5) {
					g.drawImage(boden, j*32, i*32, null);
					g.drawImage(monster, j*32, i*32, null);
				} 
			}
		}
		
		// Draw player
		g.drawImage(spielPanel.getSpieler().getImage(), spielPanel.getSpieler().getxPos() * 32, spielPanel.getSpieler().getyPos() * 32, null);		
	}




	// MouseEvents
	@Override
	public void mouseClicked(MouseEvent e) {
		this.requestFocus();	
	}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {		
		this.requestFocus();
	}
	@Override
	public void mouseReleased(MouseEvent e) {}



	//KeyEvents
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			if (spielPanel.getSpieler().getyPos() > 0)
				spielPanel.getSpieler().hoch();
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			if (spielPanel.getSpieler().getyPos() < 15)
				spielPanel.getSpieler().runter();
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (spielPanel.getSpieler().getxPos() < 15)
				spielPanel.getSpieler().rechts();
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (spielPanel.getSpieler().getxPos() > 0)
				spielPanel.getSpieler().links();
		}
		
		this.repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}




	
}
