/* Create a class named “Calculator” with the following 
methods: 
  Add (int a, int b) – return the sum of a and b 
  Subtract (int a, int b) – return the difference of a 
and b 
  multiply (int a, int b) – return the product of a and b 
  divide (int a, int b) – return the quotient of a devide 
by b*/
import java.util.Scanner;

public class l2_pro12 {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) 
    {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number :: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number :: ");
        int b = scanner.nextInt();

        l2_pro12 calculator = new l2_pro12();

        System.out.println("Addition: " + calculator.add(a, b));
        System.out.println("Subtraction: " + calculator.subtract(a, b));
        System.out.println("Multiplication: " + calculator.multiply(a, b));
        System.out.println("Division: " + calculator.divide(a, b));

        scanner.close();
    }
}
