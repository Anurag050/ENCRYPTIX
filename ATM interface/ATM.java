//It is a library of the java
import java.util.Scanner;
//ATM class
public class ATM{
    //Instance of User Bank Account
    private final BankAccount account;
    Scanner scn = new Scanner(System.in);//Scanner Function
     
    //Constructor to initialize ATM with account
    public ATM(BankAccount account){
            this.account = account;
    }
    //Display the Menu of ATM(Start function)
    public void start(){
        //Here we use do while loop for the display of the Menu.
        do { 
            System.out.println("----------ATM INTERFACE----------");
            System.out.println("\n1: Check Balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Exit");
            System.out.println("Please choose any option");
            
            int choice = scn.nextInt();
            //Some of the cases choosen by the user i.e., Balance Check, deposit, etc..
            switch(choice){

                case 1 -> CheckBalance();//Check Balance fucntion

                case 2 -> deposit();//Deposit function

                case 3 -> Withdraw();//Withdraw function

                case 4 -> {
                    System.out.println("Thank you! Have A Nice Day.");//Exit 
                    return;
                }
                        
                default -> System.out.println("Invalid Option! Please choose the correct Option: ");
            }
            //if you choose any other case rather than these..
                    } while (true);            
    }
    //Fucntion for Checking of balance
    private void CheckBalance(){
        System.out.println("Current Balance is: Rs." + account.getBalance());
    }

    //Function for deposit of money in account
    private void deposit(){
        System.out.println("Enter the amount To Deposit: Rs.");
        double amount = scn.nextDouble();
        account.deposit(amount);
        System.out.println("Your New Balance is: Rs." +account.getBalance());
    }

    //Function for withdraw of money from account
    private void Withdraw(){
        System.out.println("Enter the amount To Withdraw: Rs.");
        double amount = scn.nextDouble();
        account.withdraw(amount);
        System.out.println("Your New Balance is: Rs." + account.getBalance());
    }

    //Driver file for starting the ATM
    public static void main(String[] args) {
        //Creating bank account of user with some money 
        BankAccount account = new BankAccount(50000);
        //Creating an object atm with user account.
        ATM atm = new ATM(account);
        atm.start();
    }
}
