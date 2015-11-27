package objects;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class RectPanel extends JPanel {
	private Color color;
	
	public RectPanel() {
		super();
		this.color = Color.BLACK;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(this.color);
		g.fillRect(100, 30, 200, 200);
	}
	
	public void setColor(Color color) {
		this.color = color;
		repaint();
	}
}
