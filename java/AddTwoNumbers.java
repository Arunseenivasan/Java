

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int number1 = Scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = Scanner.nextInt();

        // Add the two numbers
        int sum = number1 + number2;

        // Display the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

        // Close the scanner
        Scanner.close();
    }
}
 