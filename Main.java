
/*
 * Bank System where it allows user to create a bank account
 *  options: deposit, withdraw, transfer, etc.
 *
 * 
 * author @Johdie03
 * Version 1.0
 */
import java.util.Scanner;

public class Main {
    static BankSystem[] users = new BankSystem[50];
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Declaring Variables
        String name, password, email, address, birthday;
        double checkingsAmount = 0, savingsAmount = 0;
        double depositAmount=0;
        int ssn;
        int choice = 0, count = 0, choice2=0;
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
                System.out.print("Social Security (last 4 digits) ");
                ssn = keyboard.nextInt();

                //String name, String email, String password, String address, String birthday, int ssn,
                //double checkingsAmount
                users[count++] = new Checkings(name, email, password, address, birthday, ssn, checkingsAmount);

                //String name, String email, String password, String address, String birthday, int ssn,
                //double savingsAmount
                users[count++] = new Savings(name, email, password, address, birthday, ssn, savingsAmount);
                System.out.println("Account Created!");
            }

                else if (choice == 2) {
                    System.out.println(""); //get information about monthly fees
                
                }

                else if (choice ==3 ){
                    System.out.println("Exiting...");
                    System.exit(0);
                }

                else{
                    System.out.println("ERROR: Please enter 1-3 from the options stated");
                }

                
                System.out.println("\nWhat would you like to do with your account? ");
                keyboard.nextLine();

                do{
                System.out.println("\nPlease pick from the following options below: ");
                System.out.println(" 1) Deposit Money"); //ask whether checkings or savings
                System.out.println(" 2) Withdraw Money"); //ask whether checkings or savings
                System.out.println(" 3) Transfer Money"); 
                System.out.println(" 4) View Account's Details");
                System.out.println(" 5) Exit");
                System.out.print(" >>>");
                choice = keyboard.nextInt();
                keyboard.nextLine();
                 
                if (choice == 1) {
                    System.out.print("Would you like to deposit money to your Checkings or Savings: ");
                    option = keyboard.nextLine().toUpperCase();

                    switch (option) {
                        case "SAVINGS":
                            System.out.println("\nDepositing to Savings...");
                            System.out.print("Please enter amount you are depositing: $");
                            depositAmount = keyboard.nextDouble();
                            savingsAmount += depositAmount;
                            break;

                        case "CHECKINGS":
                            System.out.println("\nDepositing to Checkings...");
                            System.out.print("Please enter amount you are depositing: $");
                            depositAmount = keyboard.nextDouble();
                            checkingsAmount += depositAmount;
                            break;
                    }
                    System.out.println("Current amount in checkings after deposit $" + checkingsAmount);
                    System.out.println("Current amount in savings after deposit $" + savingsAmount);
                }
                else if (choice == 2) {

                }
                else if (choice == 3) {

                }
                else if (choice == 4) {

                }
                else{
                    break;
                }
                


            } while (true);
            
    }




    }
