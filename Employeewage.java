import java.io.*;

class Employeewage
{
        public static int IdeaEmpRate = 20,AirtelEmpRate = 30;
        public static int IdeaMaxHrs = 100, IdeaTotalDays=20;
        public static int IdeaWage = 0, IdeaWagePerHrs=20, IdeafullDayHrs=8;
        public static int AirtelMaxHrs = 130, AirtelTotalDays=15;
        public static int AirtelWage = 0, AirtelWagePerHrs=30, AirtelfullDayHrs=9;

        public static void main(String[] args) throws IOException
        {

                System.out.println("..........Welcome to Employee Wage Computation Program...........");
                System.out.println("\n");

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("1.Check Employee Wage for Idea Company ");
                System.out.println("2.Check Employee Wage for Airtel Company ");
                System.out.println("Enter your choice : ");
                int choice = Integer.parseInt(br.readLine());

                switch(choice)
                {
                        case 1:
                               	IdeaWage = IdeaWagePerHrs * IdeafullDayHrs;
                                System.out.println("\nFull time Daily Employee Wage salary is = "+IdeaWage);

                                IdeaWage = (IdeaWagePerHrs * IdeafullDayHrs)/2;
                                System.out.println("Part time Employee Wage salary is = "+IdeaWage);

                                System.out.println("\nEmployee's Scheduled");
                                getIdeaEmpWage();
                                break;
                        case 2:
                                AirtelWage = AirtelWagePerHrs * AirtelfullDayHrs;
                                System.out.println("\nFull time Daily Employee Wage salary is = "+AirtelWage);

                                AirtelWage = (AirtelWagePerHrs * AirtelfullDayHrs)/2;
                                System.out.println("\nPart time Employee Wage salary is = "+AirtelWage);

                                System.out.println("\nEmployee's Scheduled");
                                getAirtelEmpWage();
                                break;
                        default:
                                System.out.println("Enter valid choice...");
                                break;
                }
        }



        public static int getIdeaEmpWage()
        {
                int IdeaEmpHrs=0, IdeaTotalEmpHrs=0,IdeaTotalWorkingDays=0;

                while(IdeaTotalEmpHrs <= IdeaMaxHrs && IdeaTotalWorkingDays < IdeaTotalDays)
                {
                        IdeaTotalWorkingDays++;

                        int CheckEmp = (int)Math.floor(Math.random() * 10) % 3;

                        switch(CheckEmp)
                        {
                                case 1:
                                        IdeaEmpHrs = 4;
                                        break;
                                case 2:
                                        IdeaEmpHrs = 8;
                                        break;
                                default:
                                        IdeaEmpHrs = 0;
                                        break;
                        }

                        IdeaTotalEmpHrs += IdeaEmpHrs;

                        if(IdeaEmpHrs > 0)
                        {
                                System.out.println("Day" +IdeaTotalWorkingDays+"  Employee is present and working hrs is : "+IdeaEmpHrs+"hrs");
                        }
                        else
                        {
                                System.out.println("Day" +IdeaTotalWorkingDays+"  Employee is not present");
                        }
                }

                int IdeaTotalWage = IdeaTotalEmpHrs * IdeaEmpRate;
                System.out.println("\nTotal Employee Wage for Idea Company is : "+IdeaTotalWage);

                return IdeaTotalWage;
        }



        public static int getAirtelEmpWage()
        {
                int AirtelEmpHrs=0, AirtelTotalEmpHrs=0,AirtelTotalWorkingDays=0;

                while(AirtelTotalEmpHrs <= AirtelMaxHrs && AirtelTotalWorkingDays < AirtelTotalDays)
                {
                        AirtelTotalWorkingDays++;

                        int Checkemp = (int)Math.floor(Math.random() * 10) % 3;

                        switch(Checkemp)
                        {
                                case 1:
                                        AirtelEmpHrs = 4;
                                        break;
                                case 2:
                                        AirtelEmpHrs = 9;
                                        break;
                                default:
                                        AirtelEmpHrs = 0;
                                        break;
                        }

                        AirtelTotalEmpHrs += AirtelEmpHrs;

                        if(AirtelEmpHrs > 0)
                        {
                                System.out.println("Days"+AirtelTotalWorkingDays+"  Employee is present and working hrs is : "+AirtelEmpHrs+"hrs");
                        }
                        else
                        {
                                System.out.println("Days"+AirtelTotalWorkingDays+"  Employee is absent");
                        }
                }

                int AirtelTotalWage = AirtelTotalEmpHrs * AirtelEmpRate;
                System.out.println("\nTotal Employee Wage for Airtel Company : "+AirtelTotalWage);

                return AirtelTotalWage;
        }
}


