package template;

public class TestTemplate {

	public static void main(String[] args) {
		
		Game game = new Football();
		game.play();
		
		System.out.println("=====");
		
		game = new EndlessRunner();
		game.play();
	}
}
