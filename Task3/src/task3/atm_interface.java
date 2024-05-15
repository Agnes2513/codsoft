package task3;

import java.util.Scanner;
class BankAccount
{
    private double balance;

    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount) 
    {
        balance += amount;
    }

    public boolean withdraw(double amount)
    {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
class ATM 
{
    private BankAccount bankAccount;
    private Scanner scanner;

    ATM(BankAccount account) 
    {
        bankAccount = account;
        scanner = new Scanner(System.in);
    }

    void displayMenu() 
    {
        System.out.println("Choose the option!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

     void processOption(int option) 
    {
        switch (option) 
        {
            case 1:
                withdraw();
                break;
            case 2:
                deposit();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Thank you!");
            default:
                System.out.println("Invalid option");
        }
    }

    private void withdraw() 
    {
        System.out.print("Enter amount you want  to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) 
        {
            System.out.println("Invalid amount.");
            return;
        }
        if (bankAccount.withdraw(amount))
        {
            System.out.println("Withdrawal successful. Remaining balance: " + bankAccount.getBalance());
        } 
        else
        {
            System.out.println("Low balance.");
        }
    }

    private void deposit()
    {
        System.out.print("Enter amount you want to deposit: ");
        double amount = scanner.nextDouble();
        if (amount <= 0)
        {
            System.out.println("Invalid amount.");
            return;
        }
        bankAccount.deposit(amount);
        System.out.println("Deposit successful. New balance: " + bankAccount.getBalance());
    }

    private void checkBalance() 
    {
        System.out.println("Your current balance is: " + bankAccount.getBalance());
    }
}

public class atm_interface
{
    public static void main(String[] args)
    {
       
        BankAccount account = new BankAccount(1000);
        ATM atm = new ATM(account);
        char ch;
        do
        {
            atm.displayMenu();
            System.out.print("Please select the option: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            atm.processOption(option);
            System.out.println("Do you want to continue?");
            ch=scanner.next().charAt(0);
        }while (ch=='y');
    }
}

