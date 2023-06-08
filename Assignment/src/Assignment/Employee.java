package Assignment;

public class Employee {

	private int employeeID;
	private String name;
	private double salary;
	
	public Employee(int employeeID, String name, double salary) {
		this.employeeID = employeeID;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmloyeeID() {
		return employeeID;
	}
	
	public String getName() {
		return name;
	}
		public double getsalary() {
			return salary;
	}
		public String toString() {
			return "EmployeeID: "+employeeID+"\nName: "+name+"\nsalary: "+salary;
			
		}
		public static double totalsalary(Employee[] employees) {
			double totalsalary = 0;
			for(Employee employee : employees) {
				totalsalary+= employee.getsalary();
			}
			return totalsalary;
		}
	 }



