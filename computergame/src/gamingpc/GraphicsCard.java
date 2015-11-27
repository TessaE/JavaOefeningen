package gamingpc;

public class GraphicsCard {
	public String name;
	public double startStrength;
	public double strength;
	public Computer comp;
	
	public GraphicsCard(String name , double strength) {
		this.name = name;
		this.strength = strength;
		this.startStrength = strength;
	}
	
	public void insertedInto(Computer comp) {
		this.comp = comp;
	}
	
	public void overclock() {
		this.strength++;
		
		if(this.strength >= (this.startStrength * 2)) {
			this.comp.shutdown();
			System.out.println("Overclocking graphics card - card overheated, computer shutting down!");
		}
		else {
			System.out.println("Overclocking graphics card!");
		}
	}
}
