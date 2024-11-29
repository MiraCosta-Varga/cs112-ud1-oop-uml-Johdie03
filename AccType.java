public class AccType extends BankSystem {
    
    protected String accountType;
    
    public AccType(String name, String email, String password, String address, String birthday, int ssn,
            double checkingsAmount, double savingsAmount, String accType) {
        super(name, email, password, address, birthday, ssn, checkingsAmount, savingsAmount, accType);
    }

    public static String typeOfAcc() {
        String message = null;
        if ((accType).equalsIgnoreCase("Student")) {
            StudentAcc studentAccType;
            studentAccType = new StudentAcc();
            message = studentAccType + "Account Created!";
        } else if ("Business".equalsIgnoreCase(accType)) {
            BusinessAcc businessAccType;
            businessAccType = new BusinessAcc();
            message = businessAccType + "Account Created!";
        } else if ("Regular".equalsIgnoreCase(accType)) {
            RegularAcc regularAccType;
            regularAccType = new RegularAcc();
            message = regularAccType + "Account Created!";
        } else {
            message = "Please pick one option (1-3):";
        }
        return message;
    }
    
   

}