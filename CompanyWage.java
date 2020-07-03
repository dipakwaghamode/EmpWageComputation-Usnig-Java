public class  CompanyWage
{
        public final String company;
        public final int empRatePerHr;
        public final int workingDays, maxHrsPerMonth;
        public int totalEmployeewage;

        public CompanyWage(String company, int empRatePerHr, int workingDays, int maxHrsPerMonth)
        {
                this.company = company;
                this.empRatePerHr = empRatePerHr;
                this.workingDays = workingDays;
                this.maxHrsPerMonth = maxHrsPerMonth;
        }

        public void setTotalEmployeewage(int totalEmployeewage)
        {
                this.totalEmployeewage = totalEmployeewage;
        }

        public String toString()
        {
                return "\nTotal Employee wage for '"+company+"' is => "+totalEmployeewage;
        }
}
