package loan;

public class Math {
	
	static double result=1;
	static double power(float r, int n)
	{
		for(;n!=0; --n)
			result*=r;
		return result;
	}
}
