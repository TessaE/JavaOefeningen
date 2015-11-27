package objects;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Window extends JFrame{
	private List<RectPanel> rectangles;
	private List<ButtonPanel> buttons;
	
	public Window () {		
		super();
		super.setTitle("Callbacks");
		super.setSize(new Dimension(420 , 350));
		// Make sure the window appears in the middle of your screen
		super.setLocationRelativeTo(null);
		// Determines what should happen when the frame is closed
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Chooses a certain layout type for the elements in this frame
		super.getContentPane().setLayout(new BorderLayout());
		
		rectangles = new ArrayList<>();
		buttons = new ArrayList<>();
		
		//TODO: add elements to the content pane
		RectPanel rp = new RectPanel();
		rectangles.add(rp);
		
		ButtonPanel bp = new ButtonPanel(this);
		buttons.add(bp);
		// Places the RectPanel in the center of the frame
		super.getContentPane().add(rp, BorderLayout.CENTER);
		// Places the ButtonPanel in the top of the frame
		super.getContentPane().add(bp, BorderLayout.NORTH);
		
		super.setVisible(true);
	}
	
	public List<RectPanel> getRectangles() {
		return rectangles;
	}
}
