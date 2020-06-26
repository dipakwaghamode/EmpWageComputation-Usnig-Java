public class Employeewage
{
	public static final int partTime=1;
        public static final int fullTime=2;
   	public static final int empRatePerHr=20;
	public static final int numOfWorkingDays=20;
	public static final int maxHrsInMonth=10;

	public static int getEmployeewage()	
	{		
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		while (totalEmpHrs<=maxHrsInMonth && totalWorkingDays<numOfWorkingDays)
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
			totalWorkingDays+=1;
			totalEmpHrs = totalEmpHrs + empHrs;
			System.out.println("Day=:"+totalWorkingDays+"Emp Hrs is= : "+empHrs);
		}
		int totalEmpWage = totalEmpHrs*empRatePerHr;
		System.out.println(" The Total Employee wage is= :"+totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String args[])
	{
		getEmployeewage();
	}		

}
