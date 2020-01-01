package ml.khaliman.codeWars;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        /*   int result = 0;
        char[] resultChar = Integer.toString(num).toCharArray();
        int[] resultInt = new int[resultChar.length];
        for (int i = 0; i <resultChar.length ; i++) {
            resultInt[i] = Character.getNumericValue(resultChar[i]);
        }
            resultInt = Arrays.stream(resultInt).sorted().toArray();
        for (int i = 0; i <resultInt.length ; i++) {
            result += resultInt[resultInt.length-1-i]*(Math.pow(10, (resultInt.length-1-i)));
        }

       return result;*/


        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }
}
