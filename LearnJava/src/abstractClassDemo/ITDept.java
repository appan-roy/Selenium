package abstractClassDemo;

public abstract class ITDept implements Employee{

	// unimplemented method
	public abstract void salary();

	// implemented methods
	public void goodies() {
		
		System.out.println("The goodie is laptop bag");
		
	}

	public void work() {
		
		System.out.println("The work is automation testing");
		
	}
	
	
	
}
