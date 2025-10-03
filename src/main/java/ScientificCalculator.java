import java.util.Scanner;

public class ScientificCalculator {
    // Factorial function using recursion
    static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number for factorial!");
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int squareRoot(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        return (int) Math.sqrt(n);
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

            switch (choice) {
                case 1:
                    System.out.print("Enter number x for √x: ");
                    double input = sc.nextDouble();
                    if (input < 0) {
                        System.out.println("Square root of negative number is not defined for real numbers.");
                    } else {
                        System.out.println("√" + input + " = " + Math.sqrt(input));
                    }
                    break;
                case 2:
                    System.out.print("Enter integer x for x!: ");
                    int fx = sc.nextInt();
                    try {
                        System.out.println(fx + "! = " + factorial(fx));
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter number x for ln(x): ");
                    double lx = sc.nextDouble();
                    if (lx <= 0) {
                        System.out.println("ln(x) is defined only for x > 0.");
                    } else {
                        System.out.println("ln(" + lx + ") = " + Math.log(lx));
                    }
                    break;
                case 4:
                    System.out.print("Enter number x (base): ");
                    double x = sc.nextDouble();
                    System.out.print("Enter number b (exponent): ");
                    double b = sc.nextDouble();
                    System.out.println(x + "^" + b + " = " + Math.pow(x, b));
                    break;
                case 5:
                    System.out.println("Exiting calculator. Byeeeee bro!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Choose between 1-5.");
            }
            System.out.println("----------------------------------");
        }
    }
}
//testing webhook
// test webhook working
