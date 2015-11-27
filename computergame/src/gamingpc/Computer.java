package gamingpc;

public class Computer {
	public GraphicsCard graphcard;
	public boolean shutdown;
	
	public Computer() {
		this.graphcard = null;
	}
	
	public Computer(GraphicsCard gc) {
		this.graphcard = gc;
		this.graphcard.insertedInto(this);
		this.shutdown = false;
		
		System.out.println(String.format("New computer created with %s graphics card!", graphcard.name));
	}
	
	public void replaceGC(GraphicsCard gc) {
		System.out.println(String.format("Replacing %s graphic card with %s graphics card!", graphcard.name, gc.name));
		
		this.graphcard = gc;
		this.graphcard.insertedInto(this);
		this.shutdown = false;
	}
	
	public void run(Game game) {
		if(this.shutdown) {
			System.out.println(String.format("Cannot run %s, computer shut down.", game.name));
		}
		else {
			if (graphcard == null) {
				System.out.println("No graphics card!");
			}
			else {
				double fps = 60 * (graphcard.strength/game.demand);
				
				System.out.println(String.format("Running %s at %3.0f frames per second.", game.name, fps));
			}
		}
	}
	
	public void shutdown() {
		this.shutdown = true;
	}
}
