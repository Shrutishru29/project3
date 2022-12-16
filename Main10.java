package Testtommo;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

class Facebook{
	void Send(int a)
	{
		System.out.println("Number"+a);
	}
	void Send(String b)
	{
		System.out.println("Text"+b);

	}
	static void Send(int a,String b)

	{
		System.out.println("Number&&Text"+a+b);
	}
	
	
}
public class Main10 {
public static void main(String b,int a) 
{
	System.out.println("Number&&Text"+b+a);

}
	public static void main(String[] args) {
		Facebook F1=new Facebook();
		F1.Send(10);
		F1.Send("Hi");
		Facebook.Send(10, "hi");
		main("hi",10);

	}

}
