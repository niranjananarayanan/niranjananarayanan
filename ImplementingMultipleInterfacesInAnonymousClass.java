//Multiple Interfaces implemented via anonymous inner class
interface I_Sample1
{
	void show1();
}

@FunctionalInterface
interface I_Sample2
{
	void show2();
}

@FunctionalInterface
interface I_Sample3
{
	void show3();
}

@FunctionalInterface
interface I_Sample4
{
	void show4();
}

		

public class ImplementingMultipleInterfacesInAnonymousClass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		I_Sample1 sample1= new I_Sample1() 
		{
			public void show1()
			{
				System.out.println("in I_Sample1 Show1");
			}
		};
	I_Sample2 sample2= new I_Sample2()
		{
			public void show2()
			{
				System.out.println("in I_Sample2 Show2");
			}
		};
	I_Sample3 sample3= new I_Sample3() 
		{
			public void show3()
			{
				System.out.println("in I_Sample3 Show3");
			}
		};	
	I_Sample4 sample4= new I_Sample4()
		{
			public void show4()
			{
				System.out.println("in I_Sample4 Show4");
			}
		};
	
	sample1.show1();
	sample2.show2();
	sample3.show3();
	sample4.show4();

	}

}
