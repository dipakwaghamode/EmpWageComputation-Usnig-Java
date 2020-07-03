public class Employeewage implements Computewages
{
        public static final int isPart = 0, isFull = 1;
        int numOfCompany = 0;

        CompanyWage[] wageArray;

        public Employeewage()
        {
                wageArray = new CompanyWage[10];
        }

        public static void main(String[] args)
        {

                System.out.println("Welcome to Employee Wage Computation Program");


                Computewages empWage = new Employeewage();

                empWage.addCompanyWage("Idea", 30, 25, 120);
                empWage.addCompanyWage("Airtel", 20, 30, 100);
                empWage.computeEmployeewage();
        }


        public void addCompanyWage(String company, int empRatePerHr, int workingDays, int maxHrsPerMonth)
        {
                wageArray[numOfCompany] = new CompanyWage(company, empRatePerHr, workingDays, maxHrsPerMonth);

                numOfCompany++;
        }

        public void computeEmployeewage()
        {
                for (int i=0; i<numOfCompany; i++)
                {
                        wageArray[i].setTotalEmployeewage(this.computeEmployeewage(wageArray[i]));

                        System.out.println(wageArray[i]);
                }
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
                                System.out.println("Days : "+totalWorkingDays+"Employee is present and its working hrs : "+empHrs+"hrs");
                        }
                        else
                        {
                                System.out.println("Days : "+totalWorkingDays+"Employee is absent");
                        }
                }
                return totalEmpHrs * compWage.empRatePerHr;
        }
}
