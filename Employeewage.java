public class Employeewage
{
	public static final int partTime=1;
        public static final int fullTime=2;
   
	public static void main(String args[])	
	{
		
		int empRatePerHr=20;		
		int empHrs=0;
		int empWage=0;
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
		System.out.println("Employee wage is :"+empWage);
	}
}
