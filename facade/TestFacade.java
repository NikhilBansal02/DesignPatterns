package facade;

public class TestFacade {

	public static void main(String[] args) {
		
		CPU cpu = new CPU();
		Memory memory = new Memory();
		Task task = new Task();
		
		ComputerFacade computerFacade = new ComputerFacade(cpu,memory,task);
		computerFacade.startProcess();
	}
}
