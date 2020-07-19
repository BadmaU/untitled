import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.RuntimeException;

public class Calculator {


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        char operation;
        int result;


        System.out.print("Input ");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        System.out.print("Operator");
        operation = scanner.next().charAt(0);

        if (operation == '+') {
            result = number1 + number2;
            System.out.print("Output = " + result);
        } else if (operation == '-') {
            result = number1 - number2;
            System.out.print("Output = " + result);
        } else if (operation == '*') {
            result = number1 * number2;
            System.out.print("Output = " + result);
        } else if (operation == '/') {
            result = number1 / number2;
            System.out.print("Output = " + result);
        } else if(operation != '-','+','*','/') {
            throw new RuntimeException("Программа завершена");
        }



    }
    }
