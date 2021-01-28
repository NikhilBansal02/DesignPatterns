package facade;

public class ComputerFacade {
	
	private CPU cpu;
	private Memory memory;
	private Task task;
	
	public ComputerFacade(CPU cpu, Memory memory, Task task) {
		super();
		this.cpu = cpu;
		this.memory = memory;
		this.task = task;
	}
	
	public void startProcess() {
		cpu.bootStrap();
		cpu.running();
		memory.allocate();
		task.startTask();
	}
	
	

}
