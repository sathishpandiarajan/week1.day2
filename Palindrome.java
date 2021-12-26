package week1.day2;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int temp,sum=0,i,num=34343;
		temp=num;
		while(num > 0)
		{
			i=num%10;
			sum=(sum*10)+i;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Entered number "+temp+" is a palindrome number");
		}
		else
		{
			System.out.println("Entered number "+temp+" is not a palindrome number");
		}
	}

}
