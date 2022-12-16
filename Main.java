package Testtommo;

class Instagraam
{
void disp()
{
System.out.println("photos");	
}	
}
class Instagraam_1 extends Instagraam
{
	void disp()
	{
	System.out.println("photos& vieos");
	super.disp();
	}
}
public class Main {
public static void main(String[] args) {
	Instagraam_1 I1=new Instagraam_1();
	I1.disp();
}
}
