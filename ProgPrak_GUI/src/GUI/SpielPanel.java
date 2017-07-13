package GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import datenstruktur.Spieler;

@SuppressWarnings("serial")
public class SpielPanel extends JPanel {

	private Frame frame;
	private MenuBar menuBar;
	private Chat chat;
	private Information information;
	private Game game;

	private Spieler spieler;
	private int[][] map = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 2, 0, 1, 0}, {0, 4, 0, 1, 0, 0, 5, 1, 1, 1, 1, 1, 1, 0, 1, 0}, {0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0}, {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0}, {0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0}, {0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 3, 0}, {0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0}, {0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0}, {0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0}, {0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0}, {0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

	public SpielPanel(Frame frame) {
		
		this.frame = frame;
		
		setLayout(new BorderLayout());
		setBackground(Color.GRAY);

		spieler = new Spieler("img//spieler.png");
		menuBar = new MenuBar(this);
		game = new Game(this);
		chat = new Chat(this);
		information = new Information(this);

		this.add(menuBar, BorderLayout.NORTH);
		this.add(chat, BorderLayout.WEST);
		this.add(information, BorderLayout.EAST);
		this.add(game, BorderLayout.CENTER);
		
	}

	public void focus() {
		game.requestFocusInWindow();
	}

	public int[][] getMap() {
		return this.map;
	}

	public void setMap(int[][] map) {
		this.map = map;
	}
	
	public void setSpieler(Spieler spieler) {
		this.spieler = spieler;
	}

	public Spieler getSpieler() {
		return this.spieler;
	}

	public Frame getFrame() {
		return this.frame;
	}


}
