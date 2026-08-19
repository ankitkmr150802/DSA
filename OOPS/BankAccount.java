public class BankAccount{
    private String accountNumber;
    private double balance;

    BankAccount(String AccountNumber, double balance){
        this.accountNumber = AccountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        if( balance >= 0){
            this.balance = balance;
        }
        
    }
    public void deposit(double amount){
        if( amount <= 0){
            System.out.println("Please enter valid amount");
            return;
        }
        this.balance += amount;
        
    }

    public void withdraw(double amount){
        if( amount <= 0 || amount > this.balance){
            System.out.println("Please enter valid amount");
            return;
        }
        this.balance -= amount;
        
    }
}


class SavingAccount extends BankAccount{
    private double interestRate;

    SavingAccount(String AccountNumber, double balance, double interestRate){
        super( AccountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void addInterest(){
        double interest = getInterestRate() * interestRate;
        deposit(interest);
    }
}
