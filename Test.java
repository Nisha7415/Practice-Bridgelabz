import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;
import java.util.Random;
public class Test {



        public static void main(String[] args) {
            // Generate random integers between 1 and 10
            Random random = new Random();
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;

            // Generate random arithmetic operator (+, -, *, or /)
            char operator = generateRandomOperator();

            // Perform the operation and calculate the result
            double result = performOperation(num1, num2, operator);

            // Print the equation and result
            System.out.println("Equation: " + num1 + " " + operator + " " + num2);
            System.out.println("Result: " + result);
        }

        private static char generateRandomOperator() {
            char[] operators = {'+', '-', '*', '/'};
            Random random = new Random();
            int index = random.nextInt(operators.length);
            return operators[index];
        }

        private static double performOperation(int num1, int num2, char operator) {
            switch (operator) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    // Check for division by zero
                    if (num2 != 0) {
                        return (double) num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        System.exit(1);
                    }
                default:
                    System.out.println("Error: Invalid operator");
                    System.exit(1);
                    return 0; // This return statement is just to satisfy the compiler; it won't be reached.
            }
        }
    }



//    }







