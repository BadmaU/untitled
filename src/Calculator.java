import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.RuntimeException;

public class Calculator {


    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String calculation = in.nextLine();



        String[] blocks = calculation.split("");

        try {
            if (ArabicNumber.isInputValueIsNumber(blocks[0]) && ArabicNumber.isInputValueIsNumber(blocks[2]) && operations.isInputOperationIsCorrect(blocks[1])) {
                //System.out.print(blocks[0] + blocks[1] + blocks[2] + "=");
                System.out.println(ArabicNumber.calculateArabicNumber(blocks[0], blocks[2], blocks[1]));
            } else if (RomanNumber.isInputValueIsNumber(blocks[0]) && RomanNumber.isInputValueIsNumber(blocks[2]) && operations.isInputOperationIsCorrect(blocks[1])) {
                //System.out.print(blocks[0] + blocks[1] + blocks[2] + "=");
                if (RomanNumber.calculateRomanNumbers(blocks[0], blocks[2], blocks[1]) != null)
                    System.out.println(RomanNumber.calculateRomanNumbers(blocks[0], blocks[2], blocks[1]));
            } else throw new Exception();
        } catch (Exception e) {
            System.out.println("Ошибка!");
        } finally {
            System.out.println("Программа завершена.");
        }

        in.close();
    }
}
