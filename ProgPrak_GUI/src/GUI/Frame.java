package GUI;

import java.awt.CardLayout;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Frame extends JFrame {
	
	private StartPanel startPanel;
	private SpielPanel spielPanel;	
	private Steuerung steuerung;
	private Highscore highscore;
	
	private final String STARTPANEL = "startPanel";
	private final String SPIELPANEL = "spielPanel";
	private final String HIGHSCORE = "highscore";
	private final String STEUERUNG = "steuerung";
    
    //Constructor
	public Frame(int width, int height) {

		setTitle("Game");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new CardLayout());
		
		startPanel = new StartPanel(this);
		spielPanel = new SpielPanel(this);
		steuerung = new Steuerung(this);
		highscore = new Highscore(this);

		this.getContentPane().add(startPanel, STARTPANEL);
		this.getContentPane().add(spielPanel, SPIELPANEL);
		this.getContentPane().add(steuerung, STEUERUNG);
		this.getContentPane().add(highscore, HIGHSCORE);
		pack();
		
		//((CardLayout) this.getContentPane().getLayout()).show(this.getContentPane(), SPIELPANEL);
		//spielPanel.focus();
		((CardLayout) this.getContentPane().getLayout()).show(this.getContentPane(), STARTPANEL);
		startPanel.focus();
		
		/*
		System.out.println("HI  " + this.getContentPane().getHeight());
		System.out.println("WI  " + this.getContentPane().getWidth());*/
		
		this.setVisible(true);
	}


	public void switchToSpielPanel() {
		((CardLayout) this.getContentPane().getLayout()).show(this.getContentPane(), SPIELPANEL);
		spielPanel.focus();
	}

	public void switchToStartPanel() {
		((CardLayout) this.getContentPane().getLayout()).show(this.getContentPane(), STARTPANEL);
		startPanel.focus();
	}
	
	public void switchToSteuerung() {
		((CardLayout) this.getContentPane().getLayout()).show(this.getContentPane(), STEUERUNG);
		steuerung.focus();
	}

	public void switchToHighscore() {
		((CardLayout) this.getContentPane().getLayout()).show(this.getContentPane(), HIGHSCORE);
		highscore.focus();
	}



}
