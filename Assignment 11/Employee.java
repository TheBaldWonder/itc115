// class represents all employees

public class Employee {

	public int getHours() {
		return baseHours;
	}

	public double getSalary() {
		return baseSalary;
	}

	public int getVacationDays() {
		return baseVacationDays;
	}

	public String getVacationForm() {
		return baseVacationForm;

	}

	// Assign rates to general employees
	
	private int baseHours = 40;
	private double baseSalary = 40000.0;
	private int baseVacationDays = 10;
	private String baseVacationForm = "yellow";

	public final void setBaseHours(int hours) {
		baseHours = hours;
	}

	public final void setBaseSalary(double salary) {
		baseSalary = salary;
	}

	public final void setBaseVacationDays(int days) {
		baseVacationDays = days;
	}

	public final void setBaseVacationForm(String form) {
		baseVacationForm = form;
	}
	
	
	public static void main(String[] args) {
		// Display Janitor stats
		Janitor J = new Janitor();
		System.out.println("Janitor hours per week: "+ J.getHours());
		System.out.println("Janitor salary: "+ J.getSalary());
		System.out.println("Janitor vacation days: "+ J.getVacationDays());
		J.clean();
		
		System.out.println();
		
		HarvardLawyer HL = new HarvardLawyer();
		System.out.println("Harvard lawyer hours per week: "+ HL.getHours());
		System.out.println("Harvard lawyer salary: "+ HL.getSalary());
		System.out.println("Harvard lawyer vacation days: "+ HL.getVacationDays());
		System.out.println("Harvard lawyer forms to fill out: "+ HL.getVacationForm());

		
		
	}
	
	
	
}