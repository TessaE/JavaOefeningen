package objects;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;

public class ButtonHandler implements ActionListener {
	Random rnd;
	Window w;
	
	public ButtonHandler(Window window) {
		this.w = window;
	}
	
	public void actionPerformed(ActionEvent e) {
		changeRectColor();
	}
	
	private void changeRectColor() {
		List<RectPanel> rects = w.getRectangles();

		for (int i = 0; i < rects.size(); i++) {
		    RectPanel r = rects.get(i);
		    r.setColor(randomColor());
		}
	}
	
	private Color randomColor() {
		rnd = new Random();
		float r = rnd.nextFloat();
		float g = rnd.nextFloat();
		float b = rnd.nextFloat();
		Color rndColor = new Color(r, g, b);
		
		return rndColor;
	}
}
