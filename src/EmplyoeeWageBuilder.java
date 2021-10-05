public class EmplyoeeWageBuilder {

    public static final int isPartTime=1;
    public static final int isFullTime=2;
    private final String company;
    private final int empRatePerHr;
    private final int  numOfWorkingDays;
    private final int maxHoursPerMonth ;
    private int totalEmpWage;

    public static void main(String[] args) {
        EmplyoeeWageBuilder faceBook= new EmplyoeeWageBuilder("FACEBOOK ",20,2,10);
        EmplyoeeWageBuilder google = new EmplyoeeWageBuilder("Google ",10,4,20);
        faceBook.computeWage();
        System.out.println(faceBook);
        google.computeWage();
        System.out.println(google);

    }
    public EmplyoeeWageBuilder(String company,int empRatePerHr,int numOfWorkingDays,int maxHoursPerMonth ){
        this.company=company;
        this.empRatePerHr=empRatePerHr;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHoursPerMonth=maxHoursPerMonth;

    }
    public void computeWage(){
        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
        while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
            totalEmpHrs+=empHrs;
            System.out.println("No of Days: " +totalWorkingDays+ " Emplyoee hours: " +empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHr;

    }

    @Override
    public String toString ()
    {
        return "Total Emplyoee Wage for company: " +company+ "is: " + totalEmpWage ;
    }


}
