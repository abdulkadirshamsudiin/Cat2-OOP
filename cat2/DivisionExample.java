// Question 2(B):


import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            // Accept two numbers from user
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();
            
            // Perform division
            int result = num1 / num2;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            // Handle divide by zero
            System.out.println("Cannot divide by zero!");
        }
    }
}
