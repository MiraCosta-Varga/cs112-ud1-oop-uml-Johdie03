
public class Checkings extends BankSystem{
    //Fields
    private double checkingsAmount;

    //Constructors
    //Full Constructor
    public Checkings(String name, String email, String password, String address, String birthday, int ssn,
            double checkingsAmount) {
        super(name, email, password, address, birthday, ssn);
        this.checkingsAmount = checkingsAmount;
    }
    /* Default Constructor */
    public Checkings() {
        this(DEFAULT_NAME, DEFAULT_EMAIL, DEFAULT_PASSWORD, DEFAULT_ADDRESS, DEFAULT_BIRTHDAY, DEFAULT_SSN, DEFAULT_CHECKINGSAMOUNT);
    }
    
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
        if(this == other) return true;
        if (other == null || getClass() != other.getClass())
            return false;
        BankSystem otherBank = (BankSystem) other;
        return super.equals(other) &&
                this.checkingsAmount == otherBank.checkingsAmount;
    }

}
