package GUI;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import datenstruktur.Spieler;

public class InputKeyEvents extends KeyAdapter {
	
	private Spieler spieler;
	
	public InputKeyEvents(Spieler spieler) {
	}
	

	public void keyPressed(KeyEvent e) {
		
		switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				spieler.hoch();
				break;
			case KeyEvent.VK_DOWN:
				spieler.runter();
				break;
			case KeyEvent.VK_LEFT:
				spieler.links();
				break;
			case KeyEvent.VK_RIGHT:
				spieler.rechts();
				break;
		}	
	}


	public Spieler getSpieler() {
		return spieler;
	}
	
}
