public class CompanyEmpWage  {

    public final String company;
    public final int empRatePerHr;
    public final int  numOfWorkingDays;
    public final int maxHoursPerMonth ;
    public int totalEmpWage;

    public CompanyEmpWage(String company,int empRatePerHr,int numOfWorkingDays,int maxHoursPerMonth ){
        this.company=company;
        this.empRatePerHr=empRatePerHr;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHoursPerMonth=maxHoursPerMonth;
    }
    public void setTotalEmpWage( int totalEmpWage){
        this.totalEmpWage=totalEmpWage;
    }
    @Override
    public String toString ()
    {
        return "Total Emplyoee Wage for company: " +company+ "is: " + totalEmpWage ;
    }
}
