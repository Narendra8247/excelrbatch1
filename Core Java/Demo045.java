import java.util.Scanner;

public class Demo045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("\nBefore swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        num1 = num1 + num2; 
        num2 = num1 - num2;
        num1 = num1 - num2; 
        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        scanner.close();
    }
}