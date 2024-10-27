/*
 * bankSystem
 * abstract class to allow inheritance for different account types
 */


public abstract class BankSystem {

    // Instance Variables
    private String name;
    private String password;
    private String email;
    private String address;
    private String birthday;
    private int ssn;

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
    public BankSystem(String name, String email, String password, String address, String birthday, int ssn){
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
            this.setAll(original.name, original.email, original.password, original.address, original.birthday,
                    original.ssn);
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
    
/* 
    public boolean setAll(String name, String email, String password, String address, String birthday, int ssn) {
 return this.setName(name) && this.setEmail(email) && this.setPassword(password) && this.setAddress(address) && this.setBirthday(birthday) && this.setSsn(ssn);
       
    }
    */
}
