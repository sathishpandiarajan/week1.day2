package week1.day2;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int input = 13, i, m=0, flag=0;
		m = input/2;
		if (input==0 || input==1) 
		{
			System.out.println("Entered Number "  +input+ " is not a prime number");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(input%i == 0)
				{
					System.out.println("Entered Number " +input+ " is not a prime number");
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println("Entered Number " +input+ " is a prime number");
			}
		}
	}
}
