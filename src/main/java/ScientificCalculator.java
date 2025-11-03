import java.util.Scanner;
//
public class ScientificCalculator {
    
    // Square root function
    public static double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root of negative number is undefined");
        }
        return Math.sqrt(x);
    }
    
    // Factorial function using recursion
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of negative number is undefined");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    // Natural logarithm function
    public static double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural log is defined only for positive numbers");
        }
        return Math.log(x);
    }
    
    // Power function
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    // Display menu
    static void printMenu() {
        System.out.println("==== Scientific Calculator ====");
        System.out.println("1. Square Root (√x)");
        System.out.println("2. Factorial (x!)");
        System.out.println("3. Natural Logarithm (ln(x))");
        System.out.println("4. Power (x^b)");
        System.out.println("5. Exit");
        System.out.print("Select an option (1-5): ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            printMenu();
            int choice = sc.nextInt();
            
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter number x for √x: ");
                        double sqrtInput = sc.nextDouble();
                        System.out.println("√" + sqrtInput + " = " + squareRoot(sqrtInput));
                        break;
                        
                    case 2:
                        System.out.print("Enter integer x for x!: ");
                        int factInput = sc.nextInt();
                        System.out.println(factInput + "! = " + factorial(factInput));
                        break;
                        
                    case 3:
                        System.out.print("Enter number x for ln(x): ");
                        double logInput = sc.nextDouble();
                        System.out.println("ln(" + logInput + ") = " + naturalLog(logInput));
                        break;
                        
                    case 4:
                        System.out.print("Enter number x (base): ");
                        double base = sc.nextDouble();
                        System.out.print("Enter number b (exponent): ");
                        double exponent = sc.nextDouble();
                        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
                        break;
                        
                    case 5:
                        System.out.println("Exiting calculator. Byeeeee bro!");
                        sc.close();
                        return;
                        
                    default:
                        System.out.println("Invalid option. Choose between 1-5.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                sc.nextLine(); // Clear buffer
            }
            
            System.out.println("----------------------------------");
        }
    }
}
