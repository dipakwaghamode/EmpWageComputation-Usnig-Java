import java.util.*;

public class Employeewage implements Computewages
{
        public static final int isPart = 0, isFull = 1;
        int numOfCompany = 0;

        LinkedList<CompanyWage> companyWageList;
	Map<String,CompanyWage> companyWageMap;
        public Employeewage()
        {
                companyWageList = new LinkedList<>();
		companyWageMap = new HashMap<>();
        }

        public static void main(String[] args)
        {

                System.out.println("Welcome to Employee Wage Computation Program");


                Computewages empWage = new Employeewage();
		Employeewage emp = new Employeewage();

		int IdeaEmpRate = 10, IdeaFullDayHr = 8;
		int AirtelEmpRate = 20, AirtelFullDayHr = 8;

		empWage.addCompanyWage("Idea", IdeaEmpRate, 30, 120);
                empWage.addCompanyWage("Airtel", AirtelEmpRate, 20, 120);
                empWage.computeEmployeewage();

		emp.dailyWage("Idea", IdeaEmpRate, IdeaFullDayHr);
		emp.dailyWage("Airtel",AirtelEmpRate, AirtelFullDayHr);

		System.out.println("\nTotal Wage for Idea is "+empWage.getTotalWage("Idea"));
        	System.out.println("\nTotal Wage for Airtel is "+empWage.getTotalWage("Airtel"));
	}

	public void dailyWage(String company, int empRatePerHr, int fullDayHr)
	{
		System.out.println("\nFull Time Daily Wage of "+company+" is = "+(empRatePerHr*fullDayHr));
		System.out.println("\nPart Time Daily Wage of "+company+" is = "+((empRatePerHr*fullDayHr)/2));
	}

        public void addCompanyWage(String company, int empRatePerHr, int workingDays, int maxHrsPerMonth)
        {
                CompanyWage companyWage = new CompanyWage(company, empRatePerHr, workingDays, maxHrsPerMonth);

		companyWageList.add(companyWage);
		companyWageMap.put(company, companyWage);
        }

        public void computeEmployeewage()
        {
                for (int i=0; i<companyWageList.size(); i++)
                {
                        CompanyWage companyWage = companyWageList.get(i);
			companyWage.setTotalEmployeewage(this.computeEmployeewage(companyWage));

                        System.out.println(companyWage);
                }
        }

	public int getTotalWage(String company)
	{
		return companyWageMap.get(company).totalEmployeewage;
	}

        int computeEmployeewage(CompanyWage compWage)
        {
                int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

                while(totalEmpHrs <= compWage.maxHrsPerMonth && totalWorkingDays < compWage.workingDays)
                {
                        totalWorkingDays++;

                        int empCheck = (int)Math.floor(Math.random() * 10) % 3;

                        switch(empCheck)
                        {
                                case isPart:
                                        empHrs = 4;
                                        break;
                                case isFull:
                                        empHrs = 8;
                                        break;
                                default:
                                        empHrs = 0;
                                        break;
                        }
                        totalEmpHrs += empHrs;

                        if(empHrs > 0)
                        {
                                System.out.println("Days#: "+totalWorkingDays+"Employee is present and its working hrs is : "+empHrs+"hrs");
                        }
                        else
                        {
                                System.out.println("Days#: "+totalWorkingDays+"Employee is absent");
                        }
                }
                return totalEmpHrs * compWage.empRatePerHr;
        }
}
