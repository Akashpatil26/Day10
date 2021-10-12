public interface IComputeEmpWage {
    public void addCompanyEmpWage(String company,int empRatePerHr,int numOfWorkingDays,int maxHoursPerMonth);
    public void computeEmpWage();
    public int getTotalWage(String company);
}
