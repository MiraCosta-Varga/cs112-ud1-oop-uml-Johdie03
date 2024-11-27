public class Savings extends BankSystem {
    
    //Fields
    private double savingsAmount;

    //Constructor
    //Full Constructor
    public Savings(String name, String email, String password, String address, String birthday, int ssn,
            double savingsAmount) {
        super(name, email, password, address, birthday, ssn);
        this.savingsAmount = savingsAmount;
    }

    //Default Constructor
    /* Default Constructor */
    public Savings() {
        this(DEFAULT_NAME, DEFAULT_EMAIL, DEFAULT_PASSWORD, DEFAULT_ADDRESS, DEFAULT_BIRTHDAY, DEFAULT_SSN, DEFAULT_SAVINGS_AMOUINT);
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
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;
        BankSystem otherBank = (BankSystem) other;
        return super.equals(other) &&
                this.savingsAmount == otherBank.savingsAmount;
    }
    
    //Method for Money transfer from Checkings to Savings
    public void transferCheckingsToSavings(double transferAmount) {
        savingsAmount += transferAmount;
        /*checkingsAmount -= transferAmount;
        System.out.println("Transfer Successful!\n Amount Transferred: $" + transferAmount +
                "\nCurrent Balance in Checkings: " + checkingsAmount +
                "\nCurrent Balanace in Savings: " + savingsAmount);
                */
    }
        
}
