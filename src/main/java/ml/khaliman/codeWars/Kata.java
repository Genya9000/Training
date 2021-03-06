package ml.khaliman.codeWars;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int result = 0;
        String shortWord = Arrays.stream(words).min((s1, t1) -> s1.length() - t1.length()).get();
        result = shortWord.length();
        return result;
    }

    public static String expandedForm(int num) {
        String result = null;
        List<Integer> nums = new ArrayList<>();
        while (num != 0) {
            nums.add(num % 10);
            num /= 10;
        }
        Collections.reverse(nums);
        Integer[] res = (Integer[]) nums.toArray();
        for (int i = 0; i < res.length; i++) {
            double resDouble = (double) res[i];
            resDouble *= Math.pow(10, res.length - 1 - i);
            res[i] = (int) resDouble;
        }
        res = (Integer[]) Arrays.stream(res).filter(x -> x != 0).toArray();
        for (int i = 0; i < res.length; i++) {
            result += Integer.toString((Integer) res[i]) + " + ";
        }
        return result.substring(0, result.length() - 3);
    }

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder result = new StringBuilder("(" + numbers[0] + numbers[1] + numbers[2] +")"
        + " " + numbers[3] + numbers[4] +numbers[5] + "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9]);

        return result.toString();
    }
    public static char findMissingLetter(char[] array)
    {
        char expectableLetter = array[0];
        for(char letter : array){
            if(letter != expectableLetter) break;
            expectableLetter++;
        }
        return expectableLetter;
    }
    public static String Factorial(int n) {

        BigInteger result = BigInteger.valueOf(1);
        for (  int i = 1; i <=n; i ++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return String.valueOf( result);
    }

    public static String longToIP(long ip) {

        StringBuilder rezult = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            rezult = rezult.append((ip >> (32 - (8 * i))) & 0xff).append(".");
        }
        rezult.deleteCharAt(rezult.length() - 1);
        return rezult.toString(); // do it!
    }

    public static long nextBiggerNumber(long n) /*{
        long result = -1;
        ArrayList<Long> array = new ArrayList<>();
        do {
            array.add(n % 10);
            n /= 10;
        } while (n > 0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > array.get(i + 1)) {
                long test = array.get(i);
                array.set(i, array.get(i + 1));
                array.set(i + 1, test);
                Collections.reverse(array);
                result = 0;
                for (int j = 0; j < array.size(); j++) {
                    result += array.get(j)*Math.pow(10, (array.size()-1-j));
                }
                break;
            }
        }
        return result;
    }*/
    {
        char [] s = String.valueOf(n).toCharArray();
        for(int i = s.length - 2; i >= 0; i--){
            for (int j = s.length-1; j > i; j--){
                if(s[i] < s[j]){
                    char tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                    Arrays.sort(s, i+1, s.length);
                    return Long.valueOf(String.valueOf(s));
                }
            }
        }
        return -1;
    }
}
