public class AssignmentException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int div = (a / b);
        System.out.print("The value after divide " + a + "/" + b + " is: " + div);
        if(div == 0) {
            try {
                throw new UnsupportedOperationException();
            } catch (UnsupportedOperationException e) {
                System.out.println("\n ArithmeticException" + e);
            }
        }
        System.out.println("\n Done !!! ");
    }
}
class UnsupportedOperationException extends Exception{
    @Override
    public String getMessage() {
        return "Unsupported Operation !!";
    }
}
