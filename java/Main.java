public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt(); // Read an integer input

        // Prompt the user for another number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt(); // Read another integer input

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}

