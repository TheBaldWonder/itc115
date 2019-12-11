// A class to represent lawyers.
public class Lawyer extends Employee {
    public void applyForVacation() {
        System.out.println("Use the pink vacation form.");
    }
    
    public int getVacationDays() {
    	return super.getVacationDays()+ 5;
}
    
    public String getVacationForm() {
        return "pink";
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}