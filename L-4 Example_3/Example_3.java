package Example_3;

public class Example_3 {

	private String name;
    private int id;
    private double cgpa;    
    
    public static void main(String[] args)
    {        
        Example_3 std1 = new Example_3();        
        std1.name = "Abdullah";
        std1.id = 100;
        std1.cgpa = 3.5;
        
        System.out.println("Name of Student -1 : "+std1.name);
        System.out.println("ID of Student - 1 : "+std1.id);
        System.out.println("CGPA of Student - 1: "+std1.cgpa);
        
        Example_3 std2 = new Example_3();
        std2.name = "Kabir";
        std2.id = 200;
        std2.cgpa = 3.8;
        
         System.out.println("\n\nName of Student -1 : "+std2.name);
        System.out.println("ID of Student - 1 : "+std2.id);
        System.out.println("CGPA of Student - 1: "+std2.cgpa);

    }
}
