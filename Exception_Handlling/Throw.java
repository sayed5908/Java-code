package Exception_Handlling;

public class Throw {
	
	static void validate (int age)
    {
        if (age < 18)
        {
            throw new ArithmeticException("Invalid");

        }
    else
        {
            System.out.println("Welcome");

        }
    }

    public static void main(String[] args) {
        validate(19);

        System.out.println("Rest of the code");

    }

}
