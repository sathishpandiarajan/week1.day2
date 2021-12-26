package week1.day1.assignments;

public class Calculator 
{
	public int add(int num1, int num2) 
	{
		// TODO Auto-generated method stub
		return num1 + num2;

	}
	
	public double sub(double num1, double num2) 
	{
		// TODO Auto-generated method stub
		return num1 - num2;

	}
	
	public double mul(double num1, double num2) 
	{
		// TODO Auto-generated method stub
		return num1 * num2;

	}
	public int div(int num1, int num2) 
	{
		// TODO Auto-generated method stub
		return num1 / num2;

	}
	
	public static void main(String[] args) 
	{
		Calculator calc = new Calculator();
		System.out.println("Addition Result:-" +calc.add(10, 20));
		System.out.println("Subraction Result:-" +calc.sub(100.1d, 20d));
		System.out.println("Subraction Result:-" +calc.mul(100d, 20d));
		System.out.println("Division Result:-" +calc.div(20, 10));
		
	}

}
