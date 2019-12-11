// Class for Harvard Lawyer

public class HarvardLawyer extends Lawyer {
	public int getVacationDays() {

		// Harvard lawyers get three days more vacation
 		return super.getVacationDays() + 3; 
		}

		// Fill out more forms for vacation
		public String getVacationForm() {
		String s = super.getVacationForm();
		return s + s + s + s;  
		}

		// 20% more salary than normal lawyer
		public double getSalary() {
		double salary = super.getSalary();
		return 1.2 * salary;  

		}

}