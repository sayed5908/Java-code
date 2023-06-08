package Assignment;

public class Test {
	public static void main(String[] args) {
		
		Employee em = new Employee(101, "Kabil", 20000);
		Professor pof = new Professor(102, "Hamim", 40000, "CSE");
		Administrator admin = new Administrator(103, "Navid", 50000, "Finance");
		SupportStuff stuff = new SupportStuff(104, "Rana", 15000, "Receptionist");
		
		System.out.println (em.toString());
		System.out.println (pof.toString());
		System.out.println (admin.toString());
		System.out.println (stuff.toString());
		
		Employee[]employees = {em, pof, admin, stuff};
		double totalsalary = Employee.totalsalary(employees);
		System.out.println("Total salary : "+totalsalary);	
	}
}
