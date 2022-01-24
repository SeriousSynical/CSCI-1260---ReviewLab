import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Initializing Fields
        boolean flag;
        double double1 = 0;
        double double2 = 0;

        // Initializing Objects
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        Calculator calc3 = new Calculator();
        Calculator calc4 = new Calculator();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Choose two numbers to perform our operations on.");

        flag = true;
        do {

            try {

                System.out.print("First Number: ");
                double1 = Double.parseDouble(keyboard.nextLine());
                flag = false;

            } catch (Exception e) {

                System.out.println("Invalid input.");

            }

        } while (flag);

        flag = true;
        do {

            try {

                System.out.print("Second Number: ");
                double2 = Double.parseDouble(keyboard.nextLine());
                flag = false;

            } catch (Exception e) {

                System.out.println("Invalid Input.");

            }

        } while (flag);

        calc1.add(double1, double2);
        calc2.multiply(double1, double2);
        calc3.subtract(calc2.getResult(), calc1.getResult());
        calc4.square(calc3.getResult());

        System.out.println();
        System.out.println(double1 + " + " + double2 + " = " + calc1.getResult());
        System.out.println(double1 + " x " + double2 + " = " + calc2.getResult());
        System.out.println(calc2.getResult() + " - " + calc1.getResult() + " = " + calc3.getResult());
        System.out.println(calc3.getResult() + "² = " + calc4.getResult());

    }
}
