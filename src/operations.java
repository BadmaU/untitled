import java.util.Arrays;

class operations {
    public static String[] operations = {"+", "-", "*", "/"};

    public static boolean isInputOperationIsCorrect(String value) {
        return Arrays.asList(operations).contains(value);
    }
}
