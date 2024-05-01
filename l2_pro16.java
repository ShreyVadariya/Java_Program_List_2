
/*Get user input using the Scanner class to ask for the user’s 
name, age and favorite color. Use String.format() to print 
out a message that includes those values in a formatted 
string */
import java.util.Scanner;

public class l2_pro16 {

    public static void main(String[] args) 
    {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();

        String message = String.format("Hello, %s! You are %d years old, and your favorite color is %s.", name, age,
                favoriteColor);
        System.out.println(message);

        scanner.close();
    }
}