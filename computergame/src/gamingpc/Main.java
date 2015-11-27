package gamingpc;

public class Main {
	public static void main(String[] args) {
		Game game1 = new Game("Minesweeper", 0.5);
		Game game2 = new Game("Eve Online", 2.0);
		Game game3 = new Game("Far Cry", 6.0);
		GraphicsCard gc1 = new GraphicsCard("AMD", 2.0);
		GraphicsCard gc2 = new GraphicsCard("Nvidia", 8.0);
		Computer comp = new Computer(gc1);
		comp.run(game1);
		comp.run(game2);
		comp.run(game3);
		comp.replaceGC(gc2);
		comp.run(game1);
		comp.run(game2);
		comp.run(game3);
		
		System.out.println();
		
		Game game4 = new Game("Thrones", 7.0);
		Computer comp2 = new Computer();
		comp2.run(game4);
		
		System.out.println();
		
		Game game5 = new Game("Half Life 3", 6.0);
		GraphicsCard gc3 = new GraphicsCard("AMD", 3.0);
		GraphicsCard gc4 = new GraphicsCard("Nvidia", 6.0);
		Computer comp3 = new Computer(gc3);
		comp3.run(game5);
		gc3.overclock();
		comp3.run(game5);
		gc3.overclock();
		comp3.run(game5);
		gc3.overclock();
		comp3.run(game5);
		comp3.replaceGC(gc4);
		comp3.run(game5);
	}
}
