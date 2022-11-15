//to check 2552 is palindrome

package assignment4;

public class Assignment4_3 {

	public static void main(String[] args) {
		
		String s1="2552";
		String s2="";
		
		for(int i=s1.length()-1; i>=0; --i)
		{
			s2= s2 + s1.charAt(i);
		}
		
		
		boolean b=false;
		for(int i=0; i<s1.length(); i++)
		{
			for(int j=0; j<s2.length(); ++j)
			{
				if(s1.charAt(i)==s2.charAt(j) && i==j)
					b=true;
				else
					b=false;
			}
		}
		
		if(b==true)
			System.out.println("The given String is an Palindrome");
		else
			System.out.println("The given String is not an Palindrome");
	}

}
