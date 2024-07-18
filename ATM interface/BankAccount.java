//User Bank Account class
public class BankAccount{
    private double balance;
    //It is used to initialize the account with some money
    public BankAccount(double IBalance) {
        balance = IBalance;
    }
    //It is used to store the Current balance
    public double getBalance(){
        return balance;
    }
    //Method for deposit the money in account
    public void deposit(double amount){
        //here we use if else condition because there are two situation either successfull or failed.
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit Successful.");
        }else{
            System.out.println("Inavalid Deposit. ");
        }
    }
    //Method for withdrawal from the account
    public void withdraw(double amount){
        //here we use if else condition because there are two situation either successfull or failed.
        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal Successfull.");
        }else{
            System.out.println("Insufficient amount");
        }
    }
}
