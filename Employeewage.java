public class Employeewage
{
	public static void main(String args[])	
	{
		int partTime=1;
		int fullTime=2;
		int empRatePerHr=20;
		int empHrs=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random() * 10) % 3;
		if (empCheck == partTime)
			empHrs=4;
		else if (empCheck == fullTime)
			empHrs=8;
		else
			empHrs=0;
		empWage=empHrs * empRatePerHr;
		System.out.println("Employee wage is :"+empWage);
	}
}
