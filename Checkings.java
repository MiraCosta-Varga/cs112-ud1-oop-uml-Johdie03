
public class Checkings extends BankSystem {
    //Fields
    //private double checkingsAmount;
    private double totalCheckingsAmount = 0;

    //Constructors
    //Full Constructor
    public Checkings(String name, String email, String password, String address, String birthday, int ssn,
            double checkingsAmount) {
        super(name, email, password, address, birthday, ssn);
        this.checkingsAmount = checkingsAmount;
        totalCheckingsAmount += checkingsAmount;
    }

    // Default Constructor
    /*public Checkings() {
        this(DEFAULT_NAME, DEFAULT_EMAIL, DEFAULT_PASSWORD, DEFAULT_ADDRESS, DEFAULT_BIRTHDAY, DEFAULT_SSN,
                DEFAULT_CHECKINGSAMOUNT);
    }
                */

    //Setters
    public void setCheckingsAmount(double checkingsAmount) {
        this.checkingsAmount = checkingsAmount;
    }

    //Getters
    public double getCheckingsAmount() {
        return this.checkingsAmount;
    }

    //Other Methods
    @Override
    public String toString() {
        return super.toString() + "Checkings Amount: " + currency.format(checkingsAmount);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;
        BankSystem otherBank = (BankSystem) other;
        return super.equals(other) &&
                this.checkingsAmount == otherBank.checkingsAmount;
    }

    //Method for Money transfer from Savings to Checkings
    /* 
    public void transferSavingsToCheckings(double transferAmount, int choice2) {

        if (transferAmount >= savingsAmount) {
            System.out.println("You do not have enough money in your Savings");

        } else {
            checkingsAmount += transferAmount;
            savingsAmount -= transferAmount;
            System.out.println("Transfer Successful!\n Amount Transferred: $" + transferAmount +
                    "\nCurrent Balance in Checkings: " + checkingsAmount +
                    "\nCurrent Balanace in Savings: " + savingsAmount);

        }

    }
    */
    

    //transfer from Checkings to Savings

    public void transferCheckingsToSavings(double transferAmount) {
        /* 
            savingsAmount += transferAmount;
            totalCheckingsAmount -= transferAmount;
            System.out.println ("Transfer Successful!\n Amount Transferred: $" + transferAmount + 
                    "\nCurrent Balance in Checkings: " + totalCheckingsAmount +
                    "\nCurrent Balanace in Savings: " + savingsAmount);
            */
             if (transferAmount > this.getCheckingsAmount() ) {
                System.out.println ("You do not have enough money in your Checkings") ;
            
            
            } else {
                savingsAmount += transferAmount;
                totalCheckingsAmount -= transferAmount;
                System.out.println("Transfer Successful!\n Amount Transferred: $" + transferAmount +
                        "\nCurrent Balance in Checkings: " + checkingsAmount +
                        "\nCurrent Balanace in Savings: " + savingsAmount);
            }
            
            }
                     
        


        public void checkingsWidthraw(double amount) {
                    double withdrawAmount = amount;
                    checkingsAmount -= withdrawAmount;
                }
            
                public void checkingsDeposit(double amount) {
                    double depositAmount = amount;
                    checkingsAmount += depositAmount;
                }
                    
            /* 
                public static void checkingsTransfer(double transferAmount, int choice2) {
        
                    if (transferAmount > totalCheckingsAmount) {
                    System.out.println ("You do not have enough money in your Checkings");    
                    } else if (transferAmount < totalCheckingsAmount) {
                        checkingsWidthraw(transferAmount);
                savingsDeposit(transferAmount);

            }


    }
    */

}








