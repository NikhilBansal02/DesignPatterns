package template;

public abstract class Game {
	

	abstract void start();
	abstract void executing();
	abstract void end();
	
	public final void play() {
		loadAssets();
		start();
		executing();
		end();
	}
	private void loadAssets() {
			System.out.println("Loading Assests...");
	}

}
