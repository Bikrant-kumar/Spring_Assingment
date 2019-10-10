package Spring.assignment.Assignment;

import org.springframework.beans.factory.annotation.Autowired;

public class samsung {
	
	@Autowired
	MobileInterface cpu;
	
	public MobileInterface getCpu() {
		return cpu;
	}
	public void setCpu(MobileInterface cpu) {
		this.cpu = cpu;
	}
	public void config() {
		System.out.println("Octa core,4Gb Ram, 12 MP camera ");
		cpu.process();
	}
}
