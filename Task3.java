import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        BankAccountCheck userAccount = new BankAccountCheck( 1000);
       ATM atm = new ATM(userAccount);
       atm.start();

    }
}

class BankAccountCheck {
    private BankAccountCheck account;
    private Scanner scanner;
    private double balance;
    
    public BankAccountCheck(double initialBalance) {
        balance = initialBalance;

    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Money Deposit : "+ amount);
        } else {
            System.out.println("Invalid Amount !");
        }
    }
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Money is Withdraw..");
        } else {
            System.out.println("Insufficient funds... ");
        }
    }
}
class ATM {
    private BankAccountCheck account;
    private Scanner scanner;

    public ATM(BankAccountCheck account) {
        this.account = account;
        scanner = new Scanner (System.in);
    
}

    public void showMenu() {
        System.out.println("\n********** WELCOME TO ATM **********");
        System.out.println("   ATM MENU : ");
        System.out.println("1. CHECK BALANCE");
        System.out.println("2. DEPOSIT CASH");
        System.out.println("3. WITHDRAW CASH");
        System.out.println("4. EXIT");
    }
       public void start() {
        int choice;
        do {
            showMenu();
            System.out.print("Enter Your Choice :");
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Exiting ATM. THANK YOU......");
                    break;
                default:
                    System.out.println("invalid choice please select right option..");

            }
         } while(choice != 4);
    } 
    private void checkBalance() {
        System.out.println("Current Balance: "+account.getBalance());
    }
    private void deposit() {
        System.out.println("Enter Deposit Amount: ");
        double amount = scanner.nextDouble();
        account.deposit(amount); 
    }   
    private void withdraw() {
        System.out.print("Enter the withdrawal amount : ");
        double amount = scanner. nextDouble();
        account.withdraw(amount);
    }
    }
