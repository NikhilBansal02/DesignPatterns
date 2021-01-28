package template;

public class EndlessRunner extends Game{
	
	@Override
	void start() {
		System.out.println("EndlessRunner game starting...");
	}

	@Override
	void executing() {
		System.out.println("EndlessRunner game executing...");
		
	}

	@Override
	void end() {
		System.out.println("EndlessRunner Game Ending...");
		
	}

}
