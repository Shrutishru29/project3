package Testtommo;

public class Null {
public static void main(String[] args) {
	Null N1=null;

	try{
		System.out.println(N1.hashCode());

		}
	catch(NullPointerException e)
	{
		System.out.println("handeled");
	}
}
}
