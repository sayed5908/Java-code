package Assignment;

public class Administrator extends Employee{
	public String department;
	
	public Administrator(int employeeID, String name, double salary, String department) {
		
		super (employeeID, name, salary);
		this.department = department;
	}
	
	public String tostring() {
		return super.toString()+ "\n department:" +department;
		
	}

}
