package ml.khaliman.codeWars;
import java.util.*;

public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int result = 0;
        String shortWord = Arrays.stream(words).min((s1, t1) -> s1.length() - t1.length()).get();
        result = shortWord.length();


        return result;
    }
    public static String expandedForm(int num)
    {
        List<Integer> nums = new ArrayList<>();
        while (num != 0) {
            nums.add(a % 10);
            num /= 10;
        }
        Collections.reverse(nums);


        return "";
    }
}
