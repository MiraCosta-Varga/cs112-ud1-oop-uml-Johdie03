
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
        //TESTER//
        // System.out.println("RUNNING TESTER");
        // BankSystemTester.main(null);


 
        // Declaring Variables
        String name, password, email, address, birthday, accType = null;
        double checkingsAmount = 0, savingsAmount = 0;
        double depositAmount = 0, withdrawAmount = 0, transferAmount = 0;
        int ssn;
        int choice, choice2, choice3;
        String option;

        // TESTER  
        //BankSystemTester.main(null);

        //Getting info from user 
        //loop through choices first

        System.out.println("Welcome!\n");

        do {
            System.out.println("Please get started by choosing an option below \n");
            System.out.println(" 1) Create an account");
            System.out.println(" 2) Get information about account fees");
            System.out.println(" 3) Exit");
            System.out.print(" >>>");
            choice3 = keyboard.nextInt();
            keyboard.nextLine();

            if (choice3 == 1) { //create an account

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
                System.out.print("\nWhat type of account would you like to open? "
                        + "\n(1) student bank account "
                        + "\n(2) business bank account "
                        + "\n(3) Regular bank account"
                        + "\n>>> ");
                choice = keyboard.nextInt();

                if (choice <= 0 || choice >= 4) {
                    System.out.print("Please pick an option from above (1-3): ");
                    choice = keyboard.nextInt();
                } else {
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
                    System.out.println(AccType.typeOfAcc());

                    //String name, String email, String password, String address, String birthday, int ssn,
                    //double checkingsAmount
                    users[count++] = new Checkings(name, email, password, address, birthday, ssn, accType,
                            checkingsAmount);
                    //String name, String email, String password, String address, String birthday, int ssn,
                    //double savingsAmount
                    users[count++] = new Savings(name, email, password, address, birthday, ssn, accType, savingsAmount);
                    // Checkings checkingsUser = (Checkings) users[count-2];
                    // Savings savingsUser = (Savings) users[count-1];

                }
            }

            else if (choice3 == 2) { //INFO
                System.out.println("Monthly Fees Information"); //get information about monthly fees
                System.out.println("\nStudent Account Monthly Fees: $0.99");
                System.out.println("Business Account Monthly Fees: $7.99");
                System.out.println("Normal Checkings and Savings Acount Monthly Fees: $4.99");

            }

            else if (choice3 == 3) { //EXIT
                System.out.println("Exiting...");
                System.exit(0);
            }

            else {
                System.out.println("ERROR: Please enter 1-3 from the options stated");
            }
        } while (choice3 != 1);

        do {
            System.out.println("\nWhat would you like to do with your account? ");
            // keyboard.nextLine();
            System.out.println("\nPlease pick from the following options below: ");
            System.out.println(" 1) Deposit Money"); //ask whether checkings or savings
            System.out.println(" 2) Withdraw Money"); //ask whether checkings or savings
            System.out.println(" 3) Transfer Money within Bank Account");
            System.out.println(" 4) View Account Details");
            System.out.println(" 5) Exit");
            System.out.print(" >>>");
            choice = keyboard.nextInt();
            keyboard.nextLine();

            // DEPOSIT 
            if (choice == 1) {
                System.out.print("Would you like to deposit money to your Checkings or Savings?: ");
                option = keyboard.nextLine().toUpperCase();

                //(Checkings) users[count-2];
                //(Savings) users[count-1];

                switch (option) {
                    case "SAVINGS":
                        System.out.println("\nDepositing to Savings...");
                        System.out.print("Please enter amount you are depositing: $");
                        depositAmount = keyboard.nextDouble();
                        deposits(depositAmount, option);
                        break;

                    case "CHECKINGS":
                        System.out.println("\nDepositing to Checkings...");
                        System.out.print("Please enter amount you are depositing: $");
                        depositAmount = keyboard.nextDouble();
                        deposits(depositAmount, option);
                        break;

                }
                System.out.println("Current amount in checkings after deposit "
                        + currency.format(((Checkings) users[count - 2]).getTotalCheckingsAmount()));
                System.out.println("Current amount in savings after deposit "
                        + currency.format(((Savings) users[count - 1]).getTotalSavingsAmount()));

            }
            // WITHDRAW 
            else if (choice == 2) {
                System.out.print("Would you like to withdraw money from your Checkings or Savings?: ");
                option = keyboard.nextLine().toUpperCase();

                switch (option) {
                    //(Checkings) users[count-2];
                    //(Savings) users[count-1];
                    case "SAVINGS":
                        System.out.println("\nWithdrawing from Savings...");
                        System.out.print("Please enter amount you are withdrawing: $");
                        withdrawAmount = keyboard.nextDouble();
                        withdraws(withdrawAmount, option);
                        //savingsAmount -= withdrawAmount;

                        break;

                    case "CHECKINGS":
                        System.out.println("\nWithdrawing from Checkings...");
                        System.out.print("Please enter amount you are withdrawing: $");
                        withdrawAmount = keyboard.nextDouble();
                        withdraws(withdrawAmount, option);
                        //checkingsAmount -= withdrawAmount;

                        break;
                }

                System.out.println("Current amount in checkings after withdraw "
                        + currency.format(((Checkings) users[count - 2]).getTotalCheckingsAmount()));
                System.out.println("Current amount in savings after withdraw "
                        + currency.format(((Savings) users[count - 1]).getTotalSavingsAmount()));

            }
            // TRANSFER 
            else if (choice == 3) {

                System.out.println("\n1) Transfer from Checkings to Savings");
                System.out.println("2) Transfer from Savings to Checkings");
                System.out.print("Please choose from the following options above: ");
                choice2 = keyboard.nextInt();

                switch (choice2) {
                    case 1:
                        System.out.println("\nTransfering from Checkings to Savings... ");
                        System.out.print("Please enter amount of money you will be transferring: $");
                        transferAmount = keyboard.nextDouble();
                        moneyTransfer(transferAmount, choice2);
                        break;

                    case 2:
                        System.out.println("\nTransfering from Savings to Checkings... ");
                        System.out.print("Please enter amount of money you will be transferring: $");
                        transferAmount = keyboard.nextDouble();
                        moneyTransfer(transferAmount, choice2);
                        break;
                }
                System.out.println("Current amount in checkings after transfer "
                        + currency.format(((Checkings) users[count - 2]).getTotalCheckingsAmount()));
                System.out.println("Current amount in savings after transfer "
                        + currency.format(((Savings) users[count - 1]).getTotalSavingsAmount()));

            } else if (choice == 4) { //View Acc Detail
                System.out.println("\nAccount Details: ");
                System.out.println("\n Current balance in Checkings: "
                        + currency.format(((Checkings) users[count - 2]).getTotalCheckingsAmount()));
                System.out.println(" Current balance in Savings: "
                        + currency.format(((Savings) users[count - 1]).getTotalSavingsAmount()));
                System.out.printf(" Monthly Fees: " + currency.format(accTypeFees(accType)));
                System.out.println();

            } else {
                System.out.println("Exiting...");
                System.exit(0);
            }

        } while (true);

        
    }

    //determine fees from type of account
    public static double accTypeFees(String accType) {
        /*
        double monthlyFees;
        StudentAcc studentAccount = new StudentAcc();
        BusinessAcc businessAccount = new BusinessAcc();
        */
        if (accType.equalsIgnoreCase("Student")) {
            return 0.99;
        } else if (accType.equalsIgnoreCase("Business")) {
            return 7.99;
        } else {
            return 4.99;
        }

    }

    /* DEPOSIT METHOD */
    public static void deposits(double depositAmount, String option) {
        if (option.equalsIgnoreCase("CHECKINGS")) {
            ((Checkings) users[count - 2]).checkingsDeposit(depositAmount);
        } else if (option.equalsIgnoreCase("SAVINGS")) {
            ((Savings) users[count - 1]).savingsDeposit(depositAmount);
        }

    }

    /* WITHDRAW METHOD */
    public static void withdraws(double withdrawAmount, String option) {
        if (option.equalsIgnoreCase("CHECKINGS")) {
            ((Checkings) users[count - 2]).checkingsWidthraw(withdrawAmount);
        } else if (option.equalsIgnoreCase("SAVINGS")) {
            ((Savings) users[count - 1]).savingsWidthraw(withdrawAmount);
        }
    }

    /* TRANSFER METHOD */
    public static void moneyTransfer(double transferAmount, int choice2) {

        switch (choice2) {
            case 1: // Transfer from Checkings to Savings
                if (transferAmount >= ((Checkings) users[count - 2]).getTotalCheckingsAmount())
                    System.out.println("\nYou do not have enough money in your checkings...");
                else {
                    ((Checkings) users[count - 2]).checkingsWidthraw(transferAmount);
                    ((Savings) users[count - 1]).savingsDeposit(transferAmount);
                    System.out.println("\nTransfer Successful!");
                }
                break;
            case 2:
                if (transferAmount >= ((Savings) users[count - 1]).getTotalSavingsAmount()) {
                    System.out.println("\nYou do not have enough money in your checkings...");
                }
                else{
                    ((Savings) users[count - 1]).savingsWidthraw(transferAmount);
                    ((Checkings) users[count - 2]).checkingsDeposit(transferAmount);
                    System.out.println("\nTransfer Successful!");
                }
                break;

        }

    }







}
                
