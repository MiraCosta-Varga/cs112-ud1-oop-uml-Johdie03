public class BankSystemTester {
    public static void main(String[] args) {
        //toString
        //BankSystemTester.testToString();

        // equals


        //setters
       
       BankSystemTester.testSetName();
        
          
        BankSystemTester.testSetPassword();
        
        
        BankSystemTester.testSetEmail();
        
        BankSystemTester.testSetBirthday();
        
        BankSystemTester.testSetAddress();
        
        BankSystemTester.testSetSsn();
/*
        BankSystemTester.testSetAll();
        

        //getters 



        //constructor
        */
        
    }


    // toString 
    public static void testToString() {
        Checkings test1 = new Checkings();
        Savings test2 = new Savings();
        //BankSystem test = new BankSystem();

        System.out.println("TESTING toString() METHOD: \n");

        System.out.println("CHECKINGS toString: " + test1.toString());
        System.out.println ("SAVINGS toString: " + test2.toString());

    }
     
    //setName
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
    

}