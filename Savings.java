public class Savings extends BankSystem {
    
    private double savingsAmount;

    //Constructor
    public Savings(String name, String email, String password, String address, String birthday, int ssn,
            double savingsAmount) {
        super(name, email, password, address, birthday, ssn);
        this.savingsAmount = savingsAmount;
    }


    //Setters
    public void setSavingsAmount(double savingsAmount) {
        this.savingsAmount = savingsAmount;
    }

    //Getters
    public double getSavingsAmount() {
        return this.savingsAmount;
    }

    //Other Methods
    @Override
    public String toString() {
        return super.toString() + "Savings Total Amount: " + currency.format(savingsAmount);
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) return true;
        if (other == null || getClass() != other.getClass())
            return false;
        BankSystem otherBank = (BankSystem) other;
        return super.equals(other) &&
                this.savingsAmount == otherBank.savingsAmount;
    }
}
