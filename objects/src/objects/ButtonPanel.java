package objects;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	Window window;
	
	public ButtonPanel(Window window) {
		super();
		
		this.window = window;
		
		JButton b = new JButton("Change color!");
		this.add(b);
		b.addActionListener(new ButtonHandler(window));
	}
}
