package lecture_3;

public class Example_3 {
	int max = 100;   //instance variable
    static int var = 50;    // static variable   
  
    public static void main(String[] args) 
   {
        int a = 10, b = 20;      // local variable
        System.out.println(a+b);        
        Example_3 obj = new Example_3();
        System.out.println(obj.max);        
        System.out.println(var);                     
        sum();
    }
    
    public static void sum()
    {        
        Example_3 obj = new Example_3();
        System.out.println(obj.max);        
        System.out.println(var);        
        //System.out.println(a+b);
    }        
}



