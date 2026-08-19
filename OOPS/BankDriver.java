import java.util.*;

public class BankDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accountNumber = sc.next();
        double balance = sc.nextDouble();
        double interest = sc.nextDouble();

        //deposit and withdraw amount
        double depositAmount = sc.nextDouble();
        double withdrawalAmount = sc.nextDouble();
        SavingAccount account = new SavingAccount(accountNumber, balance, interest);
        double curr = account.getBalance();
        System.out.println("Account balance: "+curr);

        account.deposit(depositAmount);
        System.out.println("Balance after deposit: "+ account.getBalance());

        account.withdraw(withdrawalAmount);
        System.out.println("Balance after withdrawal: "+ account.getBalance());

        account.addInterest();
        System.out.println("Final Balance after Interest: "+ account.getBalance());






        sc.close();
    }
}
