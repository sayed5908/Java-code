package Assignment;

public class Professor extends Employee {
	private String subjectOfExpertise;
	
	public Professor(int employeeID, String name, double salary, String subjectOfExperrtise) {
		super(employeeID, name, salary);
		this.subjectOfExpertise = subjectOfExperrtise;
	}
	
	public String getsubjectOfExpertise()
	{
		return subjectOfExpertise;
	}
	
	public String toString() {
		return super.toString() +"\nsubjectOdExpertise: " +subjectOfExpertise;
	}
	
}
