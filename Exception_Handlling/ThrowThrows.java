package Exception_Handlling;

	
	import java.io.IOException;

	public class ThrowThrows
	{
	    public void method() throws IOException
	    {
	        System.out.println("Hello");
	        throw new IOException("Not valid");
	    }
	    public static void main(String[] args)
	    {
	        ThrowThrows m = new ThrowThrows();

	       try
	       {
	           m.method();
	       }
	       catch (IOException e)
	       {
	           System.out.println("IO Exception found");
	       }

	        System.out.println("End of the code");

	    }

}
