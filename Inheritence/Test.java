package Inheritence;

public class Test extends Calculation {

	   public void multiplication(int x, int y) {
		      z = x * y;
		      System.out.println("The product :"+z);
		   }
		   public void division(int x, int y) {
		      z = x / y;
		      System.out.println("The Division :"+z);
		   }
			
		   public static void main(String[] args) {
		      int a = 20, b = 10;
		      Test demo = new Test() ;
		      demo.addition(a, b);
		      demo.subtraction(a, b);
		      demo.multiplication(a, b);
		      demo.division (a, b);
		   }

}
