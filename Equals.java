package Testtommo;

public class Equals {
	int a;
	String b;
	Equals(int a,String b)
	{
	this.a=a;
	this.b=b;
	}
	public boolean equals(Object obj)
	{
		Equals S2=(Equals) obj;
	
		return (this.a==S2.a)&&(this.b==S2.b);
	}
	public static void main(String[] args) {
		Equals S1=new Equals(10,"hi");
		Equals S2=new Equals(10,"hi");
		{
		System.out.println(S1.equals(S2));
		}
}
}
