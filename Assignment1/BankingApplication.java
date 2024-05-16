public class BankingApplication {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("Sa123",1000,5);
        CurrentAccount c1 = new CurrentAccount("Ca123",3000,1000);
        s1.deposit(500);
        s1.withdraw(200);
        c1.deposit(1000);
        c1.withdraw(2500);

        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + s1.getAccountNumber());
        System.out.println("Balance: $" + s1.getBalance());

        System.out.println("\nCurrent Account Details:");
        System.out.println("Account Number: " + c1.getAccountNumber());
        System.out.println("Balance: $" + c1.getBalance());
    }
}
abstract class Account{
    private String accountNum;
    private double balance;

    Account(String accountNum,double balance){
        this.accountNum=accountNum;
        this.balance=balance;
    }

    public String getAccountNumber() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingsAccount extends Account{
    private double interestRate;

    SavingsAccount(String accountNum,double balance,double interestRate){
        super(accountNum,balance);
        this.interestRate=interestRate;
    }

    void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }
    public void deposit(double amount) {
        double interest = amount * (interestRate / 100);
        super.deposit(amount+interest);
    }

    public void withdraw(double amount){
        if(getBalance()>=amount){
            super.withdraw(amount);
        }
        else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

class CurrentAccount extends Account{
    private double overDraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overDraftLimit) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverdraftLimit() {
        return overDraftLimit;
    }

    public void deposit(double amount) {
        super.deposit(amount);
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= -overDraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Exceeds overdraft limit. Withdrawal not allowed.");
        }
    }
}