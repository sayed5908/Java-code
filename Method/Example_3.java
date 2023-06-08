package Method;

public class Example_3 {
	
		private String id; private String name;
		private double cgpa;
		public void insert_Record (String id, String name, double cgpa) 
		{
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		}
		
		public void display_Record ()
		{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("CGPA: "+cgpa);
		}
		public static void main(String[] args)
		{
		Example_3 st1 = new Example_3();
		st1.insert_Record("152-15-5555", "John", 3.9); 
		st1.display_Record();
		}
		}

