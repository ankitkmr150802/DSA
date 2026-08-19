import java.util.Scanner;

public class UPIDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String paymentType = sc.next();
        String transactionId = sc.next();

        PaymentMethod pay = null;
        // boolean status = false;

        if(paymentType.equalsIgnoreCase("Credit")){
            String cardNumber = sc.next();
            String cvv = sc.next();
            pay = new CreditCardPayment(transactionId, cardNumber, cvv);
            

        }
        else if(paymentType.equalsIgnoreCase("UPI")){
            String upiId = sc.next();
            pay = new UPIPayment(transactionId, upiId);
        }
        double amount = sc.nextDouble();


        if(pay != null && pay.processPayment(amount)){
            System.out.println("Transaction "+ pay.getTransactionId()+ " Successful.");
        }
        else{
                System.out.println("Invalid Payment Details.");
                System.out.println("Transaction "+ pay.getTransactionId()+ " Failed.");
            }

        sc.close();
    }
}
