package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Chat extends JPanel implements ActionListener {

	private SpielPanel spielPanel;
	private JScrollPane scrollTextFieldChat;
	private JScrollPane scrollTextFieldInput;
	private JButton button;

	public Chat(SpielPanel spielPanel) {

		this.spielPanel = spielPanel;
		
		setLayout(null);
		setBorder(BorderFactory.createLineBorder(Color.darkGray));

		JTextArea outputArea = new JTextArea();
		outputArea.setEditable(false);
		scrollTextFieldChat = new JScrollPane(outputArea);
		scrollTextFieldChat.setBorder(BorderFactory.createLineBorder(Color.darkGray));
		scrollTextFieldChat.setBounds(1, 1, 198, 400);

		JTextArea inputArea = new JTextArea();
		inputArea.setLineWrap(true);
		scrollTextFieldInput = new JScrollPane(inputArea);
		scrollTextFieldInput.setBorder(BorderFactory.createLineBorder(Color.darkGray));
		scrollTextFieldInput.setBounds(1, 401, 198, 85);

		button = new JButton("Send");
		button.setBorder(BorderFactory.createLineBorder(Color.darkGray));
		button.setBounds(1, 486, 198, 25);
		button.addActionListener(this);

		add(scrollTextFieldChat);
		add(scrollTextFieldInput);
		add(button);

		setPreferredSize(new Dimension(200, 510));

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// send

	}

}
