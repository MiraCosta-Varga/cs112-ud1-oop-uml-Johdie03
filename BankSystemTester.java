public class BankSystemTester {
    public static void main(String[] args) {

        /* 
        //toString
        BankSystemTester.testToString();
        
        // equals
        
        
        //setters
        
        BankSystemTester.testSetName();
        
        BankSystemTester.testSetPassword();
        
        BankSystemTester.testSetEmail();
        
        BankSystemTester.testSetBirthday();
        
        BankSystemTester.testSetAddress();
        
        BankSystemTester.testSetSsn();
        
        BankSystemTester.testSetAccType();
        
        BankSystemTester.testSetCheckingsAmount();
        
        BankSystemTester.testSetSavingsAmount();
        
        BankSystemTester.testSetAll();
        
        //getters 
        BankSystemTester.testGetName();

        BankSystemTester.testGetPassword();

        BankSystemTester.testGetBirthday();

        BankSystemTester.testGetAddress();

        BankSystemTester.testGetSsn();

        BankSystemTester.testGetAccType();

        BankSystemTester.testGetCheckingsAmount();

        BankSystemTester.testGetSavingsAmount();

        BankSystemTester.testFullConstructor();

        */
    }


    // toString 
    public static void testToString() {
        Checkings test1 = new Checkings();
        Savings test2 = new Savings();
        //BankSystem test = new BankSystem();

        System.out.println("TESTING toString() METHOD: \n");

        System.out.println("CHECKINGS toString: \n" + test1.toString());
        System.out.println ("SAVINGS toString: \n" + test2.toString());

    }
     

    public static void testSetName() {
        Checkings test = new Checkings();
        System.out.println("\nTESTING setName() METHOD: \n");

        test.setName("Jo");
        System.out.println("setName should have returned \"Jo\" for \"Name\" \n" + test);

    }

    

    
    public static void testSetPassword() {
        Checkings test = new Checkings();
        System.out.println("\nTESTING setPassword() METHOD: \n");

        test.setPassword("uniquePassword");
        

        System.out.println("setPassword should have returned \" uniquePassword \"for Password \n" + test);
    }

    public static void testSetEmail() {
        Checkings test = new Checkings();
        System.out.println("\nTESTING setEmail() METHOD: \n");

        test.setEmail("johdie@gmail.com");

        System.out.println("setEmail should have returned \" johdie@gmail.com \"for Email \n" + test);

    }
    
    public static void testSetBirthday() {
        Checkings test = new Checkings();
        System.out.println("\nTESTING setBirthday() METHOD: \n");

        test.setBirthday("10/03/2006");

        System.out.println("setBirthday should have returned \" 10/03/2006 \"for Birthday \n" + test);
    }
    
    public static void testSetAddress(){
        Checkings test = new Checkings();
        System.out.println("\nTESTING setAddress() METHOD: \n");

        test.setAddress("789 Oceanside, CA 12345, US");

        System.out.println("setAddress should have returned \" 789 Oceanside, CA 12345, US \"for Address \n" + test);
    }

    public static void testSetSsn(){
        Checkings test = new Checkings();
        System.out.println("\nTESTING setSsn() METHOD: \n");

        test.setSsn(6789);

        System.out.println("setSsn should have returned \" 6789 \"for SSN \n" + test);
    }

    public static void testSetAccType(){
        Checkings test = new Checkings();
        System.out.println("\nTESTING setAccType() METHOD: \n");

        test.setAccType("Business");

        System.out.println("setAccType should have returned \" Business \"for Account Type \n" + test);
    }
    

    public static void testSetCheckingsAmount() {
        Checkings test = new Checkings();
        System.out.println("\nTESTING setCheckignsAmount() METHOD: \n");

        test.setCheckingsAmount(500);

        System.out.println("setCheckignsAmount should have returned \" 500 \"for Total Checkings Amount \n" + test);
    }
    

    public static void testSetSavingsAmount() {
        Savings test = new Savings();
        System.out.println("\nTESTING setSavingsAmount() METHOD: \n");

        test.setSavingsAmount(800);

        System.out.println("setSavingsAmount should have returned \" 800 \"for Total Savings Amount \n" + test);
    }


    public static void testSetAll() {
        Checkings test = new Checkings();
        System.out.println("\nTESTING setAll() METHOD: \n");

        test.setAll("NAME", "EMAIL", "PASSWORD", "ADDRESS", "BIRTHDAY", 4567, "ACCOUNT TYPE");

        System.out.println(
                "setAll should have returned \" \"NAME\", \"EMAIL\", \"PASSWORD\", \"ADDRESS\", \"BIRTHDAY\", 4567, \"ACCOUNT TYPE\" \" \n"
                        + test);

    }

    //testGetName
    public static void testGetName() {
        Checkings test = new Checkings();
        System.out.println("\nTESTING getName() METHOD: \n");

        System.out.println("getName should be default name " + BankSystem.DEFAULT_NAME + ": " + test.getName());

        test.setName("New Name");

        System.out.println("Name should have changed to \" New Name \" : " + test.getName());
    }

    //testGetPassword
    public static void testGetPassword() {
        Checkings test = new Checkings();
        System.out.println("\nTESTING getPassword() METHOD: \n");

        System.out.println("getPassword should be default password " + BankSystem.DEFAULT_PASSWORD + ": " + test.getPassword());

        test.setPassword("New Password");

        System.out.println("Password should have changed to \" New Password \" : " + test.getPassword());
    }

    //testGetEmail
    public static void testGetEmail() {
        Checkings test = new Checkings();
        System.out.println("\nTESTING getEmail() METHOD: \n");

        System.out.println("getEmail should be default email " + BankSystem.DEFAULT_EMAIL + ": " + test.getEmail());

        test.setEmail("New Email");

        System.out.println("Email should have changed to \" New Email \" : " + test.getPassword());
    }

    //testGetBirthday
    public static void testGetBirthday() {
        Checkings test = new Checkings();
        System.out.println("\nTESTING getBirthday() METHOD: \n");

        System.out.println("getBirthday should be default birthday " + BankSystem.DEFAULT_BIRTHDAY + ": " + test.getBirthday());

        test.setPassword("New Password");

        System.out.println("Password should have changed to \" New Password \" : " + test.getPassword());
    }


    //testGetAddress
    public static void testGetAddress() {
        Checkings test = new Checkings();
        System.out.println("\nTESTING getAddress() METHOD: \n");

        System.out.println("getAddress should be default address " + BankSystem.DEFAULT_ADDRESS + ": " + test.getAddress());

        test.setAddress("New Address");

        System.out.println("Address should have changed to \" New Address \" : " + test.getAddress());
    }

    //testGetSsn
    public static void testGetSsn() {
        Checkings test = new Checkings();
        System.out.println("\nTESTING getSsn() METHOD: \n");

        System.out.println("getSsn should be default Ssn " + BankSystem.DEFAULT_SSN+ ": " + test.getSsn());

        test.setSsn(1369);

        System.out.println("Ssn should have changed to \" 1369 \" : " + test.getSsn());
    }

    //testGetAccType
    public static void testGetAccType() {
        Checkings test = new Checkings();
        System.out.println("\nTESTING getAccType() METHOD: \n");

        System.out.println("getAccType should be default Account Type " + BankSystem.DEFAULT_ACCTYPE+ ": " + test.getAccType());

        test.setAccType("Student");

        System.out.println("Account Type should have changed to \" Student \" : " + test.getAccType());
    }

    //testGetCheckingsAmount
    public static void testGetCheckingsAmount() {
        Checkings test = new Checkings();
        System.out.println("\nTESTING getCheckingsAmount() METHOD: \n");

        System.out.println("getCheckingsAmount should be default Checkings Amount " + Checkings.DEFAULT_CHECKINGSAMOUNT+ ": " + test.getTotalCheckingsAmount());

        test.setTotalCheckingsAmount(10.1);

        System.out.println("Checkings Amount should have changed to \" 10.1 \" : " + test.getTotalCheckingsAmount());
    }

    //testGetSavingsAmount
    public static void testGetSavingsAmount() {
        Savings test = new Savings();
        System.out.println("\nTESTING getSavingsAmount() METHOD: \n");

        System.out.println("getSavingsAmount should be default Checkings Amount " + Savings.DEFAULT_SAVINGS_AMOUNT+ ": " + test.getTotalSavingsAmount());

        test.setTotalSavings(15.15);

        System.out.println("Savings Amount should have changed to \" 15.15 \" : " + test.getTotalSavingsAmount());
    }
    
    //testFullConstructor
    public static void testFullConstructor() {
        Checkings test1 = new Checkings();
        Savings test2 = new Savings();


        System.out.println("\nTESTING Full Constructor METHOD for CHECKINGS: \n");
        test1 = new Checkings("Name", "Email", "Password", "Address", "Birthday", 2468, "Account Type", 10.10);
/*String name, String email, String password, String address, String birthday, int ssn,
    String accType */
    //Valid Data
    System.out.println("Full constructor should build new Checkings : " + test1);

    //test1 = new Checkings("Name", "Email", "Password", "Address", "Birthday", "SSN", "ACCTYPE", 10.0); //Ssn should not be a String
    //Error Message
            
    System.out.println("\nTESTING Full Constructor METHOD for Savings: \n");
    test2 = new Savings("Name", "Email", "Password", "Address", "Birthday", 2468, "Account Type", 12.10);
    System.out.println("Full constructor should build new Savings : " + test2);
    //test2 = new Checkings("Name", "Email", "Password", "Address", "Birthday", "SSN", "ACCTYPE", 12.0); //Ssn should not be a String
    //Error Message

    }




}