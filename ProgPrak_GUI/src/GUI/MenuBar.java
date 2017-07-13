package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MenuBar extends JMenuBar implements ActionListener {

	private SpielPanel spielPanel;

	private JMenu spiel;
	private JMenu anzeige;
	private JMenu hilfe;

	private JMenuItem accountLoeschen;
	private JMenuItem logout;
	private JMenuItem highscore;
	private JMenuItem beenden;
	private JMenuItem steuerung;

	public MenuBar(SpielPanel spielPanel) {

		this.spielPanel = spielPanel;

		spiel = new JMenu("Spiel");
		anzeige = new JMenu("Anzeige");
		hilfe = new JMenu("Hilfe");

		accountLoeschen = new JMenuItem("Account loeschen");
		logout = new JMenuItem("Logout");
		highscore = new JMenuItem("Highscore anzeigen");
		beenden = new JMenuItem("Beenden");
		steuerung = new JMenuItem("Steuerung");

		accountLoeschen.addActionListener(this);
		highscore.addActionListener(this);
		logout.addActionListener(this);
		beenden.addActionListener(this);
		steuerung.addActionListener(this);
		hilfe.addActionListener(this);

		spiel.add(accountLoeschen);
		spiel.add(logout);
		spiel.add(beenden);
		anzeige.add(highscore);
		hilfe.add(steuerung);

		add(spiel);
		add(anzeige);
		add(hilfe);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == accountLoeschen) {
			// send delet account message
		} else if (e.getSource() == highscore) {
			// request highscore from server
			spielPanel.getFrame().switchToHighscore();
		} else if (e.getSource() == logout) {
			// send logout to server
			spielPanel.getFrame().switchToStartPanel();
		} else if (e.getSource() == beenden) {
			// send logout to server
			System.exit(0);
			} else if (e.getSource() == steuerung) {
			spielPanel.getFrame().switchToSteuerung();
		}

	}


}
