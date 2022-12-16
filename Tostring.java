package Testtommo;

public class Tostring {
int a;
String b;
Tostring(int a,String b)
{
this.a=a;
this.b=b;
}
public String toString()
{
	return "this is a string"+this.a+"this is a string b"+this.b;
}
public static void main(String[] args) {
	Tostring S1=new Tostring(10,"hi");
	System.out.println(S1.toString());
}
}
