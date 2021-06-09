package abstractClassDemo;

public interface Employee {

	// by default all fields are public, static & final
	int EmpId = 111111;

	// public, static & final still can be written
	public static final int ProjectId = 12345678;

	// abstract methods without abstract
	void basic_salary();
	public void house_rent_allowance();

	// abstract methods with abstract
	abstract void city_allowance();
	public abstract void dearness_allowance();

	// concrete methods with static
	static void food_allowance() {
		System.out.println("Food allowance is 2k");
	}
	
	public static void travel_allowance() {
		System.out.println("Travel allowance is 3k");
	}

}
