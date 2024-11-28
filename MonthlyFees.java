

interface MonthlyFees{
   double monthlyFees(); //calculates montly fees depending on accountType
   String accType();


}

/*

public class MonthlyFees implements AccountType {
  static NumberFormat currency = NumberFormat.getCurrencyInstance();
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
    public double getFees() {
        return fees;
    }

    public double minAccBalance() {
        return minAccBalance;
    }



    public void monthlyFees (){
      System.out.println ("Monthly fee: " + currency.format(fees));
    }

  public void type(){
    
  } 
  */



