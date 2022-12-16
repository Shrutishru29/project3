package Testtommo;

public class Finallyyy {
public static void main(String[] args) {
	try
	{
		int a=1/0;
	}
	catch (ArithmeticException e)
	{
		System.out.println("Hi i am Arithmetic exception");	

	}
finally
{
System.out.println("Hi i am fianllly");	
}
}
}
