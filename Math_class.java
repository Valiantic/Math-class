
import java.util.Scanner;

public class Math_class {
    public static void main(String[] args) {
        Scanner scans = new Scanner(System.in);
        Scanner doublescan = new Scanner(System.in);

        System.out.println("MATH CLASS CONVERSION");
        System.out.println("[1] Compare maximum numbers");
        System.out.println("[2] Compare minumum numbers");
        System.out.println("[3] Make it absolute");
        System.out.println("[4] Find square root");
        System.out.println("[5] Round up");
        System.out.println("[6] Round down");
        int choice = scans.nextInt();
        System.out.println("");

        switch (choice) {
            case 1:

                System.out.println("--COMPARE MAXIMUM NUMBERS--");
                System.out.println("Enter first number");
                double num1 = doublescan.nextDouble();
                System.out.println("Enter second number");
                double num2 = doublescan.nextDouble();

                double z = Math.max(num1, num2);

                System.out.println("The Highest number is " + z);

                break;
            case 2:
                System.out.println("--COMPARE MINIMUM NUMBERS--");
                System.out.println("Enter first number");
                double num3 = doublescan.nextDouble();
                System.out.println("Enter second number");
                double num4 = doublescan.nextDouble();

                double y = Math.min(num3, num4);

                System.out.println("The Lowest number is " + y);

                break;
            case 3:
                System.out.println("--MAKE ABSOLUTE NUMBERS--");
                System.out.println("Enter a negative number");
                double ans = doublescan.nextDouble();

                double abs = Math.abs(ans);

                System.out.println("The Absolute number of " + ans + " is " + abs);
                break;
            case 4:
                System.out.println("--FIND SQUARE ROOT--");
                System.out.println("Enter a number");
                double num = doublescan.nextDouble();

                double sqt = Math.sqrt(num);

                System.out.println("The Square root number of " + num + " is " + sqt);
                break;
            case 5:
                System.out.println("--ROUND UP--");
                System.out.println("Enter a decimal number");
                double rup = doublescan.nextDouble();

                double round = Math.round(rup);

                System.out.println("The Rounded up number of " + rup + " is " + round);
                break;
            case 6:
                System.out.println("--ROUND DOWN--");
                System.out.println("Enter a decimal number");
                double dup = doublescan.nextDouble();

                double rounddown = Math.floor(dup);

                System.out.println("The Rounded down number of " + dup + " is " + rounddown);
                break;
            default:
                System.out.println("System error");
                break;
        }

    }
}
