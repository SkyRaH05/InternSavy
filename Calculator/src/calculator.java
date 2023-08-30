import java.util.Scanner;

public class calculator implements Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c ;

        // ************  ENTER FIRST NUMBER  ************
        System.out.println("Enter the value of A: ");
        a = sc.nextDouble();

        // ************  ENTER SECOND NUMBER  ************
        System.out.println("Enter the value of B: ");
        b = sc.nextDouble();

        // ************   ENTER YOUR CHOICE **************
        System.out.println("Enter a valid choice ...\n 1.) A + B \t\t 2.) A - B \n 3.) A * B \t\t 4.) A / B \n \t 5.) A % B");
        int operations = sc.nextInt();
        switch (operations) {
            case 1 -> {
                c = Operations.plus(a, b);
                System.out.println("Result : " + c);
            }
            case 2 -> {
                c = Operations.minus(a, b);
                System.out.println("Result : " + c);
            }
            case 3 -> {
                c = Operations.multiply(a, b);
                System.out.println("Result : " + c);
            }
            case 4 -> {
                c = Operations.divide(a, b);
                System.out.println("Result : " + c);
            }
            case 5 -> {
                c = Operations.modulus(a, b);
                System.out.println("Result : " + c);
            }
            default -> System.out.println("Invalid choice :D\n Please enter a valid choice.!");
        }


    }


}
