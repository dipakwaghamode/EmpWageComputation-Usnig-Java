public class Employeewage
{
	public static final int partTime=1;
        public static final int fullTime=2;
   	public static final int empRatePerHr=20;
	public static final int numOfWorkingDays=20;
	public static void main(String args[])	
	{		
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		for (int day=0; day<numOfWorkingDays; day++)
		{
			int empCheck=(int)Math.floor(Math.random() * 10) % 3;
			switch (empCheck)
			{
				case partTime:
			   	   empHrs=4;
			   	   break;
				case fullTime:
			   	   empHrs=8;
			   	   break;
				default: 
			   	   empHrs=0;
			}
			empWage=empHrs * empRatePerHr;
			totalEmpWage = totalEmpWage + empWage;
			System.out.println("Employee wage is :"+empWage);
		}
		System.out.println(" Total Employee wage is :"+totalEmpWage);
	}
}
