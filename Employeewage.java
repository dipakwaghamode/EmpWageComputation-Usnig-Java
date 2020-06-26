public class Employeewage
{
	public static void main(String args[])	
	{
		System.out.println("Welcome to EmpWageComputation");
		int isPresent = 1;
		int isAbsent = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == isPresent)
		{	
			 System.out.println("Employee is Present");
		}	
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
