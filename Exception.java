public class AssignmentException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.println("Welcome to your saving bank account !");
        System.out.println("Your current balance is : 20000");
        System.out.println("Enter the amount you want to withdraw: ");
        double WD = sc.nextDouble();
        double balance = sc.nextDouble();
        double deposit = sc.nextDouble();

        if (WD > 20000) {
            try {
                throw new InsufficientBalanceException();
            } catch (InsufficientBalanceException e) {
                System.out.println("Your balance is very low " + e);
            }
        }
            if (WD < 0) {
                   try {
                    throw new IllegalBankTransactionException();
                } catch (IllegalBankTransactionException e) {
                    System.out.println("Do not enter the negative value " + e);
                }
            }
        System.out.println("Transaction is done !!!");
    }
}
class InsufficientBalanceException extends Exception{
    @Override
    public String getMessage() {
        return "Insufficient Balance !!!";
    }
}

class IllegalBankTransactionException extends Exception{
    @Override
    public String getMessage() {
        return "Negative Amount !!!";
    }
}