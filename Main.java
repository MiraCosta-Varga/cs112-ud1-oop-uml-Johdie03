
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
        int ssn;
        int choice = 0, count = 0;


        /*** TESTER  ***/
        BankSystemTester.main(null);
        


/*
        //Getting info from user 
        //loop through choices first

            System.out.println("Welcome!\n");
            System.out.println("Please get started by choosing an option below \n");
            System.out.println(" 1) Create an account");
            System.out.println(" 2) Obtain information about account fees");
            System.out.println(" 3) Exit");
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
          
*/




    }






    }
