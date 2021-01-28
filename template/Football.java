package template;

public class Football extends Game{

	@Override
	void start() {
		System.out.println("Football game starting...");
	}

	@Override
	void executing() {
		System.out.println("Football game executing...");
		
	}

	@Override
	void end() {
		System.out.println("Football Game Ending...");
		
	}

}
