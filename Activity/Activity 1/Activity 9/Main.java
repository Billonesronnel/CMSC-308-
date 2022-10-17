import ronnel.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator basicCalculator = new Calculator();

        int y;
        boolean quit = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Select operation");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Division");
            System.out.println("[5] Quit");

            y = sc.nextInt();

            if (y == 1) {
                float addends1;
                float addends2;
                float sum;
                System.out.println("Enter first addends");
                addends1 = sc.nextFloat();
                System.out.println("Enter second addends");
                addends2 = sc.nextFloat();
                sum = basicCalculator.addition(addends1, addends2);
                System.out.println("The sum of " + addends1 + " and " + addends2 + "is: " + sum);
            } else if (y == 5) {
                quit = true;
                System.out.println("Thank you!");
            } else {
                System.out.println("");


                switch (y) {
                    case 2:
                        float minuend;
                        float subtrahend;
                        float difference;
                        System.out.println("Enter first minuend");
                        minuend = sc.nextFloat();
                        System.out.println("Enter second subtrahend");
                        subtrahend = sc.nextFloat();
                        difference = basicCalculator.subtraction(minuend, subtrahend);
                        System.out.println("The difference of " + minuend + " and " + subtrahend + "is: " + difference);
                        break;

                    case 3:
                        float factor;
                        float factor2;
                        float product;
                        System.out.println("Enter first factor");
                        factor = sc.nextFloat();
                        System.out.println("Enter second factor");
                        factor2 = sc.nextFloat();
                        product = basicCalculator.multiplication(factor, factor2);
                        System.out.println("The product of " + factor + " and " + factor2 + "is: " + product);
                        break;

                    case 4:
                        float dividend;
                        float divisor;
                        float quotient;
                        System.out.println("Enter first dividend");
                        dividend = sc.nextFloat();
                        System.out.println("Enter second divisor");
                        divisor = sc.nextFloat();
                        quotient = basicCalculator.division(dividend, divisor);
                        System.out.println("The quotient of " + dividend + " and " + divisor + "is: " + quotient);
                        break;
                }

            }
        } while (y >= 6);
    }
}

