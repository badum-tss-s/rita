package company;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = first + second;
                break;

                case '-':
                    result = first - second;
                    break;

                    case '*':
                    result = first * second;
                    break;

                case '/':
                    result = first / second;
                    break;

                    default:
                        System.out.println("Error");
                        return;
        }
        System.out.println(first +""+ operator + second+ "="+ result);


    }
}

