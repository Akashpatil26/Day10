public class EmplyoeeWageBuilder {
    public static final int isPartTime=1;
    public static final int isFullTime=2;
    public static void main(String[] args) {
        computeWage("FACEBOOK ",5,15,10);
        computeWage("Google ",7,18,12);

    }
    public static int computeWage( String company,int numOfWorkingDays,int maxHoursPerMonth,int empRatePerHr ){
        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
        while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays< numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck=(int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case isPartTime:
                    empHrs=4;
                    break;
                case isFullTime:
                    empHrs=8;
                    break;
                default:
                    empHrs=0;
            }
            totalEmpHrs=totalEmpHrs + empHrs;
            System.out.println("No of Days: " + totalWorkingDays + "Emplyoee hours: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total Emplyoee Wage for company: "+company+ "is: "+totalEmpWage);
        return totalEmpWage;
    }


}
