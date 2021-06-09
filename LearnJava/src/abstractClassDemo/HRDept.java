package abstractClassDemo;

public class HRDept extends ITDept {

	public static void main(String args[]) {
		
		// static access of interface
		System.out.println(Employee.EmpId);
		System.out.println(Employee.ProjectId);
		
		// static access of abstract class
		System.out.println(ITDept.ManagerName);
		System.out.println(ITDept.EmployerName);
		System.out.println(ITDept.ProjectName);
		ITDept.bonus();
		
		// Scenario 1 - Child class reference with Child class object
		
		HRDept hr = new HRDept();
		
		System.out.println(hr.EmployeeName);
		
		hr.basic_salary();
		hr.house_rent_allowance();
		hr.misc_allowance();
		
		hr.goodies();
		hr.city_allowance();
		hr.dearness_allowance();
		hr.epf();
		hr.eps();
		
		//Scenario 2 - Parent class reference with Child class object
		
		ITDept it = new HRDept();

		System.out.println(it.EmployeeName);
		
		it.basic_salary();
		it.house_rent_allowance();
		it.misc_allowance();

		it.city_allowance();
		it.dearness_allowance();
		it.epf();
		it.eps();
		
	}

	// this class methods
	public void goodies() {
		System.out.println("Goodies are laptop bag");
	}

	@Override
	public void city_allowance() {
		System.out.println("City allowance is 1.5k");
	}

	@Override
	public void dearness_allowance() {
		System.out.println("Dearness allowance is 2.5k");
	}

	@Override
	void epf() {
		System.out.println("EPF is 2k");
	}

	@Override
	public void eps() {
		System.out.println("EPS is 1k");
	}
	
}
