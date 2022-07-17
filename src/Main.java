import java.util.Scanner;

class Main {
// Function to find the nth Fibonacci number
        public static int fib (int n) {
                if (n <= 1) {
                        return n;
                }
                return fib(n - 1) + fib(n - 2);
        }
        public static void main(String[] args)
        {
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter the nth index number");

                String userNthTerm= myObj.nextLine();  // Read user input

                System.out.println("The Fibonacci number for the " + userNthTerm + "th place index = " + fib(Integer.parseInt(userNthTerm)));
        }
}