
/*
 * Bank System where it allows user to create a bank account
 *  options: deposit, withdraw, transfer, etc.
 *
 * 
 * author @Johdie03
 * Version 1.0
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class Main {
    static BankSystem[] users = new BankSystem[50];
    static Scanner keyboard = new Scanner(System.in);
    static NumberFormat currency = NumberFormat.getCurrencyInstance();
    static int count = 0;

    public static void main(String[] args) {
        // Declaring Variables
        String name, password, email, address, birthday, accType = null;
        double checkingsAmount = 0, savingsAmount = 0;
        double depositAmount = 0, withdrawAmount = 0, transferAmount = 0;
        double totalCheckings=0, totalSavings=0;
        int ssn;
        int choice = 0, choice2 = 0;
        String option;

        // TESTER  
        //BankSystemTester.main(null);

        //Getting info from user 
        //loop through choices first

        System.out.println("Welcome!\n");

        System.out.println("Please get started by choosing an option below \n");
        System.out.println(" 1) Create an account");
        System.out.println(" 2) Obtain information about account fees");
        System.out.println(" 3) Exit");
        System.out.print(" >>>");
        choice = keyboard.nextInt();
        keyboard.nextLine();

        if (choice == 1) { //create an account

            System.out.println("Creating an account... Please fill out the following.");

            System.out.print("Name: ");
            name = keyboard.nextLine();
            System.out.print("Email: ");
            email = keyboard.nextLine();
            System.out.print("Date of Birth: ");
            birthday = keyboard.nextLine();
            System.out.print("Password: ");
            password = keyboard.nextLine();
            System.out.print("Address: ");
            address = keyboard.nextLine();
            System.out.print("Social Security (last 4 digits): ");
            ssn = keyboard.nextInt();
            System.out.print("Starting Checkings Amount: $");
            checkingsAmount = keyboard.nextDouble();
            System.out.print("Starting Savings Amount: $");
            savingsAmount = keyboard.nextDouble();
            System.out.print("\nWould you like to open a: "
                    + "\n(1) student bank account "
                    + "\n(2) business bank account "
                    + "\n(3) Regular bank account"
                    + "\n>>> ");
            choice = keyboard.nextInt();
            
            if (choice <= 0 || choice >= 4) {
                System.out.print("Please pick an option from above (1-3): ");
                choice = keyboard.nextInt();
            }
            else {
                switch (choice) {
                    case 1:
                        accType = "Student";
                        break;
                    case 2:
                        accType = "Business";
                        break;
                    case 3:
                        accType = "Regular";
                        break;

                        
                }
                AccType.accType = accType;
               System.out.println (AccType.typeOfAcc());

               
            /* 

            if ("Student".equalsIgnoreCase(accType)) {
                StudentAcc studentAccType;
                studentAccType = new StudentAcc();
                System.out.println("Account Created!");
            } else if ("Business".equalsIgnoreCase(accType)) {
                BusinessAcc businessAccType;
                businessAccType = new BusinessAcc();
                System.out.println("Account Created!");
            } else if ("Regular".equalsIgnoreCase(accType)) {
                RegularAcc regularAccType;
                regularAccType = new RegularAcc();
                System.out.println("Account Created!");
            } else {
                System.out.println("Please pick one option (1-3)");
            }

            */

            //String name, String email, String password, String address, String birthday, int ssn,
            //double checkingsAmount
            users[count++] = new Checkings(name, email, password, address, birthday, ssn, accType, checkingsAmount);
            //String name, String email, String password, String address, String birthday, int ssn,
            //double savingsAmount
            users[count++] = new Savings(name, email, password, address, birthday, ssn, accType, savingsAmount);
            // Checkings checkingsUser = (Checkings) users[count-2];
            // Savings savingsUser = (Savings) users[count-1];


        }
    }

        else if (choice == 2) { //Info
            System.out.println("Monthly Fees Information"); //get information about monthly fees
            System.out.println ("\nStudent Account Monthly Fees: $0.99");
            System.out.println ("Business Account Monthly Fees: $7.99");
            System.out.println ("Normal Checkings and Savings Acount Monthly Fees: $4.99");

        }

        else if (choice == 3) { //Exit
            System.out.println("Exiting...");
            System.exit(0);
        }

        else {
            System.out.println("ERROR: Please enter 1-3 from the options stated");
        }

        System.out.println("\nWhat would you like to do with your account? ");
        keyboard.nextLine();

        do {
            System.out.println("\nPlease pick from the following options below: ");
            System.out.println(" 1) Deposit Money"); //ask whether checkings or savings
            System.out.println(" 2) Withdraw Money"); //ask whether checkings or savings
            System.out.println(" 3) Transfer Money within Bank Account");
            System.out.println(" 4) View Account Details");
            System.out.println(" 5) Exit");
            System.out.print(" >>>");
            choice = keyboard.nextInt();
            keyboard.nextLine();

            if (choice == 1) { //desposit
                System.out.print("Would you like to deposit money to your Checkings or Savings?: ");
                option = keyboard.nextLine().toUpperCase();


                //get total?
                //totalSavings = ((BankSystem) users[count - 1]).getSavingsAmount();
                //totalCheckings = ((BankSystem) users[count - 2]).getCheckingsAmount();
                switch (option) {
                    //(Checkings) users[count-2];
                    //(Savings) users[count-1];

                    case "SAVINGS":
                    
                        System.out.println("\nDepositing to Savings...");
                        System.out.print("Please enter amount you are depositing: $");
                        depositAmount = keyboard.nextDouble();
                        deposits(depositAmount, option);
                        //savingsAmount = totalSavings += depositAmount;
                        //totalCheckings = ((Checkings) users[count - 2]).getTotalCheckingsAmount();
                        //totalSavings = ((Savings) users[count - 1]).getTotalSavingsAmount();
                        //savingsAmount += totalSavings;
                        //checkingsAmount += totalCheckings;
                        //totalSavings += depositAmount;
                        break;

                    case "CHECKINGS":
                        System.out.println("\nDepositing to Checkings...");
                        System.out.print("Please enter amount you are depositing: $");
                        depositAmount = keyboard.nextDouble();
                        deposits(depositAmount, option);
                                                /* 
                                                System.out.print("Please enter amount you are depositing: $");
                                                depositAmount = keyboard.nextDouble();
                                                keyboard.nextLine();
                                                checkingsDeposit(depositAmount);
                                                */
                                                //checkingsAmount = totalCheckings += depositAmount;
                                                //totalSavings = ((Savings) users[count - 1]).getTotalSavingsAmount();
                                                //totalCheckings = ((Checkings) users[count - 2]).getTotalCheckingsAmount();
                                                //savingsAmount += totalSavings;
                                                //totalCheckings += depositAmount;
                        
                                                //checkingsAmount += depositAmount;
                                                break;
                                        }
                                        //((Savings) users[count - 1]).getTotalSavingsAmount();
                                        //((Checkings) users[count - 2]).getTotalCheckingsAmount();
                                         System.out.println("Current amount in checkings after deposit " + currency.format(((Checkings) users[count - 2]).getTotalCheckingsAmount()));
                                         System.out.println("Current amount in savings after deposit " + currency.format(((Savings) users[count - 1]).getTotalSavingsAmount()));
                                    } else if (choice == 2) { // withdraw
                                        System.out.print("Would you like to withdraw money from your Checkings or Savings?: ");
                                        option = keyboard.nextLine().toUpperCase();
                        
                                        switch (option) {
                                             //(Checkings) users[count-2];
                                            //(Savings) users[count-1];
                                            case "SAVINGS":
                                                System.out.println("\nWithdrawing from Savings...");
                                                System.out.print("Please enter amount you are withdrawing: $");
                                                withdrawAmount = keyboard.nextDouble();
                                                //savingsAmount -= withdrawAmount;
                                                totalSavings = ((Savings) users[count - 1]).getTotalSavingsAmount();
                                                savingsAmount = totalSavings += withdrawAmount;
                        
                                                break;
                        
                                            case "CHECKINGS":
                                                System.out.println("\nWithdrawing from Checkings...");
                                                System.out.print("Please enter amount you are withdrawing: $");
                                                withdrawAmount = keyboard.nextDouble();
                                                //checkingsAmount -= withdrawAmount;
                                                totalCheckings = ((Checkings) users[count - 2]).getTotalCheckingsAmount();
                                                totalCheckings = checkingsAmount -= withdrawAmount;
                                                break;
                                        }
                                        System.out.println("Current amount in checkings after withdraw " + currency.format(totalCheckings));
                                        System.out.println("Current amount in savings after withdraw " + currency.format(totalSavings));
                        
                                    } else if (choice == 3) { //transfer
                        
                                        System.out.println("\n1) Transfer from Checkings to Savings");
                                        System.out.println("2) Transfer from Savings to Checkings");
                                        System.out.print("Please choose from the following options above: ");
                                        choice2 = keyboard.nextInt();
                        
                                        moneyTransfer(transferAmount, choice2);
                        
                                    } else if (choice == 4) { //View Acc Detail
                                        System.out.println("\nAccount Details: ");
                                        System.out.println("\n Current balance in Checkings: " + currency.format(totalCheckings));
                                        System.out.println(" Current balance in Savings: " + currency.format(totalSavings));
                                        System.out.printf(" Monthly Fees: " + currency.format(accTypeFees(accType)));
                        
                                    } else {
                                        System.out.println("Exiting out of Account options...");
                                        break;
                                    }
                        
                                } while (true);
                                System.out.println();
                            }
                            //determine fees from type of account
                          public static double accTypeFees(String accType){
                            /*
                            double monthlyFees;
                            StudentAcc studentAccount = new StudentAcc();
                            BusinessAcc businessAccount = new BusinessAcc();
                            */
                            if (accType.equalsIgnoreCase("Student")){
                                return 0.99;
                            } else if (accType.equalsIgnoreCase("Business")){
                                return 7.99;
                            } else {
                              return 4.99;
                            }
                            
                          }
                          

                          //deposits method
                            public static void deposits(double depositAmount, String option){
                                if (option.equalsIgnoreCase("CHECKINGS")) {
                                    ((Checkings) users[count - 2]).checkingsDeposit(depositAmount);
                                }
                                else if (option.equalsIgnoreCase("SAVINGS")) {
                                    ((Savings) users[count - 1]).savingsDeposit(depositAmount);
                                }


                            
                          }
                          

                          //Transfer Method
    public static void moneyTransfer(double transferAmount, int choice2) {
        
       
        if (choice2 == 1) { //Transfer from Checkings to Savings
            System.out.println("\nTransfering from Checkings to Savings... ");
        System.out.print("Please enter amount of money you will be transferring: $");
        transferAmount = keyboard.nextDouble();
        //(Savings) users[count-1];
        //(Checkings) users[count-2];
        //double checkingsBalance = ((Checkings) users[count - 2]).getCheckingsAmount();

        ((Checkings) users[count - 2]).transferCheckingsToSavings(transferAmount);
        //checkingsBalance.transferCheckingsToSavings(transferAmount);
            

        }
        else if (choice2 ==2){
            System.out.println("\nTransfering from Savings to Checkings... ");
            System.out.print("Please enter amount of money you will be transferring: $");
            transferAmount = keyboard.nextDouble();
            
            ((Savings) users[count - 1]).transferSavingsToCheckings(transferAmount);
           
    /* 
            double checkingsBalance = checkingsUser.getCheckingsAmount();
            double savingsBalance = savingsUser.getSavingsAmount();

            savingsUser.transferSavingsToCheckings(transferAmount);
            */
        } else {
            System.out.println("Please pick an option from 1-3");
        }
            
            




        }
    }
                

                          /* 
      public static double checkingsDeposit(double depositAmount) {
      double totalCheckingsAmount = ((Checkings) users[count - 2]).getTotalCheckingsAmount();
    //   System.out.print("Please enter amount you are depositing: $");
    //    depositAmount = keyboard.nextDouble();
    //   keyboard.nextLine();
      return totalCheckingsAmount += depositAmount;
      //System.out.println("Current amount in checkings after deposit " + currency.format(totalCheckings));
      

  }

public static double savingsDeposit(double depositAmount) {
      double totalSavingsAmount = ((Savings) users[count - 1]).getTotalSavingsAmount();
    //    System.out.print("Please enter amount you are depositing: $");
    //    depositAmount = keyboard.nextDouble();
    //    keyboard.nextLine();
     return totalSavingsAmount += depositAmount;
      //System.out.println("Current amount in savings after deposit " + currency.format(totalSavings));
  }
*/
    //Savings savingsAcc = new Savings();
    

            /*  
            if (transferAmount >= checkingsBalance) {
            System.out.println("Transfer Successful!\n Amount Transferred: $" + transferAmount +
            "\nCurrent Balance in Checkings: " + checkingsUser.getCheckingsAmount() +
            "\nCurrent Balanace in Savings: " + savingsUser.getSavingsAmount());
            } else {
            System.out.println ("You do not have enough money in your Checkings");
            
            }
            
             */
            
            
            // Checkings.transferCheckingsToSavings(transferAmount, choice2);
            
            /*
            if (transferAmount <= checkingsBalance) {
                checkingsUser.transferCheckingsToSavings(transferAmount);
                savingsUser.transferCheckingsToSavings(transferAmount);
                System.out.println("Transfer Successful!\n Amount Transferred: $" + transferAmount +
              "\nCurrent Balance in Checkings: " + checkingsUser.getCheckingsAmount() +
              "\nCurrent Balanace in Savings: " + savingsUser.getSavingsAmount());
            } else {
              System.out.println ("You do not have enough money in your Checkings");
            }
            
            if (choice2 == 1){ //Transfer from Checkings to Savings
             System.out.println("Transfering from Checkings to Savings... ");
             System.out.print("Please enter amount of money you will be transferring: $");
             transferAmount = keyboard.nextDouble();
            
             double checkingsBalance = ((Checkings)users[count-2]).getCheckingsAmount();
             double savingsBalance = ((Savings)users[count-1]).getSavingsAmount();
             if (transferAmount > Checkings.getCheckingsAmount()){
                 System.out.println ("You do not have enough money in your Checkings");
             }
             else {
              checkingsBalance = ((Checkings)users[count-2]).getCheckingsAmount();
              savingsBalance = ((Savings)users[count-1]).getSavingsAmount();
                 System.out.println ("Transfer Successful!\n Amount Transferred: $" + transferAmount + 
                 "\nCurrent Balance in Checkings: " + checkingsBalance +
                 "\nCurrent Balanace in Savings: " + savingsBalance);
             }
            
            
            
             } else if (choice2 == 2){ //Transfer from Savings to Checkings
             System.out.println("Transfering from Savings to Checkings... ");
             System.out.print("Please enter amount of money you will be transferring: $");
            
               }
             */

/*
*                
*      switch (choice2) {
             case 1: //Transfer from Checkings to Savings
                 System.out.println("Transfering from Checkings to Savings... ");
                 System.out.print("Please enter amount of money you will be transferring: $");
                 transferAmount = keyboard.nextDouble();
                 //transfer method
                 //Checkings checkingsAcc = new Checkings();
                 //checkingsAcc.transferCheckingsToSavings(transferAmount);
                 //transferSavingsToCheckings
                 break;


             case 2: //Transfer from Savings to Checkings
                 System.out.println("Transfering from Savings to Checkings... ");
                 System.out.print("Please enter amount of money you will be transferring: $");
                 transferAmount = keyboard.nextDouble();
                 Savings savingsAcc = new Savings();
                 //savingsAcc.transferSavingsToCheckings(transferAmount);
                 //transferCheckingsToSavings
                 break;


         }
*/
