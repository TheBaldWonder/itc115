  
// Janitor class that interacts with Employee superclass
public class Janitor extends Employee {

	public Janitor()
	{
		//Janitor works twice as much, has lower salary, and less vacation days
		super();
		setBaseHours(80);
		setBaseSalary(30000);
		setBaseVacationDays(5);
	}
	
	public void clean() {
		System.out.println("Workin' for the man.");
	}
	
	
	
	public static void main(String[] args) {
		// Display Janitor stats
		Janitor J = new Janitor();
		System.out.println("Janitor hours per week: "+ J.getHours());
		System.out.println("Janitor salary: "+ J.getSalary());
		System.out.println("Janitor vacation days: "+ J.getVacationDays());
		J.clean();
		
		
	}

}