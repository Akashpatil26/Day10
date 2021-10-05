public class EmplyoeeWageBuilderArray {

    public static final int isPartTime=1;
    public static final int isFullTime=2;

    private int numOfCompany =0;
    private CompanyEmpWage[] companyEmpWageArray;

    public EmplyoeeWageBuilderArray(){
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage(String company,int empRatePerHr,int numOfWorkingDays,int maxHoursPerMonth){
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,empRatePerHr,numOfWorkingDays,maxHoursPerMonth);
        numOfCompany++;
    }

    private void computeEmpWage(){
        for(int i=0; i<numOfCompany; i++){
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage){
        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
        while(totalEmpHrs<=companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
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
        return totalEmpHrs * companyEmpWage.empRatePerHr;

    }


    public static void main(String[] args) {
        EmplyoeeWageBuilderArray emplyoeeWageBuilder =new EmplyoeeWageBuilderArray();
        emplyoeeWageBuilder.addCompanyEmpWage("FACEBOOK ",20,2,10);
        emplyoeeWageBuilder.addCompanyEmpWage("Google ",10,4,20);
        emplyoeeWageBuilder.computeEmpWage();

    }
}
