import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        char operation;
        int result;


        System.out.print("Input ");
        number1 = scanner.nextInt();{
        try{
            Scanner in = new Scanner(System.in);
            if(number1>10){
                throw new Exception("Число должно быть меньше 10");
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");}

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
        }



    }
    }
