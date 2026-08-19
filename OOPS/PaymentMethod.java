public abstract class PaymentMethod {
    protected String transactionId;

    PaymentMethod(String transactionId){
        this.transactionId = transactionId;
    }

    public String getTransactionId(){
        return transactionId;
    }

    public abstract boolean validate(); //true or false

    public abstract boolean processPayment(double amount); //return success or failure

}

class CreditCardPayment extends PaymentMethod{
    private String cardNumber;
    private String cvv;

    CreditCardPayment(String transactionId, String cardNumber, String cvv){
        super(transactionId);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean validate(){
        if(cardNumber != null && cardNumber.length() == 16 && cvv!= null && cvv.length() == 3) return true;
        return false;
    }

    @Override
    public boolean processPayment(double amount){
        if(validate()){
            System.out.println("Payment Details Validated.");
            System.out.printf("Processing Credit Card payment of $%.2f%n",amount);
            return true;
        }
        return false;
    }

}

class UPIPayment extends PaymentMethod{
    private String upiId;

    UPIPayment(String transactionId, String upiId){
        super(transactionId);
        this.upiId = upiId;
    }


    @Override
    public boolean validate(){
        return upiId != null && upiId.contains("@");
    }

    @Override
    public boolean processPayment(double amount){
        if(validate()){
            System.out.println("Payment Details Validated.");
            System.out.printf("Processing UPI payment of $%.2f%n",amount);
            return true;
        }
        return false;

    }
}
