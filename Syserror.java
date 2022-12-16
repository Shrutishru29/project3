package Testtommo;

public class Syserror {
static void disp3()
{
	int i=1/0;
}
static void disp2()
{
disp3();
}
static void disp1()
{
disp2();
}

public static void main(String[] args) {
	try
	{
		disp1();
		}
	catch(ArithmeticException e){
		System.out.println("handeled");
		e.printStackTrace();
			}
	
}
}
