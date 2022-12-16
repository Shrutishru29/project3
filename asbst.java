package Testtommo;

interface Car{
	void vehicle();
}
class Gear implements Car
{
	public void vehicle()
	{
		System.out.println("Hi i am gear");
	}
}
class Staring implements Car
{
	public void vehicle()
	{
		System.out.println("Hi i am Staring");
	}
}
class Break implements Car
{
	public void vehicle()
	{
		System.out.println("Hi i am Break");
	}
}
class Stimulator
{
static void veh(Car C1)
{
	C1.vehicle();
}
}
public class asbst {
public static void main(String[] args) {
	Break B1=new Break();
	Staring S1=new Staring();
	Gear G1=new Gear();
	Stimulator.veh(B1);
	Stimulator.veh(S1);
	Stimulator.veh(G1);

}
}
