package Loop;

public class Demo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 && i!=1 && i!=2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}			  
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==j || j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}			  
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 && j<=n || i==n-1 && j<=n || i==(n-1)/2 && j<=n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}			  
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if(j==n-1 && i!=n-1 || j==0 && i!=n-1 || i==n-1 && j!=0 && j<n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}			  
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 && j<n-1 || i==(n-1)/2 && j<n-1 || j==n-1 && i<(n-1)/2 && i>=1 || i-j==(n-1)/2 || i==n-1 && j>=n/2 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}			  
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if(j==n-1 && i<n-1 && i>=1 || j==0 && i<n-1 && i>=1||i==n-1 && j!=0 && j<n-1 || i==0 && j!=0 && j<n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}			  
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==j || j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}			  
			}
			System.out.print("  ");
			System.out.print("  ");
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==j || j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}			  
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || j==n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}			  
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 && j<n-1 || i==(n-1)/2 && j<n-1 || j==n-1 && i<(n-1)/2 && i>=1 || i-j==(n-1)/2 || i==n-1 && j>=n/2 )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}			  
			}
			System.out.print("  ");
			for(int j=1;j<=n;j++)
			{
				if(j==1 && i!=0 && i>0 || i==n/2 && j<=n || i==0 && j<n && j>1 || j==n && i>0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==j || j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}			  
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==n/2 && i<n-1 || i==n-1 && j<n/2 && j!=n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}			  
			}
			System.out.print("  ");
			for(int j=1;j<=n;j++)
			{
				if(j==1 && i!=0 && i>0 || i==n/2 && j<=n || i==0 && j<n && j>1 || j==n && i>0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==j || j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}			  
			}
			System.out.print("  ");
			for(int j=1;j<=n;j++)
			{
				if(j==1 && i!=0 && i>0 || i==n/2 && j<=n || i==0 && j<n && j>1 || j==n && i>0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			System.out.println();
		}

	}

}
