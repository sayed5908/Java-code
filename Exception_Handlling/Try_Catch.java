package Exception_Handlling;

public class Try_Catch {
	public static void main(String[] args) {
        int x = 10;
        int y = 0;

        try
        {
            System.out.println("Hello");
            int z = x / y;
            System.out.println("World");
        }

        catch (ArithmeticException e )
        {
            System.out.println("Arithmetic Exception");
        }

        finally
        {
            System.out.println("This is inside finally block");
        }

        System.out.println("End of the code");
    }

}
