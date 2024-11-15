/*
 * bankSystem
 * abstract class to allow inheritance for different account types
 */
import java.text.NumberFormat;

public abstract class BankSystem {

    protected static NumberFormat currency = NumberFormat.getCurrencyInstance();
    // Instance Variables
    private String name;
    private String password;
    private String email;
    private String address;
    private String birthday;
    private int ssn;
    protected double checkingsAmount;
    protected double savingsAmount;

    //Constance Variables
    public static final String DEFAULT_NAME = "Michael Smith";
    public static final String DEFAULT_PASSWORD = "Smith123";
    public static final String DEFAULT_EMAIL = "michaelS@gmail.com";
    public static final String DEFAULT_ADDRESS = "123 Street City, CA 92000, US";
    public static final String DEFAULT_BIRTHDAY = "01/01/2001";
    public static final int DEFAULT_SSN = 123456789;

    /***  Constructor Methods ***/
    /* Default Constructor */
    public BankSystem() {
        this(DEFAULT_NAME, DEFAULT_EMAIL, DEFAULT_PASSWORD, DEFAULT_ADDRESS, DEFAULT_BIRTHDAY, DEFAULT_SSN);
    }

    /* Full Constructor */
    public BankSystem(String name, String email, String password, String address, String birthday, int ssn) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.birthday = birthday;
        this.ssn = ssn;
    }

    /* Copy Constructor */
    public BankSystem(BankSystem original) {
        if (original == null) {
            throw new IllegalArgumentException("Bad deep copy");
        } else {
            /*  this.setAll(original.name, original.email, original.password, original.address, original.birthday,
                    original.ssn);
                    */
        }
    }

    /* setters */
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setAll(String name, String email, String password, String address, String birthday, int ssn) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setAddress(address);
        this.setBirthday(birthday);
        this.setSsn(ssn);

    }

    /* getters */
    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.password;
    }

    public String getBirthday() {
        return this.password;
    }

    public String getAddress() {
        return this.address;
    }

    public int getSsn() {
        return this.ssn;
    }

/* Other Methods */
@Override
    public boolean equals(Object other) {
    /*if(this == other) return true;
    else if (other == null || getClass() != other.getClass())
        return false;
        */
  if (other == null || !(other instanceof BankSystem)) {
            return false;
        } else {
            return true;
        }
            
    }

    @Override
    public String toString() {
        return 
        "Name: " + this.name +
        "Password: " + this.password + 
        "Email: " + this.email + 
        "Birthday: " + this.birthday +
        "Address: " + this.address +
        "SSN: " + this.ssn;

    }
}
