import java.util.ArrayList;

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
               ", Holder: " + accountHolder +
               ", Balance: " + balance;
    }
}
public class Bank_7 {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account " + account.getAccountNumber() + " added.");
    }
    public void removeAccount(String accountNumber) {
        accounts.removeIf(acc -> acc.getAccountNumber().equals(accountNumber));
        System.out.println("Account " + accountNumber + " removed.");
    }
    public void showAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the bank.");
        } else {
            for (Account acc : accounts) {
                System.out.println(acc);
            }
        }
    }
    public static void main(String[] args) {
        Bank_7 bank = new Bank_7();
        Account acc1 = new Account("101", "Alice", 1000);
        Account acc2 = new Account("102", "Bob", 2000);

        bank.addAccount(acc1);
        bank.addAccount(acc2);
        acc1.deposit(500);
        acc2.withdraw(700);

        bank.showAccounts();
        bank.removeAccount("101");
        bank.showAccounts();
    }
}
