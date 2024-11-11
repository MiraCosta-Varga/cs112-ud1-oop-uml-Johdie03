public class MonthlyFees {
  
    private double fees;
    private double minAccBalance;
    
    public MonthlyFees(double fees, double minAccBalance) {
        this.fees = fees;
        this.minAccBalance = minAccBalance;
    }

    //setters
    public void setFees(double fees) {
        this.fees = fees;
    }

    public void setMinAccBalance(double minAccBalance) {
        this.minAccBalance = minAccBalance;
    }

    //getters

}

