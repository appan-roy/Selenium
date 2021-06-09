package abstractClassDemo;

public abstract class ITDept implements Employee {

	String EmployeeName = "Peter";
	static String ManagerName = "John";
	public static String EmployerName = "TCS";
	public static final String ProjectName = "SCOTT";

	// implemented interface methods
	public void basic_salary() {
		System.out.println("Basic salary is 7k");
	}

	public void house_rent_allowance() {
		System.out.println("House rent allowance is 5k");
	}

	// keeping interface methods abstract
	public abstract void city_allowance();
	public abstract void dearness_allowance();

	// abstract methods of abstract class
	abstract void epf();
	public abstract void eps();
	
	// concrete method without static
	public void misc_allowance() {
		System.out.println("Misc allowance is 2k");
	}

	// concrete method with static
	public static void bonus() {
		System.out.println("Bonus is 1k");
	}

}
