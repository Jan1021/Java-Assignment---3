import java.util.Scanner;

public class AssignmentException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
      int b = sc.nextInt();
       try {
                int div = (a / b);
                System.out.println(div);
            }
            catch (ArithmeticException e){
                System.out.println("\n ArithmeticException" + e);
            }
                System.out.println("Exit!");
            }
    }
