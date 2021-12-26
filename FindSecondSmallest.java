package week1.day2;

import java.util.Arrays;

public class FindSecondSmallest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] data = {23,45,67,32,89,22};
		Arrays.sort(data);
		int length = data.length;
		for(int i=0; i<length; i++)
		{
			if(i==1)
			System.out.println(data[i]);
		}
	}
		
}
