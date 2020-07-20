import java.util.Arrays;

public class RomanNumber extends ArabicNumber
{
    static String[] romanNums = new String [] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    static int lenNums = romanNums.length;

    public static boolean isInputValueIsNumber (String value)
    {
        return Arrays.asList(romanNums).contains(value);
    }

    static String calculateRomanNumbers (String value1, String value2, String operator) {
        for (int i = 0; i < lenNums; i++) {
            if ( i == 10)
                break;
        }
        String value1toArabic = Integer.toString(Arrays.binarySearch(romanNums, value1) + 1);
        String value2toArabic = Integer.toString(Arrays.binarySearch(romanNums, value2) + 1);

        int resultArabic = calculateArabicNumber(value1toArabic, value2toArabic, operator);

        String result = null;

        return result;
    }

    public static int findIndex(String[] list, String value)
    {
        int len = list.length;
        int index = 0;
        for (int i=0; i < len; i++) {
            if (list[i].equals(value))
                index = i;
        }
        return index;
    }
}
