public class Employeewage
{
	public static void main(String args[])	
	{
		int isPresent = 1;
		int isAbsent = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		int empRatePerHr=20;
		int empHrs=8;
		int salary;
		if (empCheck == isPresent)
		{	
			salary=empHrs * empRatePerHr;
 			System.out.println("Daily Employee Wage is :"+salary);
			System.out.println("Employee is Present");
		}	
		else
		{
			salary=0;
			System.out.println("Daily Employee Wage is :"+salary);
			System.out.println("Employee is absent");
		}
	}
}	
